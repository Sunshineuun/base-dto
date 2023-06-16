package icu.uun.base.model;

/**
 * @author qiushengming
 */
public enum BaseDTOCode {
    /**
     * 操作成功、操作失败、系统错误
     */
    SUCCESS("1", "操作成功"),
    FAILED("0", "操作失败"),
    ACCESS("-998", "非法权限"),
    ERROR("-999", "系统错误");


    private final String code;
    private final String message;

    BaseDTOCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
