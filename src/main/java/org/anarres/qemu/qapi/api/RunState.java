package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=RunState, data=[debug, inmigrate, internal-error, io-error, paused, postmigrate, prelaunch, finish-migrate, restore-vm, running, save-vm, shutdown, suspended, watchdog, guest-panicked], fields=null}
public enum RunState {
	@SerializedName("debug")
	debug,
	@SerializedName("inmigrate")
	inmigrate,
	@SerializedName("internal-error")
	internal_error,
	@SerializedName("io-error")
	io_error,
	@SerializedName("paused")
	paused,
	@SerializedName("postmigrate")
	postmigrate,
	@SerializedName("prelaunch")
	prelaunch,
	@SerializedName("finish-migrate")
	finish_migrate,
	@SerializedName("restore-vm")
	restore_vm,
	@SerializedName("running")
	running,
	@SerializedName("save-vm")
	save_vm,
	@SerializedName("shutdown")
	shutdown,
	@SerializedName("suspended")
	suspended,
	@SerializedName("watchdog")
	watchdog,
	@SerializedName("guest-panicked")
	guest_panicked,
	__UNKNOWN;
}
