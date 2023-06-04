SRC_URI += "https://proxy.golang.org/cloud.google.com/go/essentialcontacts/@v/v1.5.1.zip;srcoutput=cloud.google.com/go/essentialcontacts;srcinput=cloud.google.com/go/essentialcontacts@v1.5.1;downloadfilename=cloud-google-com-go-essentialcontacts-1.5.1.zip;name=cloud-google-com-go-essentialcontacts"
SRC_URI[cloud-google-com-go-essentialcontacts.sha256sum] = "2252d74b76ce392a2bb20740c5f8ed790d813315f9553c9f9d72a8a82c7b7e18"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/essentialcontacts/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-essentialcontacts-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}