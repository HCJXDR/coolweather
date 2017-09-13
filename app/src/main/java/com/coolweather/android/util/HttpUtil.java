package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
/**
 * Created by nubia on 2017/9/13.
 */

public class HttpUtil {

    public static void sendOkhttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);//enqueue函数什么作用？
    }
}
