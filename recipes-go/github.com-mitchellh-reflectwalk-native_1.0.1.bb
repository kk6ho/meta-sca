SUMMARY = "go.mod: github.com/mitchellh/reflectwalk"
HOMEPAGE = "https://pkg.go.dev/github.com/mitchellh/reflectwalk"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mitchellh-reflectwalk-sources.inc

GO_IMPORT = "github.com/mitchellh/reflectwalk"

inherit gosrc
inherit native
