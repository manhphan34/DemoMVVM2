package com.framgia.demomvvm.screen.home;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.framgia.demomvvm2.R;
import com.framgia.demomvvm2.data.model.User;
import com.framgia.demomvvm2.databinding.ItemUserBinding;
import com.framgia.demomvvm2.screen.home.viewmodel.HomeViewModel;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {
    private List<User> mUsers;

    public HomeAdapter(List<User> users) {
        mUsers = users;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemUserBinding userBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                R.layout.item_user, viewGroup, false);
        return new HomeViewHolder(userBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder homeViewHolder, int i) {
        homeViewHolder.bindData(mUsers.get(i));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public void addData(List<User> users) {
        if (users == null) return;
        mUsers.addAll(users);
        int start = mUsers.size();
        mUsers.addAll(users);
        notifyItemRangeChanged(start, mUsers.size());
    }

    public static class HomeViewHolder extends RecyclerView.ViewHolder {
        private ItemUserBinding mUserBinding;
        private HomeViewModel mViewModel;
        public HomeViewHolder(ItemUserBinding userBinding) {
            super(userBinding.getRoot());
            mUserBinding = userBinding;
            mViewModel = new HomeViewModel();
        }

        public void bindData(User user) {
            mUserBinding.setUser(user);
            mUserBinding.setHomeViewModel(mViewModel);
            mUserBinding.executePendingBindings();
        }
    }
}
