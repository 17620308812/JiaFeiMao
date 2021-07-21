package jfm.common.response;

public enum ResponseEnum {

    SUCCESS("000", "成功"),

    UNAUTHORIZED("001", "无权限"),

    TOKEN_EXPIRE("002", "TOKEN已过期")

    ;

    private String code;

    private String value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    ResponseEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

}
