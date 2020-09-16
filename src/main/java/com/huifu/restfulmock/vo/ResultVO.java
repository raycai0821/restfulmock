package com.huifu.restfulmock.vo;

import com.huifu.restfulmock.enums.ResultCode;
import lombok.Getter;


/**
 * @author leifeng.cai
 **/
@Getter
public class ResultVO<T> {

    private int code;
    private String msg;
    private T data;

    public ResultVO(T data, String errorMsg) {
        this(ResultCode.SUCCESS, errorMsg, data);
    }

    public ResultVO(ResultCode resultCode, String errorMsg, T data) {
        this.code = resultCode.getCode();
        if (errorMsg == null || errorMsg.equals("")) {
            this.msg = resultCode.getMsg();
        } else this.msg = errorMsg;
        this.data = data;
    }
}