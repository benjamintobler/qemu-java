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
 * <p><pre>QApiCommandDescriptor{name=system_reset, returns=null, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=system_reset, returns=null, data=null}
public class SystemResetCommand extends QApiCommand<Void, SystemResetCommand.Response> {

	/** Response to a SystemResetCommand. */
	public static class Response extends QApiResponse<Void> {
	}

	/** Constructs a new SystemResetCommand. */
	public SystemResetCommand() {
		super("system_reset", Response.class, null);
	}
}