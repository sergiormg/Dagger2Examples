package com.sg.dagger2;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [name = " + name + "]";
    }
}