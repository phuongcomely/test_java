package data;

import entities.User;

import java.util.Map;

public class DataUser {
    public void createrUser(Map<String, User> users){

        users.put("phuong",  new User("phuong","Phuong_1234", "Phuong@gmail.com"));
    }
}
