package mn.hurge.api.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Category extends PanacheEntityBase {
    @Id
    @GeneratedValue
    public UUID id;

    public String name;
    public String description;
}
