package activitytest.com.example.tony.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tony on 2017/8/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
