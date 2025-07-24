package mn.hurge.api.entity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Delivery extends PanacheEntityBase {
    @Id
    @GeneratedValue
    public UUID id;

    @OneToOne
    public Order order;

    public String address;
    public String city;
    public String status; // preparing, in_transit, delivered

    public LocalDateTime expectedDeliveryDate;
}
