package mn.hurge.api.cmn;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import mn.mobicom.insurjob.dto.ResponseDto;

@Provider
public class ExecMapper implements ExceptionMapper<ApiException> {

    @Override
    public Response toResponse(ApiException ex) {
        ResponseDto response = new ResponseDto(ex.getMessage(), ex.description);
        return Response.status(Status.OK)
                .type(MediaType.APPLICATION_JSON)
                .entity(response).build();
    }

}
