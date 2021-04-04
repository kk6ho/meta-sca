SUMMARY = "go.mod: github.com/oklog/run"
HOMEPAGE = "https://pkg.go.dev/github.com/oklog/run"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-oklog-run-sources.inc

GO_IMPORT = "github.com/oklog/run"

inherit gosrc
inherit native
