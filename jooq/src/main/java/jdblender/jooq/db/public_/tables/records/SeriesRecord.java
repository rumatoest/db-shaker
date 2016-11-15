/**
 * This class is generated by jOOQ
 */
package jdblender.jooq.db.public_.tables.records;


import javax.annotation.Generated;

import jdblender.jooq.db.public_.tables.Series;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SeriesRecord extends UpdatableRecordImpl<SeriesRecord> implements Record3<Long, Long, String> {

    private static final long serialVersionUID = -793052473;

    /**
     * Setter for <code>PUBLIC.SERIES.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.SERIES.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.SERIES.BRAND_ID</code>.
     */
    public void setBrandId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.SERIES.BRAND_ID</code>.
     */
    public Long getBrandId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>PUBLIC.SERIES.NAME</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.SERIES.NAME</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Series.SERIES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Series.SERIES.BRAND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Series.SERIES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getBrandId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SeriesRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SeriesRecord value2(Long value) {
        setBrandId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SeriesRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SeriesRecord values(Long value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SeriesRecord
     */
    public SeriesRecord() {
        super(Series.SERIES);
    }

    /**
     * Create a detached, initialised SeriesRecord
     */
    public SeriesRecord(Long id, Long brandId, String name) {
        super(Series.SERIES);

        set(0, id);
        set(1, brandId);
        set(2, name);
    }
}