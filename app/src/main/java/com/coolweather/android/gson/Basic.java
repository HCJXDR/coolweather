package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nubia on 2017/9/13.
 */

public class Basic {

    @SerializedName("City")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
