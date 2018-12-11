package me.wlins.neo4jdemo.service.impl;

import me.wlins.neo4jdemo.entity.User;
import me.wlins.neo4jdemo.repository.UserRepository;
import me.wlins.neo4jdemo.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author strawberrylin
 * @Date 18-12-11 下午11:23
 * @Version 1.0
 **/

@Service
public class UserServiceImpl implements UserServiceInterface{
    @Autowired
    UserRepository userRepository;

    @Override
    public User findById(long id){
        return userRepository.findById(id);
    }
}
