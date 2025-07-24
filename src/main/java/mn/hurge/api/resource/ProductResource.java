package mn.hurge.api.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import mn.hurge.api.entity.Product;

import java.util.List;
import java.util.UUID;

@Path("/api/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {

    @GET
    public List<Product> getAll() {
        return Product.listAll();
    }

    @GET
    @Path("/{id}")
    public Product getOne(@PathParam("id") UUID id) {
        return (Product) Product.findByIdOptional(id)
                .orElseThrow(NotFoundException::new);
    }
}
