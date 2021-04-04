SUMMARY = "go.mod: github.com/imdario/mergo"
HOMEPAGE = "https://pkg.go.dev/github.com/imdario/mergo"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-imdario-mergo-sources.inc

GO_IMPORT = "github.com/imdario/mergo"

inherit gosrc
inherit native
