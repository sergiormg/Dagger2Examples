package com.sg.androiddagger2;

public class NetworkApi {
    public boolean validateUser(String username, String password) {
        return !(username == null || username.length() == 0);
    }
}
