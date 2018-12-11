package me.wlins.neo4jdemo.controller;

import me.wlins.neo4jdemo.entity.User;
import me.wlins.neo4jdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author strawberrylin
 * @Date 18-12-11 下午11:31
 * @Version 1.0
 **/

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable long id){
        return userService.findById(id);
    }
}
