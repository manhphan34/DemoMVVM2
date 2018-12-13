package com.framgia.demomvvm.data.repository;

import com.framgia.demomvvm2.data.model.User;
import com.framgia.demomvvm2.data.source.UserRemoteDataSource;

import java.util.List;

import retrofit2.Callback;

public class UserRepository implements UserRemoteDataSource.Remote {
    private UserRemoteDataSource.Remote mRemote;
    private static UserRepository sInstance;

    public static UserRepository getInstance(UserRemoteDataSource.Remote remote) {
        if (sInstance == null) {
            sInstance = new UserRepository(remote);
        }
        return sInstance;
    }

    private UserRepository(UserRemoteDataSource.Remote remote) {
        mRemote = remote;
    }

    @Override
    public void getData(Callback<List<User>> callback) {
        mRemote.getData(callback);
    }
}
