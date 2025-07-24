package mn.hurge.api.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order extends PanacheEntityBase {
    @Id
    @GeneratedValue
    public UUID id;

    @ManyToOne
    public User buyer;

    public String status; // pending, shipped, delivered, cancelled

    @Column(name = "total_price")
    public int totalPrice;

    @Column(name = "created_at")
    public LocalDateTime createdAt = LocalDateTime.now();
}
