package com.framgia.demomvvm.screen.home.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.framgia.demomvvm2.BR;
import com.framgia.demomvvm2.data.model.User;
import com.framgia.demomvvm2.data.repository.UserRepository;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends BaseObservable {
    public final ObservableList<User> usersObservable = new ObservableArrayList<>();
    @Bindable
    public String toastMessage = null;
    private UserRepository mUserRepository;

    public HomeViewModel(UserRepository userRepository) {
        mUserRepository = userRepository;
        loadUsers();
    }

    public HomeViewModel() {
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public String getToastMessage() {
        return toastMessage;
    }

    public void onItemClick(User user) {
        setToastMessage(user.getAvatarUrl());
    }

    private void loadUsers() {
        mUserRepository.getData(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (!response.isSuccessful()) {
                    return;
                }
                usersObservable.addAll(response.body());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }
}
