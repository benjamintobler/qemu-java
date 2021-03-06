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
 * <pre>QApiTypeDescriptor{name=NetdevUserOptions, data={*hostname=str, *restrict=bool, *ip=str, *net=str, *host=str, *tftp=str, *bootfile=str, *dhcpstart=str, *dns=str, *dnssearch=[String], *smb=str, *smbserver=str, *hostfwd=[String], *guestfwd=[String]}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=NetdevUserOptions, data={*hostname=str, *restrict=bool, *ip=str, *net=str, *host=str, *tftp=str, *bootfile=str, *dhcpstart=str, *dns=str, *dnssearch=[String], *smb=str, *smbserver=str, *hostfwd=[String], *guestfwd=[String]}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetdevUserOptions extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("hostname")
	@CheckForNull
	public java.lang.String hostname;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("restrict")
	@CheckForNull
	public java.lang.Boolean restrict;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ip")
	@CheckForNull
	public java.lang.String ip;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("net")
	@CheckForNull
	public java.lang.String net;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("host")
	@CheckForNull
	public java.lang.String host;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("tftp")
	@CheckForNull
	public java.lang.String tftp;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bootfile")
	@CheckForNull
	public java.lang.String bootfile;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("dhcpstart")
	@CheckForNull
	public java.lang.String dhcpstart;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("dns")
	@CheckForNull
	public java.lang.String dns;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("dnssearch")
	@CheckForNull
	public java.util.List<String> dnssearch;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("smb")
	@CheckForNull
	public java.lang.String smb;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("smbserver")
	@CheckForNull
	public java.lang.String smbserver;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("hostfwd")
	@CheckForNull
	public java.util.List<String> hostfwd;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("guestfwd")
	@CheckForNull
	public java.util.List<String> guestfwd;

	@Nonnull
	public NetdevUserOptions withHostname(java.lang.String value) {
		this.hostname = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withRestrict(java.lang.Boolean value) {
		this.restrict = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withIp(java.lang.String value) {
		this.ip = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withNet(java.lang.String value) {
		this.net = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withHost(java.lang.String value) {
		this.host = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withTftp(java.lang.String value) {
		this.tftp = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withBootfile(java.lang.String value) {
		this.bootfile = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withDhcpstart(java.lang.String value) {
		this.dhcpstart = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withDns(java.lang.String value) {
		this.dns = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withDnssearch(java.util.List<String> value) {
		this.dnssearch = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withSmb(java.lang.String value) {
		this.smb = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withSmbserver(java.lang.String value) {
		this.smbserver = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withHostfwd(java.util.List<String> value) {
		this.hostfwd = value;
		return this;
	}

	@Nonnull
	public NetdevUserOptions withGuestfwd(java.util.List<String> value) {
		this.guestfwd = value;
		return this;
	}

	public NetdevUserOptions() {
	}

	public NetdevUserOptions(java.lang.String hostname, java.lang.Boolean restrict, java.lang.String ip, java.lang.String net, java.lang.String host, java.lang.String tftp, java.lang.String bootfile, java.lang.String dhcpstart, java.lang.String dns, java.util.List<String> dnssearch, java.lang.String smb, java.lang.String smbserver, java.util.List<String> hostfwd, java.util.List<String> guestfwd) {
		this.hostname = hostname;
		this.restrict = restrict;
		this.ip = ip;
		this.net = net;
		this.host = host;
		this.tftp = tftp;
		this.bootfile = bootfile;
		this.dhcpstart = dhcpstart;
		this.dns = dns;
		this.dnssearch = dnssearch;
		this.smb = smb;
		this.smbserver = smbserver;
		this.hostfwd = hostfwd;
		this.guestfwd = guestfwd;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("hostname");
		names.add("restrict");
		names.add("ip");
		names.add("net");
		names.add("host");
		names.add("tftp");
		names.add("bootfile");
		names.add("dhcpstart");
		names.add("dns");
		names.add("dnssearch");
		names.add("smb");
		names.add("smbserver");
		names.add("hostfwd");
		names.add("guestfwd");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("hostname".equals(name))
			return hostname;
		if ("restrict".equals(name))
			return restrict;
		if ("ip".equals(name))
			return ip;
		if ("net".equals(name))
			return net;
		if ("host".equals(name))
			return host;
		if ("tftp".equals(name))
			return tftp;
		if ("bootfile".equals(name))
			return bootfile;
		if ("dhcpstart".equals(name))
			return dhcpstart;
		if ("dns".equals(name))
			return dns;
		if ("dnssearch".equals(name))
			return dnssearch;
		if ("smb".equals(name))
			return smb;
		if ("smbserver".equals(name))
			return smbserver;
		if ("hostfwd".equals(name))
			return hostfwd;
		if ("guestfwd".equals(name))
			return guestfwd;
		return super.getFieldByName(name);
	}
}
