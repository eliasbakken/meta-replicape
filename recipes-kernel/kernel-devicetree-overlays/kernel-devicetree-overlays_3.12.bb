HOMEPAGE = "https://github.com/beagleboard/devicetree-source"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://../../../../LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"

SRC_URI = "git://github.com/eliasbakken/devicetree-source;protocol=git;branch=3.12"
SRCREV = "256bf809af7ca8ca2d0d6aa125c2b3052171e0cd"

S = "${WORKDIR}/git/arch/arm/boot/dts"

do_compile(){
    files=`ls ${S}/*.dts | grep -e BB -e cape -e bone_ -e TT3201 -e DNIL`
    for file in $files
    do 
        basefile=`basename ${file} .dts`
        dtc -I dts -O dtb -o ${basefile}.dtbo -b 0 -@ -I ${basefile}.dts
    done            
}


do_install(){
    install -d ${D}/lib
    install -d ${D}/lib/firmware/
    install -m 0644 ${S}/*.dts ${D}/lib/firmware/
    install -m 0644 ${S}/*.dtbo ${D}/lib/firmware/
}

FILES_${PN} = "\
/lib/firmware/*.dtbo \
/lib/firmware/*.dts \
"

