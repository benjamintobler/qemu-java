package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BlkdebugEvent, data=[l1_update, l1_grow.alloc_table, l1_grow.write_table, l1_grow.activate_table, l2_load, l2_update, l2_update_compressed, l2_alloc.cow_read, l2_alloc.write, read_aio, read_backing_aio, read_compressed, write_aio, write_compressed, vmstate_load, vmstate_save, cow_read, cow_write, reftable_load, reftable_grow, reftable_update, refblock_load, refblock_update, refblock_update_part, refblock_alloc, refblock_alloc.hookup, refblock_alloc.write, refblock_alloc.write_blocks, refblock_alloc.write_table, refblock_alloc.switch_table, cluster_alloc, cluster_alloc_bytes, cluster_free, flush_to_os, flush_to_disk], fields=null}
public enum BlkdebugEvent {
	@SerializedName("l1_update")
	l1_update,
	@SerializedName("l1_grow.alloc_table")
	l1_grow_alloc_table,
	@SerializedName("l1_grow.write_table")
	l1_grow_write_table,
	@SerializedName("l1_grow.activate_table")
	l1_grow_activate_table,
	@SerializedName("l2_load")
	l2_load,
	@SerializedName("l2_update")
	l2_update,
	@SerializedName("l2_update_compressed")
	l2_update_compressed,
	@SerializedName("l2_alloc.cow_read")
	l2_alloc_cow_read,
	@SerializedName("l2_alloc.write")
	l2_alloc_write,
	@SerializedName("read_aio")
	read_aio,
	@SerializedName("read_backing_aio")
	read_backing_aio,
	@SerializedName("read_compressed")
	read_compressed,
	@SerializedName("write_aio")
	write_aio,
	@SerializedName("write_compressed")
	write_compressed,
	@SerializedName("vmstate_load")
	vmstate_load,
	@SerializedName("vmstate_save")
	vmstate_save,
	@SerializedName("cow_read")
	cow_read,
	@SerializedName("cow_write")
	cow_write,
	@SerializedName("reftable_load")
	reftable_load,
	@SerializedName("reftable_grow")
	reftable_grow,
	@SerializedName("reftable_update")
	reftable_update,
	@SerializedName("refblock_load")
	refblock_load,
	@SerializedName("refblock_update")
	refblock_update,
	@SerializedName("refblock_update_part")
	refblock_update_part,
	@SerializedName("refblock_alloc")
	refblock_alloc,
	@SerializedName("refblock_alloc.hookup")
	refblock_alloc_hookup,
	@SerializedName("refblock_alloc.write")
	refblock_alloc_write,
	@SerializedName("refblock_alloc.write_blocks")
	refblock_alloc_write_blocks,
	@SerializedName("refblock_alloc.write_table")
	refblock_alloc_write_table,
	@SerializedName("refblock_alloc.switch_table")
	refblock_alloc_switch_table,
	@SerializedName("cluster_alloc")
	cluster_alloc,
	@SerializedName("cluster_alloc_bytes")
	cluster_alloc_bytes,
	@SerializedName("cluster_free")
	cluster_free,
	@SerializedName("flush_to_os")
	flush_to_os,
	@SerializedName("flush_to_disk")
	flush_to_disk,
	__UNKNOWN;
}
