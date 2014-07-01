package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiUnionDescriptor{name=NetClientOptions, data={none=NetdevNoneOptions, nic=NetLegacyNicOptions, user=NetdevUserOptions, tap=NetdevTapOptions, l2tpv3=NetdevL2TPv3Options, socket=NetdevSocketOptions, vde=NetdevVdeOptions, dump=NetdevDumpOptions, bridge=NetdevBridgeOptions, hubport=NetdevHubPortOptions, netmap=NetdevNetmapOptions, vhost-user=NetdevVhostUserOptions}, innerTypes=null, fields=null}</pre></p>
 */
// QApiUnionDescriptor{name=NetClientOptions, data={none=NetdevNoneOptions, nic=NetLegacyNicOptions, user=NetdevUserOptions, tap=NetdevTapOptions, l2tpv3=NetdevL2TPv3Options, socket=NetdevSocketOptions, vde=NetdevVdeOptions, dump=NetdevDumpOptions, bridge=NetdevBridgeOptions, hubport=NetdevHubPortOptions, netmap=NetdevNetmapOptions, vhost-user=NetdevVhostUserOptions}, innerTypes=null, fields=null}
public class NetClientOptions extends QApiUnion {
	@SerializedName("none")
	@Nonnull public NetdevNoneOptions none;
	@SerializedName("nic")
	@Nonnull public NetLegacyNicOptions nic;
	@SerializedName("user")
	@Nonnull public NetdevUserOptions user;
	@SerializedName("tap")
	@Nonnull public NetdevTapOptions tap;
	@SerializedName("l2tpv3")
	@Nonnull public NetdevL2TPv3Options l2tpv3;
	@SerializedName("socket")
	@Nonnull public NetdevSocketOptions socket;
	@SerializedName("vde")
	@Nonnull public NetdevVdeOptions vde;
	@SerializedName("dump")
	@Nonnull public NetdevDumpOptions dump;
	@SerializedName("bridge")
	@Nonnull public NetdevBridgeOptions bridge;
	@SerializedName("hubport")
	@Nonnull public NetdevHubPortOptions hubport;
	@SerializedName("netmap")
	@Nonnull public NetdevNetmapOptions netmap;
	@SerializedName("vhost-user")
	@Nonnull public NetdevVhostUserOptions vhostUser;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (none != null)
			count++;
		if (nic != null)
			count++;
		if (user != null)
			count++;
		if (tap != null)
			count++;
		if (l2tpv3 != null)
			count++;
		if (socket != null)
			count++;
		if (vde != null)
			count++;
		if (dump != null)
			count++;
		if (bridge != null)
			count++;
		if (hubport != null)
			count++;
		if (netmap != null)
			count++;
		if (vhostUser != null)
			count++;
		return (count == 1);
	}
}