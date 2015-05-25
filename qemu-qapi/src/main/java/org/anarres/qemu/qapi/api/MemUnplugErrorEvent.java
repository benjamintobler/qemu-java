package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=MEM_UNPLUG_ERROR, data={device=str, msg=str}}</pre>
 */
// QApiEventDescriptor{name=MEM_UNPLUG_ERROR, data={device=str, msg=str}}
public class MemUnplugErrorEvent extends QApiEvent {
	@JsonProperty("device")
	@Nonnull
	public java.lang.String device;
	@JsonProperty("msg")
	@Nonnull
	public java.lang.String msg;
}