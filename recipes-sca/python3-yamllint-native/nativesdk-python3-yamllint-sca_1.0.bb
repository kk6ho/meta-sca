SUMMARY = "SCA description for yamllint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "nativesdk-python3-yamllint"

PYPI_PACKAGE = "yamllint"

inherit sca-description
inherit_defer nativesdk
do_configure[noexec] = "1"
do_compile[noexec] = "1"
SCA_TOOL_DESCRIPTION = "yamllint"
RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-yamllint"
