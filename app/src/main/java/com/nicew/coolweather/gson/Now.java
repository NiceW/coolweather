package com.nicew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 肖文超 on 2017/8/2.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public Mero more;

    public class Mero {

        @SerializedName("txt")
        public String info;
    }
}
