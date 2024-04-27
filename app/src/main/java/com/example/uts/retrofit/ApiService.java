package com.example.uts.retrofit;

import com.example.uts.response.GithubSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Authorization: token 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"})
    @GET("search/users")
    Call<GithubSearchResponse> searchUsers(@Query("q") String query);

    @Headers({"Authorization: token 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"})
    @GET("users/{username}")
    Call<User> getUser(@Path("username") String username);

}
