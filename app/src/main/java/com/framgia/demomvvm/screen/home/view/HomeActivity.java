package com.framgia.demomvvm.screen.home.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.framgia.demomvvm2.R;
import com.framgia.demomvvm2.data.model.User;
import com.framgia.demomvvm2.data.repository.UserRepository;
import com.framgia.demomvvm2.data.source.remote.api.ApiUtils;
import com.framgia.demomvvm2.data.source.remote.user.UserRemoteDataSource;
import com.framgia.demomvvm2.databinding.ActivityHomeBinding;
import com.framgia.demomvvm2.screen.home.HomeAdapter;
import com.framgia.demomvvm2.screen.home.viewmodel.HomeViewModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBinding();
        initRecycler();
    }

    private void initBinding() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        HomeViewModel homeViewModel = new HomeViewModel(getUserRepo());
        mBinding.setHomeViewModel(homeViewModel);
    }

    private void initRecycler() {
        RecyclerView recycleUser = mBinding.recycleUser;
        recycleUser.setLayoutManager(new LinearLayoutManager(this));
        HomeAdapter adapter = new HomeAdapter(new ArrayList<User>());
        recycleUser.setAdapter(adapter);
    }

    private UserRepository getUserRepo() {
        return UserRepository.getInstance(
                UserRemoteDataSource.getInstance(
                        ApiUtils.getUserService()));
    }
}
