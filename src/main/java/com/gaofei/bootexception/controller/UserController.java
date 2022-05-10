package com.gaofei.bootexception.controller;

import com.gaofei.bootexception.common.CommonResult;
import com.gaofei.bootexception.exception.MyException;
import com.gaofei.bootexception.exception.MyException1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author : gaofee
 * @date : 15:32 2022/5/9
 * @码云地址 : https://feege.gitee.io
 */

@RestController
public class UserController {

    @RequestMapping("/hello7")
    public CommonResult hello7() throws MyException {
        String msg = "aaaa";
        char[] chars = msg.toCharArray();
        System.out.println(chars[5]);
        return CommonResult.success("11");
    }


    @RequestMapping("/hello6")
    public CommonResult hello6() throws MyException {
        String msg = null;
        msg.toString();
        return CommonResult.success("11");
    }

    @RequestMapping("/hello5")
    public CommonResult hello5() throws MyException {
        throw new MyException("服务器内部错误,请联系管理员,尝试刷新按钮!");
    }

    @RequestMapping("/hello4")
    public CommonResult hello4(){
        int i =1/0;
        return CommonResult.success("hello1");
    }

    @RequestMapping("/hello1")
    public CommonResult hello1(){
        return CommonResult.success("hello1");
    }

    @RequestMapping("/hello2")
    public CommonResult hello2(){
        List<String> list = Arrays.asList("1", "2", "3");
        return CommonResult.success(list);
    }

    @RequestMapping("/hello3")
    public CommonResult hello3(){
        return CommonResult.failed("操作失败");
    }
}
