package com.framgia.demomvvm.data.source;

import com.framgia.demomvvm2.data.model.User;

import java.util.List;

import retrofit2.Callback;

public interface UserRemoteDataSource {
    interface Remote {
        void getData(Callback<List<User>> callback);
    }
}
