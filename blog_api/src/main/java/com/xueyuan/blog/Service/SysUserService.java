package com.xueyuan.blog.Service;

import com.xueyuan.blog.dao.pojo.SysUser;
import com.xueyuan.blog.vo.Result;

public interface SysUserService {

    SysUser findUserById(Long id);
    SysUser findUser(String account, String password);
    /**
     * 根据账户查找用户
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);
    /**
     * 保存用户
     * @param sysUser
     */
    void save(SysUser sysUser);

    Result findUserByToken(String token);
}
