package com.bravejoy.publicutils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class PublicUtils {

    /**
     * 加载图片
     *
     * @param context
     * @param url
     * @param imageView
     */
    public static void loadImage(Context context, String url, ImageView imageView) {
        if (context == null) {
            return;
        }
        Glide.with(context).load(url).into(imageView);
    }

    /**
     * OkHttpClient
     *
     * @return
     */
    public static OkHttpClient buildOkHttp() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(8000, TimeUnit.MILLISECONDS).build();
        return okHttpClient;
    }

    /**
     * json
     *
     * @param string
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T jsonStr(String string, Class<T> tClass) {
        Gson gson = new Gson();
        T user = gson.fromJson(string, tClass);
        return user;
    }

}
