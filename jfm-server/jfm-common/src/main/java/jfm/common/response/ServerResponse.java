package jfm.common.response;

public class ServerResponse<T> {

    private String returnCode;

    private String returnMsg;

    private T data;


    public static <T> ServerResponse<T> successResponse(T data) {
        return new ServerResponse(ResponseEnum.SUCCESS.getCode(), "", data);
    }

    public static <T> ServerResponse<T> error(String message) {
        return new ServerResponse(ResponseEnum.UN_KNOW.getCode(), message, null);
    }

    public static <T> ServerResponse<T> success() {
        return new ServerResponse("0", "", null);
    }

    public static <T> ServerResponse<T> result(ResponseEnum responseEnum) {
        return new ServerResponse(responseEnum.getCode(), responseEnum.getValue(), null);
    }


    public ServerResponse(String returnCode, String returnMsg, T data) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
        this.data = data;
    }

    public ServerResponse() {
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
