package com.lank.lottery.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LanceLan
 * @since 2021-08-26 14:47
 * 统一返回对象中，Code码、Info描述
 */
@Data
public class Result implements Serializable {

    private String code;

    private String info;

    public static Result buildResult(String code, String info) {
        return new Result(code, info);
    }

    public static Result buildSuccessResult() {
        return new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildErrorResult() {
        return new Result(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
    }

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
