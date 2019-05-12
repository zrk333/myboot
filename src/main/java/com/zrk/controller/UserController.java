package com.zrk.controller;

import com.zrk.pojo.User;
import com.zrk.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2019/5/4
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "获取用户资料", notes = ""
            , tags = {"[zrk-study] 用户中心"}, httpMethod = "GET")
    @GetMapping("getUserInfo")
    public User getUserInfo(@RequestParam(value = "id", required = false) Integer id ){

        return userService.getUserById(id);
    }

}
