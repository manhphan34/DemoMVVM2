package com.framgia.demomvvm.Ulti;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.framgia.demomvvm2.GlideApp;
import com.framgia.demomvvm2.data.model.User;
import com.framgia.demomvvm2.screen.home.HomeAdapter;

import java.util.List;

public class BindingUltis {
    @BindingAdapter("bindUsers")
    public static void setUsersForRecyclerView(RecyclerView recyclerView,
                                               List<User> users) {
        HomeAdapter adapter = (HomeAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.addData(users);
        }
    }

    @BindingAdapter("bindUser")
    public static <T> void setData(RecyclerView recyclerView, List<T> list) {

    }

    @BindingAdapter("toastMessage")
    public static void showToast(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @BindingAdapter("srcImage")
    public static void loadImage(ImageView imageView, String imageUrl) {
        GlideApp.with(imageView)
                .load(imageUrl)
                .into(imageView);
    }
}
