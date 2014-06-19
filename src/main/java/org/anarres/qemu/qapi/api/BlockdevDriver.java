package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BlockdevDriver, data=[file, host_device, host_cdrom, host_floppy, http, https, ftp, ftps, tftp, vvfat, blkdebug, blkverify, bochs, cloop, cow, dmg, parallels, qcow, qcow2, qed, raw, vdi, vhdx, vmdk, vpc, quorum], fields=null}
public enum BlockdevDriver {
	@SerializedName("file")
	file,
	@SerializedName("host_device")
	host_device,
	@SerializedName("host_cdrom")
	host_cdrom,
	@SerializedName("host_floppy")
	host_floppy,
	@SerializedName("http")
	http,
	@SerializedName("https")
	https,
	@SerializedName("ftp")
	ftp,
	@SerializedName("ftps")
	ftps,
	@SerializedName("tftp")
	tftp,
	@SerializedName("vvfat")
	vvfat,
	@SerializedName("blkdebug")
	blkdebug,
	@SerializedName("blkverify")
	blkverify,
	@SerializedName("bochs")
	bochs,
	@SerializedName("cloop")
	cloop,
	@SerializedName("cow")
	cow,
	@SerializedName("dmg")
	dmg,
	@SerializedName("parallels")
	parallels,
	@SerializedName("qcow")
	qcow,
	@SerializedName("qcow2")
	qcow2,
	@SerializedName("qed")
	qed,
	@SerializedName("raw")
	raw,
	@SerializedName("vdi")
	vdi,
	@SerializedName("vhdx")
	vhdx,
	@SerializedName("vmdk")
	vmdk,
	@SerializedName("vpc")
	vpc,
	@SerializedName("quorum")
	quorum,
	__UNKNOWN;
}
