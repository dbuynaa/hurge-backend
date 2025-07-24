package mn.hurge.api.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Supplier extends PanacheEntityBase {
    @Id
    @GeneratedValue
    public UUID id;

    @OneToOne
    public User user;

    public String businessName;
    public String phoneNumber;
    public String location;
}
