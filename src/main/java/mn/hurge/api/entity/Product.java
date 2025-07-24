package mn.hurge.api.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Product extends PanacheEntityBase {
    @Id
    @GeneratedValue
    public UUID id;

    public String name;
    public String description;
    public int price;
    public int stock;
    public String imageUrl;

    @ManyToOne
    public Supplier supplier;

    @ManyToOne
    public Category category;

    @Column(name = "created_at")
    public LocalDateTime createdAt = LocalDateTime.now();
}
