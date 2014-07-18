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
 * <p><pre>QApiEventDescriptor{name=VSERPORT_CHANGE, data={id=str, open=bool}}</pre></p>
 */
// QApiEventDescriptor{name=VSERPORT_CHANGE, data={id=str, open=bool}}
public class VserportChangeEvent extends QApiEvent {
	@SerializedName("id")
	@Nonnull
	public java.lang.String id;
	@SerializedName("open")
	@Nonnull
	public boolean open;
}
