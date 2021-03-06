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
 * <pre>QApiTypeDescriptor{name=RockerOfDpaFlowMask, data={*in-pport=uint32, *tunnel-id=uint32, *vlan-id=uint16, *eth-src=str, *eth-dst=str, *ip-proto=uint8, *ip-tos=uint8}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=RockerOfDpaFlowMask, data={*in-pport=uint32, *tunnel-id=uint32, *vlan-id=uint16, *eth-src=str, *eth-dst=str, *ip-proto=uint8, *ip-tos=uint8}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RockerOfDpaFlowMask extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("in-pport")
	@CheckForNull
	public java.lang.Long inPport;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("tunnel-id")
	@CheckForNull
	public java.lang.Long tunnelId;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vlan-id")
	@CheckForNull
	public java.lang.Integer vlanId;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("eth-src")
	@CheckForNull
	public java.lang.String ethSrc;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("eth-dst")
	@CheckForNull
	public java.lang.String ethDst;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ip-proto")
	@CheckForNull
	public char ipProto;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ip-tos")
	@CheckForNull
	public char ipTos;

	@Nonnull
	public RockerOfDpaFlowMask withInPport(java.lang.Long value) {
		this.inPport = value;
		return this;
	}

	@Nonnull
	public RockerOfDpaFlowMask withTunnelId(java.lang.Long value) {
		this.tunnelId = value;
		return this;
	}

	@Nonnull
	public RockerOfDpaFlowMask withVlanId(java.lang.Integer value) {
		this.vlanId = value;
		return this;
	}

	@Nonnull
	public RockerOfDpaFlowMask withEthSrc(java.lang.String value) {
		this.ethSrc = value;
		return this;
	}

	@Nonnull
	public RockerOfDpaFlowMask withEthDst(java.lang.String value) {
		this.ethDst = value;
		return this;
	}

	@Nonnull
	public RockerOfDpaFlowMask withIpProto(char value) {
		this.ipProto = value;
		return this;
	}

	@Nonnull
	public RockerOfDpaFlowMask withIpTos(char value) {
		this.ipTos = value;
		return this;
	}

	public RockerOfDpaFlowMask() {
	}

	public RockerOfDpaFlowMask(java.lang.Long inPport, java.lang.Long tunnelId, java.lang.Integer vlanId, java.lang.String ethSrc, java.lang.String ethDst, char ipProto, char ipTos) {
		this.inPport = inPport;
		this.tunnelId = tunnelId;
		this.vlanId = vlanId;
		this.ethSrc = ethSrc;
		this.ethDst = ethDst;
		this.ipProto = ipProto;
		this.ipTos = ipTos;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("in-pport");
		names.add("tunnel-id");
		names.add("vlan-id");
		names.add("eth-src");
		names.add("eth-dst");
		names.add("ip-proto");
		names.add("ip-tos");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("in-pport".equals(name))
			return inPport;
		if ("tunnel-id".equals(name))
			return tunnelId;
		if ("vlan-id".equals(name))
			return vlanId;
		if ("eth-src".equals(name))
			return ethSrc;
		if ("eth-dst".equals(name))
			return ethDst;
		if ("ip-proto".equals(name))
			return ipProto;
		if ("ip-tos".equals(name))
			return ipTos;
		return super.getFieldByName(name);
	}
}
