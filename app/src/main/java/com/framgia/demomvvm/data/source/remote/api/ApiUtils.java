package com.framgia.demomvvm.data.source.remote.api;

public class ApiUtils {
    private static final String BASE_URL = "https://api.github.com/";

    public static UserService getUserService() {
        return RetrofitClient.getInstance(BASE_URL).create(UserService.class);
    }
}
