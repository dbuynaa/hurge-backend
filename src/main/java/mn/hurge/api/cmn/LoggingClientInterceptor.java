package mn.hurge.api.cmn;

import io.quarkus.logging.Log;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.client.ClientResponseFilter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LoggingClientInterceptor implements ClientResponseFilter {

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {
        Log.infof("Response from %s: %d", requestContext.getUri(), responseContext.getStatus());

        if (responseContext.hasEntity()) {
            String responseBody = new String(responseContext.getEntityStream().readAllBytes(), StandardCharsets.UTF_8);
            Log.infof("Response Body: %s", responseBody);
            responseContext
                    .setEntityStream(new java.io.ByteArrayInputStream(responseBody.getBytes(StandardCharsets.UTF_8)));
        }
    }
}
