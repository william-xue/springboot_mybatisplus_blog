package com.xueyuan.blog.controller;

import com.xueyuan.blog.dao.pojo.SysUser;
import com.xueyuan.blog.utils.UserThreadLocal;
import com.xueyuan.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
