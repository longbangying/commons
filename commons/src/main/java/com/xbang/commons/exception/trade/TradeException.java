package com.xbang.commons.exception.trade;

import com.xbang.commons.exception.BaseException;

public class TradeException  extends BaseException {

    private TradeExceEnum tradeExceEnum;


    public TradeException(TradeExceEnum tradeExceEnum) {
        this(tradeExceEnum.getError_code(),tradeExceEnum.getError_msg());
        this.tradeExceEnum = tradeExceEnum;

    }

    public TradeException(String error_code, String error_msg) {
        super(error_code,error_msg);
    }
}
