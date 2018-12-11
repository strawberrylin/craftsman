package me.wlins.neo4jdemo.service;


import me.wlins.neo4jdemo.entity.User;

public interface UserServiceInterface {

    User findById(long id);
}
