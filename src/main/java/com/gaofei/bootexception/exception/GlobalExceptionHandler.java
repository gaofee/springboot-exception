package com.gaofei.bootexception.exception;

import com.gaofei.bootexception.common.CommonResult;
import com.gaofei.bootexception.common.IErrorCode;
import com.gaofei.bootexception.common.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : gaofee
 * @date : 15:52 2022/5/9
 * @码云地址 : https://feege.gitee.io
 *
 * 全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    /*
    异常处理的方法
     */

    @ExceptionHandler(value = MyException.class)//异常处理器
    @ResponseBody
    public CommonResult error(HttpServletRequest request,MyException e){
        return CommonResult.failed(ResultCode.FAILED, e.getMessage());
    }

    @ExceptionHandler(value =ArithmeticException.class)//异常处理器
    @ResponseBody
    public CommonResult error3(HttpServletRequest request,ArithmeticException e){
        return CommonResult.failed(ResultCode.FAILED, e.getMessage());
    }

    @ExceptionHandler(value =NullPointerException.class)//异常处理器
    @ResponseBody
    public CommonResult error2(HttpServletRequest request,NullPointerException e){
        return CommonResult.failed(ResultCode.FAILED, e.getMessage());
    }


    @ExceptionHandler(value =Exception.class)//异常处理器
    @ResponseBody
    public CommonResult error1(HttpServletRequest request,Exception e){
        return CommonResult.failed(ResultCode.FAILED, "未知异常,请联系管理员!!!");
    }


}
