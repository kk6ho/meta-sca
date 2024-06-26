SRC_URI += "https://proxy.golang.org/gopkg.in/yaml.v2/@v/v2.4.0.zip;srcoutput=gopkg.in/yaml.v2;srcinput=gopkg.in/yaml.v2@v2.4.0;downloadfilename=gopkg-in-yaml-v2-2.4.0.zip;name=gopkg-in-yaml-v2"
SRC_URI[gopkg-in-yaml-v2.sha256sum] = "ede49e27c4cca6cdd2ec719aed8ea4d363710cceb3d411e7a786fbdec0d391fd"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://gopkg.in/yaml.v2/LICENSE.libyaml;md5=d0b68be4a2dc957aaf09144970bc6696 \
    file://gopkg.in/yaml.v2/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "gopkg.in-yaml.v2-sources.inc"

