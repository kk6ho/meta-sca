SRC_URI += "https://proxy.golang.org/cloud.google.com/go/webrisk/@v/v1.8.1.zip;srcoutput=cloud.google.com/go/webrisk;srcinput=cloud.google.com/go/webrisk@v1.8.1;downloadfilename=cloud-google-com-go-webrisk-1.8.1.zip;name=cloud-google-com-go-webrisk"
SRC_URI[cloud-google-com-go-webrisk.sha256sum] = "b21b81641fe3b75e241bdb41a3b65866b2f97b9f06cd4cc2f945c1b2f9b11799"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/webrisk/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-webrisk-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}