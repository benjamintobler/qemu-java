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
 * <p><pre>QApiCommandDescriptor{name=nbd-server-start, returns=null, data={addr=SocketAddress}}</pre></p>
 */
// QApiCommandDescriptor{name=nbd-server-start, returns=null, data={addr=SocketAddress}}
public class NbdServerStartCommand extends QApiCommand<NbdServerStartCommand.Arguments, NbdServerStartCommand.Response> {
	/** Compound arguments to a NbdServerStartCommand. */
	public static class Arguments {
		@SerializedName("addr")
		@Nonnull
		public SocketAddress addr;
	}

	/** Response to a NbdServerStartCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new NbdServerStartCommand. */
	public NbdServerStartCommand(@Nonnull NbdServerStartCommand.Arguments argument) {
		super("nbd-server-start", Response.class, argument);
	}
}
