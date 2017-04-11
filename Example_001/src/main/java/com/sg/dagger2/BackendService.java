package com.sg.dagger2;

import javax.inject.Inject;
import javax.inject.Named;

public class BackendService {

    private User user;
    private String serverUrl;

    @Inject
    public BackendService(@Named("serverUrl") String serverUrl, User user) {
        this.serverUrl = serverUrl;
        this.user = user;
    }

    public boolean callServer() {
        if(user != null && serverUrl != null && serverUrl.length() > 0) {
            System.out.println("com.sg.dagger2.User: " + user + " ServerUrl: " + serverUrl);
            return true;
        }
        return false;
    }
}
