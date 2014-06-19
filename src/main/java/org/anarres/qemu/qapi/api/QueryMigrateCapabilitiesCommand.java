package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-migrate-capabilities, returns=[MigrationCapabilityStatus], data=null}
public class QueryMigrateCapabilitiesCommand extends QApiCommand<Void, List<MigrationCapabilityStatus>> {

	public QueryMigrateCapabilitiesCommand() {
		super("query-migrate-capabilities", new TypeToken<List<MigrationCapabilityStatus>>() {}, null);
	}
}
