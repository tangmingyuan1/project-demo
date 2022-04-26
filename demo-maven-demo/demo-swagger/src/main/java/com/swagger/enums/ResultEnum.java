package com.swagger.enums;

public enum ResultEnum {

    UNKNOWN_EXCEPTION("100", "未知异常"),
    ADD_ERROR("103", "添加失败"),
    UPDATE_ERROR("104", "更新失败"),
    DELETE_ERROR("105", "删除失败"),
    GET_ERROR("106", "查找失败"),
    ERROR_CODE("-1", "异常返回"),
    RIGHT_CODE("200", "正常完成"),
    DEMOTE_CODE("0", "降级");

    private String code;
    private String msg;

    private ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public static ResultEnum getByCode(String code) {
        ResultEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ResultEnum resultEnum = var1[var3];
            if (code == resultEnum.getCode()) {
                return resultEnum;
            }
        }

        return null;
    }
}
