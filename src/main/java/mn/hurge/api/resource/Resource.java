package mn.hurge.api.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import mn.hurge.api.dto.ResponseDto;
import mn.hurge.api.service.Service;

@Path("insur-job")
public class Resource {

    @Inject
    Service service;

    @Path("daily-check")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseDto dailyCheck() {
        return service.dailyCheck();
    }
}
