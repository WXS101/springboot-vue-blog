package com.ltan.controller;


import com.ltan.common.lang.Result;
import com.ltan.entity.User;
import com.ltan.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @since 2021-09-27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public Result index() {
        User user = userService.getById(1L);
        return Result.succ(user);
    }

    @GetMapping("/test")
    public String test() {
        return "okk!";
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {



        return Result.succ(user);
    }

}
