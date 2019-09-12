package com.xbang.commons.exception;

import com.xbang.commons.vo.result.ResultEnum;

public class BaseException  extends  RuntimeException{

    private String error_code;

    private String error_msg;

    public BaseException( String error_code, String error_msg) {
        super(error_msg);
        this.error_code = error_code;
        this.error_msg = error_msg;
    }

    public BaseException (ResultEnum resultEnum){
        this(resultEnum.getResult_code(),resultEnum.getResult_msg());
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

    @Override
    public String getMessage() {
        return getError_code() + " : " + getError_msg();
    }
}
