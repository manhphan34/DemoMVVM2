package com.framgia.demomvvm.data.source.remote.api;

import com.framgia.demomvvm2.data.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {
    @GET("users")
    Call<List<User>> getData();
}
