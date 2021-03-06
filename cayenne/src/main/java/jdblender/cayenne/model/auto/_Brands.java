package jdblender.cayenne.model.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import jdblender.cayenne.model.Series;
import jdblender.cayenne.model.Spares;

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
    public static final Property<List<Series>> SERIES = new Property<List<Series>>("series");
    public static final Property<List<Spares>> SPARESES = new Property<List<Spares>>("spareses");

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

    public void addToSeries(Series obj) {
        addToManyTarget("series", obj, true);
    }
    public void removeFromSeries(Series obj) {
        removeToManyTarget("series", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Series> getSeries() {
        return (List<Series>)readProperty("series");
    }


    public void addToSpareses(Spares obj) {
        addToManyTarget("spareses", obj, true);
    }
    public void removeFromSpareses(Spares obj) {
        removeToManyTarget("spareses", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Spares> getSpareses() {
        return (List<Spares>)readProperty("spareses");
    }


}
