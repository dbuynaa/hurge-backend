package mn.hurge.api.service;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import mn.hurge.api.cmn.ApiException;
import mn.hurge.api.cmn.Utils;
import mn.hurge.api.dto.ResponseDto;
import org.eclipse.microprofile.config.ConfigProvider;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@RequestScoped
public class Service {
    @Transactional
    public ResponseDto dailyCheck() {

        Log.infof("Daily check completed.");
        return new ResponseDto("SUCCESS", "Daily check completed successfully.");
    }

}
