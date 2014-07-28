meta-replicape
==============

Layer for [&Aring;ngstr&ouml;m](http://angstrom-distrubiton.org)/[OpenEmbedded](http://openembedded.org) to support the Replicape. Inspired by [http://replicape.com] (http://replicape.com) and [http://hipstercircuits.com] (http://hipstercircuits.com)

In the spirit of [OE](http://openembedded.org), whenever possible, recipes will fetch from original sources or SCM rather than the [tarball](http://distros.replicape.com/Replicape_rev_A4-13_11_11.tgz).

Includes (will eventually be submitted to meta-oe):
  * tty0tty -- a Linux null-modem emulator
    * kernel module
    * user application
    * systemd service
  * spimodule -- Python bindings for spi

Pull requests pending (meta-beagleboard):
  * pasm -- a [PRU](http://processors.wiki.ti.com/index.php/Programmable_Realtime_Unit_Subsystem) Assembler
  * libprussdrv -- user space driver library for PRUSS

BSP-layer: 
  * Redeem -- The Replicape Daemon
  * Toggle -- GUI for 3D-printers suitable for embedded platforms. 
  * Octoprint -- The responsive web interface for your 3D printer
  * CuraEngine -- A fast G-code slicer 


Todo: 
- USB babble interrupt occured. (added a patch, not tested) 
  - CAUTION: musb: Babble Interrupt Occurred  - still happening on hotplug
- Toggle: reposition the frog
- Add task-native-sdk? 

- Failed at step EXEC spawning /usr/lib/connman/wired-setup: No such file or directory
- CPU-freq not set properly
- can't open '/var/lib/misc/udhcpd.leases': No such file or directory 
  - touch /var/lib/misc/udhcpd.leases
- iptables support missing error 2 (No such file or directory)
  - opkg upgrade iptables

Add:
- Lighttpd
- web.py
- python-sqlite3
- sqlite3
- flup

Add the following libraries: libgirepository-1.0-1 python-pygobject pango-dev libatk-1.0-dev 

Staged: 
- Add Make
- Add wget
- Add binutils
- Add Python-dev

Done: 
- Change hostname to thing (from emmc.sh?) (ok)
- Add thing feeds (ok) 
- Enable Redeem (ok)
- Enable Toggle (ok) 
- Enable tty0tty (ok)
- Link /usr/lib/libprussdrv.so.1 (in emmc.sh)
- install libprussdrv1 (ok, dependent on pruss)
- Disable TTY login (ok, emmc.sh)
- hardcoded link in libEGL.so (ok, added path in emmc.sh) 
- USB Ethernet does not come up (ok, upgraded to 3.12.9)
- Keyboard config shit (xkeyboard-config?)
- gdk-pixbuf does not load files. 
- pvr does not shut down right. (fixed! hacked the kernel module)
- images on toggle does not load
- emmc script does not complete right.
- g_multi does not load (ok, added usb_f_eem)
- Changed the script on pvr so there is no .sh any more. 
- Date not set properly 
- Modules were missing. Adding "kernel-modules" to image. Is this necessary?





Remember (Will eventually be a part of recipes): 
- Compiling toggle: add the "-B 0x100000" argument to the build/tmp-angstrom_v2013_06-eglibc/sysroots/beaglebone/usr/bin/crossscripts/qemuwrapper
- Compile Cogl first. Requires 2.0. 
- Remove the "tests" from the python-pygobject
- If you get this error when compiling Mash: 
fatal error: glib-object.h: No such file or directory
Added this to the mash_git recipe. CFLAGS_prepend = "-I/usr/include/glib-2.0 "


