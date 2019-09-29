package com.example.walkinclinic.account;

public abstract class Account {
    private String email;
    private String password;

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getemail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
