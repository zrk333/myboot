package com.zrk.controller;

import com.zrk.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2019/5/4
 */
@RestController
@RequestMapping("user")
public class UserController {

    @ApiOperation(value = "获取用户资料", notes = ""
            , tags = {"[zrk-study] 用户中心"}, httpMethod = "GET")
    @GetMapping("getUserInfo")
    public User getUserInfo(@RequestParam(value = "id", required = false) Integer id ){
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setPassword("123456");
        return user;
    }

}
