package org.springboot.manager.pojo;


import java.io.Serializable;

public class User implements Serializable {

    private Integer id;

    private String name;

    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User() {
    }

    public User(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String toString(){
        return "{user:" +
                "id:" + id +
                "name:" + name +
                "sex:" + sex +
                "}";
    }
}

