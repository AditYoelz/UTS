package com.example.uts.response;

import com.example.uts.retrofit.User;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GithubSearchResponse {
    @SerializedName("items")
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }
}
