package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=block-job-set-speed, returns=null, data={device=str, speed=int}}</pre></p>
 */
// QApiCommandDescriptor{name=block-job-set-speed, returns=null, data={device=str, speed=int}}
public class BlockJobSetSpeedCommand extends QApiCommand<BlockJobSetSpeedCommand.Arguments, BlockJobSetSpeedCommand.Response> {
	/** Compound arguments to a BlockJobSetSpeedCommand. */
	public static class Arguments {
		@SerializedName("device")
		@Nonnull
		public java.lang.String device;
		@SerializedName("speed")
		@Nonnull
		public long speed;
	}

	/** Response to a BlockJobSetSpeedCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockJobSetSpeedCommand. */
	public BlockJobSetSpeedCommand(@Nonnull BlockJobSetSpeedCommand.Arguments argument) {
		super("block-job-set-speed", Response.class, argument);
	}
}
