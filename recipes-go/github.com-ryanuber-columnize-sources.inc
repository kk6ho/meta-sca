SRC_URI += "https://proxy.golang.org/github.com/ryanuber/columnize/@v/v2.1.2+incompatible.zip;srcoutput=github.com/ryanuber/columnize;srcinput=github.com/ryanuber/columnize@v2.1.2+incompatible;downloadfilename=github-com-ryanuber-columnize-2.1.2+incompatible.zip;name=github-com-ryanuber-columnize"
SRC_URI[github-com-ryanuber-columnize.sha256sum] = "bebbc8b6df223ec9991a8cbec568138723c6250681cc9b822544d30e7f178e3e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/ryanuber/columnize/LICENSE;md5=2dcf22ecbbb7a43c2280f859bdb4bc76 \
"

GOSRC_INCLUDEGUARD += "github.com-ryanuber-columnize-sources.inc"

