package com.dh.mybatis.pojo;

public class User {
    private int id;
    private String username;
    private String address;
    private int age;

    public User(int id, String username, String address, int age) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.age = age;
    }

    public User(String username, String address, int age) {
        this.username = username;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
