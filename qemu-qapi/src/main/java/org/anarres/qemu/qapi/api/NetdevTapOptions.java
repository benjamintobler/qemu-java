package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=NetdevTapOptions, data={*ifname=str, *fd=str, *fds=str, *script=str, *downscript=str, *helper=str, *sndbuf=size, *vnet_hdr=bool, *vhost=bool, *vhostfd=str, *vhostfds=str, *vhostforce=bool, *queues=uint32}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=NetdevTapOptions, data={*ifname=str, *fd=str, *fds=str, *script=str, *downscript=str, *helper=str, *sndbuf=size, *vnet_hdr=bool, *vhost=bool, *vhostfd=str, *vhostfds=str, *vhostforce=bool, *queues=uint32}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetdevTapOptions extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ifname")
	@CheckForNull
	public java.lang.String ifname;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("fd")
	@CheckForNull
	public java.lang.String fd;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("fds")
	@CheckForNull
	public java.lang.String fds;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("script")
	@CheckForNull
	public java.lang.String script;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("downscript")
	@CheckForNull
	public java.lang.String downscript;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("helper")
	@CheckForNull
	public java.lang.String helper;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("sndbuf")
	@CheckForNull
	public java.lang.Long sndbuf;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vnet_hdr")
	@CheckForNull
	public java.lang.Boolean vnetHdr;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vhost")
	@CheckForNull
	public java.lang.Boolean vhost;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vhostfd")
	@CheckForNull
	public java.lang.String vhostfd;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vhostfds")
	@CheckForNull
	public java.lang.String vhostfds;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vhostforce")
	@CheckForNull
	public java.lang.Boolean vhostforce;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("queues")
	@CheckForNull
	public java.lang.Long queues;

	@Nonnull
	public NetdevTapOptions withIfname(java.lang.String value) {
		this.ifname = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withFd(java.lang.String value) {
		this.fd = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withFds(java.lang.String value) {
		this.fds = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withScript(java.lang.String value) {
		this.script = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withDownscript(java.lang.String value) {
		this.downscript = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withHelper(java.lang.String value) {
		this.helper = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withSndbuf(java.lang.Long value) {
		this.sndbuf = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withVnetHdr(java.lang.Boolean value) {
		this.vnetHdr = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withVhost(java.lang.Boolean value) {
		this.vhost = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withVhostfd(java.lang.String value) {
		this.vhostfd = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withVhostfds(java.lang.String value) {
		this.vhostfds = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withVhostforce(java.lang.Boolean value) {
		this.vhostforce = value;
		return this;
	}

	@Nonnull
	public NetdevTapOptions withQueues(java.lang.Long value) {
		this.queues = value;
		return this;
	}

	public NetdevTapOptions() {
	}

	public NetdevTapOptions(java.lang.String ifname, java.lang.String fd, java.lang.String fds, java.lang.String script, java.lang.String downscript, java.lang.String helper, java.lang.Long sndbuf, java.lang.Boolean vnetHdr, java.lang.Boolean vhost, java.lang.String vhostfd, java.lang.String vhostfds, java.lang.Boolean vhostforce, java.lang.Long queues) {
		this.ifname = ifname;
		this.fd = fd;
		this.fds = fds;
		this.script = script;
		this.downscript = downscript;
		this.helper = helper;
		this.sndbuf = sndbuf;
		this.vnetHdr = vnetHdr;
		this.vhost = vhost;
		this.vhostfd = vhostfd;
		this.vhostfds = vhostfds;
		this.vhostforce = vhostforce;
		this.queues = queues;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("ifname");
		names.add("fd");
		names.add("fds");
		names.add("script");
		names.add("downscript");
		names.add("helper");
		names.add("sndbuf");
		names.add("vnet_hdr");
		names.add("vhost");
		names.add("vhostfd");
		names.add("vhostfds");
		names.add("vhostforce");
		names.add("queues");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("ifname".equals(name))
			return ifname;
		if ("fd".equals(name))
			return fd;
		if ("fds".equals(name))
			return fds;
		if ("script".equals(name))
			return script;
		if ("downscript".equals(name))
			return downscript;
		if ("helper".equals(name))
			return helper;
		if ("sndbuf".equals(name))
			return sndbuf;
		if ("vnet_hdr".equals(name))
			return vnetHdr;
		if ("vhost".equals(name))
			return vhost;
		if ("vhostfd".equals(name))
			return vhostfd;
		if ("vhostfds".equals(name))
			return vhostfds;
		if ("vhostforce".equals(name))
			return vhostforce;
		if ("queues".equals(name))
			return queues;
		return super.getFieldByName(name);
	}
}
