SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a70cf540abf41acb644ac3b621b2fad1"

DEPENDS += "\
    python3-native \
    python3-pylazy-object-proxy-native \
    python3-pytest-runner-native \
    python3-typed-ast-native \
    python3-typing-extensions-native \
    python3-wrapt-native \
"

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "5484f8126727748578fde0bee04adaf0"
SRC_URI[sha256sum] = "39fa822c82dc112f5072a208ddf01c58184043aa90e3e469786fa0520c71aaa7"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-math \
    nativesdk-python3-misc \
    nativesdk-python3-pprint \
    nativesdk-python3-pylazy-object-proxy \
    nativesdk-python3-pytest \
    nativesdk-python3-typed-ast \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-wrapt \
"