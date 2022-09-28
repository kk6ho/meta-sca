SUMMARY = "The strictest and most opinionated python linter ever!"
HOMEPAGE = "https://github.com/wemake-services/wemake-python-styleguide"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dee021f8214bb1b3fd62729a11603bf5"

DEPENDS += "\
    nativesdk-python3-astor \
    nativesdk-python3-attrs \
    nativesdk-python3-cognitive-complexity \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-annotations-complexity \
    nativesdk-python3-flake8-bandit \
    nativesdk-python3-flake8-broken-line \
    nativesdk-python3-flake8-bugbear \
    nativesdk-python3-flake8-builtins \
    nativesdk-python3-flake8-coding \
    nativesdk-python3-flake8-commas \
    nativesdk-python3-flake8-comprehensions \
    nativesdk-python3-flake8-debugger \
    nativesdk-python3-flake8-docstrings \
    nativesdk-python3-flake8-eradicate \
    nativesdk-python3-flake8-executable \
    nativesdk-python3-flake8-isort \
    nativesdk-python3-flake8-logging-format \
    nativesdk-python3-flake8-pep3101 \
    nativesdk-python3-flake8-print \
    nativesdk-python3-flake8-quotes \
    nativesdk-python3-flake8-rst-docstrings \
    nativesdk-python3-flake8-string-format \
    nativesdk-python3-pep8-naming \
    nativesdk-python3-pydocstyle \
    nativesdk-python3-pygments \
    nativesdk-python3-radon \
    nativesdk-python3-typing-extensions \
"

PYPI_PACKAGE = "wemake-python-styleguide"

SRC_URI[md5sum] = "06a384338bb082f7de3de910565fcf95"
SRC_URI[sha256sum] = "c8869fac392019c2bb3eae4287399245d10d2726b23f1b3c68d1564909c3a71a"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-astor \
    nativesdk-python3-attrs \
    nativesdk-python3-cognitive-complexity \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-annotations-complexity \
    nativesdk-python3-flake8-bandit \
    nativesdk-python3-flake8-broken-line \
    nativesdk-python3-flake8-bugbear \
    nativesdk-python3-flake8-builtins \
    nativesdk-python3-flake8-coding \
    nativesdk-python3-flake8-commas \
    nativesdk-python3-flake8-comprehensions \
    nativesdk-python3-flake8-debugger \
    nativesdk-python3-flake8-docstrings \
    nativesdk-python3-flake8-eradicate \
    nativesdk-python3-flake8-executable \
    nativesdk-python3-flake8-isort \
    nativesdk-python3-flake8-logging-format \
    nativesdk-python3-flake8-pep3101 \
    nativesdk-python3-flake8-print \
    nativesdk-python3-flake8-quotes \
    nativesdk-python3-flake8-rst-docstrings \
    nativesdk-python3-flake8-string-format \
    nativesdk-python3-pep8-naming \
    nativesdk-python3-pydocstyle \
    nativesdk-python3-pygments \
    nativesdk-python3-radon \
    nativesdk-python3-stringold \
    nativesdk-python3-typing-extensions \
"