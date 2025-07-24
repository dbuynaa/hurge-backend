package mn.hurge.api.cmn;

public class ApiException extends Exception {

    private static final long serialVersionUID = 1L;

    public Integer status;
    public String description;

    public ApiException(String message, Integer status) {
        super(message);
        this.status = status;
    }

    public ApiException(String message, String desc) {
        super(message);
        this.description = desc;
    }

    public ApiException(String message, Throwable cause, Integer status) {
        super(message, cause);
        this.status = status;
    }

    public ApiException(Throwable cause, Integer status) {
        super(cause);
        this.status = status;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

}
