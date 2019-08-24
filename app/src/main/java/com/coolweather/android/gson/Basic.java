package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 123 on 2019/8/23.
 */

public class Basic {

    @SerializedName("city")
    public String ctiyName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
