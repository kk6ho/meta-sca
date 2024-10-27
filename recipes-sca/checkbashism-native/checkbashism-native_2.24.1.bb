SUMMARY = "check for bashisms in /bin/sh scripts"
HOMEPAGE = "https://salsa.debian.org/debian/devscripts"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=faa39cbd7a7cded9a1436248295de3c2"

DEPENDS += "perl-native"

SRC_URI:append = " \
    http://deb.debian.org/debian/pool/main/d/devscripts/devscripts_${PV}.tar.xz \
    file://checkbashism.sca.description \
"

SRC_URI[sha256sum] = "205122cc0bd28cf3521f80fce87a6efdced83e4ff86c647f4ce018444a2ec52a"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/devscripts-${PV}"
UPSTREAM_CHECK_REGEX = "devscripts_(?P<pver>\d+\.\d+\.\d+)"

inherit sca-description
inherit_defer native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

SCA_TOOL_DESCRIPTION = "checkbashism"

do_install() {
    install -d ${D}${bindir}

    install -m 0755 ${S}/scripts/checkbashisms.bash_completion ${D}${bindir}
    install -m 0755 ${S}/scripts/checkbashisms.pl ${D}${bindir}
    # enforce usage of sysroot perl instead of host sided
    sed -i "s|/usr/bin/perl|/usr/bin/env perl|g" ${D}${bindir}/checkbashisms.pl
}

FILES:${PN} += "${bindir}"

RDEPENDS:${PN}:class-nativesdk += "nativesdk-perl"