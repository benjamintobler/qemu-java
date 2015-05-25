package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=x-input-send-event, returns=null, data={*console=int, events=[InputEvent]}}</pre>
 */
// QApiCommandDescriptor{name=x-input-send-event, returns=null, data={*console=int, events=[InputEvent]}}
public class XInputSendEventCommand extends QApiCommand<XInputSendEventCommand.Arguments, XInputSendEventCommand.Response> {
	/** Compound arguments to a XInputSendEventCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("console")
		@CheckForNull
		public java.lang.Long console;
		@JsonProperty("events")
		@Nonnull
		public java.util.List<InputEvent> events;

		public Arguments() {
		}

		public Arguments(java.lang.Long console, java.util.List<InputEvent> events) {
			this.console = console;
			this.events = events;
		}
	}

	/** Response to a XInputSendEventCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new XInputSendEventCommand. */
	public XInputSendEventCommand(@Nonnull XInputSendEventCommand.Arguments argument) {
		super("x-input-send-event", Response.class, argument);
	}

	/** Constructs a new XInputSendEventCommand. */
	public XInputSendEventCommand(java.lang.Long console, java.util.List<InputEvent> events) {
		this(new Arguments(console, events));
	}
}