package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BiosAtaTranslation, data=[auto, none, lba, large, rechs], fields=null}
public enum BiosAtaTranslation {
	@SerializedName("auto")
	auto,
	@SerializedName("none")
	none,
	@SerializedName("lba")
	lba,
	@SerializedName("large")
	large,
	@SerializedName("rechs")
	rechs,
	__UNKNOWN;
}
