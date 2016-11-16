package jdblender.cayenne.model.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import jdblender.cayenne.model.Series;
import jdblender.cayenne.model.Spares;

/**
 * Class _Models was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Models extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Long> ID = new Property<Long>("id");
    public static final Property<String> NAME = new Property<String>("name");
    public static final Property<Long> SERIES_ID = new Property<Long>("seriesId");
    public static final Property<Series> SERIES = new Property<Series>("series");
    public static final Property<List<Spares>> SPARES = new Property<List<Spares>>("spares");

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

    public void setSeriesId(long seriesId) {
        writeProperty("seriesId", seriesId);
    }
    public long getSeriesId() {
        Object value = readProperty("seriesId");
        return (value != null) ? (Long) value : 0;
    }

    public void setSeries(Series series) {
        setToOneTarget("series", series, true);
    }

    public Series getSeries() {
        return (Series)readProperty("series");
    }


    public void addToSpares(Spares obj) {
        addToManyTarget("spares", obj, true);
    }
    public void removeFromSpares(Spares obj) {
        removeToManyTarget("spares", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Spares> getSpares() {
        return (List<Spares>)readProperty("spares");
    }


}
