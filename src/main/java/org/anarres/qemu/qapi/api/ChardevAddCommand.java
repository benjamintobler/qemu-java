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
 * <p><pre>QApiCommandDescriptor{name=chardev-add, returns=ChardevReturn, data={id=str, backend=ChardevBackend}}</pre></p>
 */
// QApiCommandDescriptor{name=chardev-add, returns=ChardevReturn, data={id=str, backend=ChardevBackend}}
public class ChardevAddCommand extends QApiCommand<ChardevAddCommand.Arguments, ChardevAddCommand.Response> {
	/** Compound arguments to a ChardevAddCommand. */
	public static class Arguments {
		@SerializedName("id")
		@Nonnull
		public java.lang.String id;
		@SerializedName("backend")
		@Nonnull
		public ChardevBackend backend;
	}

	/** Response to a ChardevAddCommand. */
	public static class Response extends QApiResponse<ChardevReturn> {
	}

	/** Constructs a new ChardevAddCommand. */
	public ChardevAddCommand(@Nonnull ChardevAddCommand.Arguments argument) {
		super("chardev-add", Response.class, argument);
	}
}
