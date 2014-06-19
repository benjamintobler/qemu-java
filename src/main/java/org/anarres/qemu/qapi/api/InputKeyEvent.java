package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=InputKeyEvent, data={key=KeyValue, down=bool}, innerTypes=null, fields=null}
public class InputKeyEvent extends QApiObject {

	@SerializedName("key")
	@Nonnull public KeyValue key;
	@SerializedName("down")
	@Nonnull public boolean down;
}
