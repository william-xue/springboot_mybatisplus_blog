package com.xueyuan.blog.Service;

import com.xueyuan.blog.dao.pojo.SysUser;
import com.xueyuan.blog.vo.Result;
import com.xueyuan.blog.vo.params.LoginParam;

public interface LoginService {


    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    Result logout(String token);

    Result register(LoginParam loginParam);
}
