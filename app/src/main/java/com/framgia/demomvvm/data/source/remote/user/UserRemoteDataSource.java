package com.framgia.demomvvm.data.source.remote.user;


import com.framgia.demomvvm2.data.model.User;
import com.framgia.demomvvm2.data.source.remote.api.UserService;

import java.util.List;

import retrofit2.Callback;

public class UserRemoteDataSource implements com.framgia.demomvvm2.data.source.UserRemoteDataSource.Remote {
    private UserService mService;
    private static UserRemoteDataSource sInstance;

    public static UserRemoteDataSource getInstance(UserService userService) {
        if (sInstance == null) {
            sInstance = new UserRemoteDataSource(userService);
        }
        return sInstance;
    }

    private UserRemoteDataSource(UserService userService) {
        mService = userService;
    }

    @Override
    public void getData(Callback<List<User>> callback) {
        mService.getData().enqueue(callback);
    }
}
