package mn.hurge.api.dto;

public class ResponseDto {

    public String code;
    public String description;
//    public String vip;

    public ResponseDto(String code, String description) {
        this.code = code;
        this.description = description;
    }

}
