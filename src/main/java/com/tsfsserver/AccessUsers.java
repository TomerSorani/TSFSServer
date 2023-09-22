package com.tsfsserver;

import java.util.HashMap;
import java.util.Map;

public class AccessUsers {
    private Map<String, String> users;

    public AccessUsers() {
        users = new HashMap<>();
        users.put("tomer","ts123");
        users.put("tihnun","t12345");
        users.put("control room","cn12345");
        users.put("bakara","cn12345");
        users.put("sadran","12345");
        users.put("pniot","p12345");
        users.put("mantam","m12345");
        users.put("p","");
    }

    public boolean CheckIfValidUserExist(String userName, String password){
        return users.containsKey(userName) && users.get(userName).equals(password);
    }
}
