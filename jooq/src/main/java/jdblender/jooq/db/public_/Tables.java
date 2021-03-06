/**
 * This class is generated by jOOQ
 */
package jdblender.jooq.db.public_;


import javax.annotation.Generated;

import jdblender.jooq.db.public_.tables.Brands;
import jdblender.jooq.db.public_.tables.Models;
import jdblender.jooq.db.public_.tables.Series;
import jdblender.jooq.db.public_.tables.SpareToModel;
import jdblender.jooq.db.public_.tables.Spares;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.BRANDS</code>.
     */
    public static final Brands BRANDS = jdblender.jooq.db.public_.tables.Brands.BRANDS;

    /**
     * The table <code>PUBLIC.SERIES</code>.
     */
    public static final Series SERIES = jdblender.jooq.db.public_.tables.Series.SERIES;

    /**
     * The table <code>PUBLIC.MODELS</code>.
     */
    public static final Models MODELS = jdblender.jooq.db.public_.tables.Models.MODELS;

    /**
     * The table <code>PUBLIC.SPARES</code>.
     */
    public static final Spares SPARES = jdblender.jooq.db.public_.tables.Spares.SPARES;

    /**
     * The table <code>PUBLIC.SPARE_TO_MODEL</code>.
     */
    public static final SpareToModel SPARE_TO_MODEL = jdblender.jooq.db.public_.tables.SpareToModel.SPARE_TO_MODEL;
}
