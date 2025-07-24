package mn.hurge.api.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class OrderItem extends PanacheEntityBase {
    @Id
    @GeneratedValue
    public UUID id;

    @ManyToOne
    public Order order;

    @ManyToOne
    public Product product;

    public int quantity;
    public int price;
}
