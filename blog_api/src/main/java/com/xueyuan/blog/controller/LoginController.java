package com.xueyuan.blog.controller;


import com.xueyuan.blog.Service.LoginService;
import com.xueyuan.blog.vo.Result;
import com.xueyuan.blog.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam){

        return  loginService.login(loginParam);
    }

}


