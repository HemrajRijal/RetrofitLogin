package com.loginmodule.retrofit.loginretrofit.model;

/**
 * Created by Hemraj on 2/23/2017.
 */

public class ServerResponse {

    private String result;
    private String message;
    private User user;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}