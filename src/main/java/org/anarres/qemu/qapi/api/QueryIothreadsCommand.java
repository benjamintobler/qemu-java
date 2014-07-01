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
 * <p><pre>QApiCommandDescriptor{name=query-iothreads, returns=[IOThreadInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-iothreads, returns=[IOThreadInfo], data=null}
public class QueryIothreadsCommand extends QApiCommand<Void, QueryIothreadsCommand.Response> {

	/** Response to a QueryIothreadsCommand. */
	public static class Response extends QApiResponse<List<IOThreadInfo>> {
	}

	/** Constructs a new QueryIothreadsCommand. */
	public QueryIothreadsCommand() {
		super("query-iothreads", Response.class, null);
	}
}