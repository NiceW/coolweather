package com.nicew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 肖文超 on 2017/8/2.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
