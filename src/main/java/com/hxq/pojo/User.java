package com.hxq.pojo;

public class User {
   private String phonenum;
   private String password;

    @Override
    public String toString() {
        return "User{" +
                "phonenum='" + phonenum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String phonenum, String password) {
        this.phonenum = phonenum;
        this.password = password;
    }

    public User() {
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
