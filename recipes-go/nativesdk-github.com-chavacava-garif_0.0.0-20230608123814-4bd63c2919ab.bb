SUMMARY = "go.mod: github.com/chavacava/garif"
HOMEPAGE = "https://pkg.go.dev/github.com/chavacava/garif"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-chavacava-garif-sources.inc

GO_IMPORT = "github.com/chavacava/garif"
inherit gosrc
inherit_defer nativesdk
