package com.xbang.commons.exception.trade;

public enum TradeExceEnum {

    TRADE_EXCE_UNDERSTOCK("INSUFFICIENT INVENTORY","库存不足"),

    TRADE_EXCE_LACKBALANCE("LACKBALANCE","用户余额不足"),
    ;

    private String error_code;

    private String error_msg;

    TradeExceEnum(String error_code, String error_msg) {
        this.error_code = error_code;
        this.error_msg = error_msg;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }
}
