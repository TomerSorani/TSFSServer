package com.tsfsserver;

import java.util.HashMap;
import java.util.Map;

public class AccessUsers {
    private Map<String, String> users;

    public AccessUsers() {
        users = new HashMap<>();
        users.put("tomer","123");
        users.put("control room","12345");
        users.put("p","");
    }

    public boolean CheckIfValidUserExist(String userName, String password){
        return users.containsKey(userName) && users.get(userName).equals(password);
    }
}
