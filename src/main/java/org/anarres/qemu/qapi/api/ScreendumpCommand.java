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
 * <p><pre>QApiCommandDescriptor{name=screendump, returns=null, data={filename=str}}</pre></p>
 */
// QApiCommandDescriptor{name=screendump, returns=null, data={filename=str}}
public class ScreendumpCommand extends QApiCommand<ScreendumpCommand.Arguments, ScreendumpCommand.Response> {
	/** Compound arguments to a ScreendumpCommand. */
	public static class Arguments {
		@SerializedName("filename")
		@Nonnull
		public java.lang.String filename;
	}

	/** Response to a ScreendumpCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new ScreendumpCommand. */
	public ScreendumpCommand(@Nonnull ScreendumpCommand.Arguments argument) {
		super("screendump", Response.class, argument);
	}
}
