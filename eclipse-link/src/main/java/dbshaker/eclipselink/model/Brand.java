package dbshaker.eclipselink.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rumatoest
 */
@Entity
@Table(name = "brands")
public class Brand implements dbshaker.core.domain.Brand {

    @Id
    @Column(name = "id")
    private long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
