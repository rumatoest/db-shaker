package jdblender.cayenne.model.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Brands was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Brands extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Long> ID = new Property<Long>("id");
    public static final Property<String> NAME = new Property<String>("name");

    public void setId(long id) {
        writeProperty("id", id);
    }
    public long getId() {
        Object value = readProperty("id");
        return (value != null) ? (Long) value : 0;
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

}