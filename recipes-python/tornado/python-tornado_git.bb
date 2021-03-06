SUMMARY = "Tornado is a Python web framework and asynchronous networking library, originally developed at FriendFeed."
SECTION = "devel/python"

HOMEPAGE = "http://www.tornadoweb.org/en/stable/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://github.com/tornadoweb/tornado.git;protocol=https"
#SRCREV = "184d796b67bc151e03fd01696b819519ddb09b82"
SRCREV = "93ae079795f51e23d11a8f7d05fa48ea6bb19cbf"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
