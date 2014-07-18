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
 * <p><pre>QApiCommandDescriptor{name=query-version, returns=VersionInfo, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-version, returns=VersionInfo, data=null}
public class QueryVersionCommand extends QApiCommand<java.lang.Void, QueryVersionCommand.Response> {

	/** Response to a QueryVersionCommand. */
	public static class Response extends QApiResponse<VersionInfo> {
	}

	/** Constructs a new QueryVersionCommand. */
	public QueryVersionCommand() {
		super("query-version", Response.class, null);
	}
}
