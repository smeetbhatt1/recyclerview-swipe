package com.smeetbhatt.recyclerviewswipe.network;

import com.smeetbhatt.recyclerviewswipe.model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("json/menu.json")
    Call<List<Item>> getItem();
}
