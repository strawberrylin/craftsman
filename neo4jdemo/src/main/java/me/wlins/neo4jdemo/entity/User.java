package me.wlins.neo4jdemo.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @ClassName User
 * @Description The entity fo user.
 * @Author strawberrylin
 * @Date 18-12-11 下午11:10
 * @Version 1.0
 **/

@NodeEntity
public class User {
    @GraphId
    private long id;

    private String name;

    private int age;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
