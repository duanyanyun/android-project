package com.gumu.project.util;

import java.io.File;

import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * Created by Loki on 2017/4/19.
 */

public class OkHttpUtils {

    private static OkHttpClient mOkHttpClient;

    //设置缓存目录
//    private static File cacheDirectory = new File(MyApplication.getInstance().getApplicationContext().getCacheDir().getAbsolutePath(), "MyCache");
//    private static Cache cache = new Cache(cacheDirectory, 10 * 1024 * 1024);


    /**
     * 获取OkHttpClient对象
     *
     * @return
     */
    public static OkHttpClient getOkHttpClient() {

        if (null == mOkHttpClient) {
            mOkHttpClient = new OkHttpClient.Builder()
//                    .cookieJar(new CookiesManager())
//                    //.addInterceptor(new MyIntercepter())
//                    //.addNetworkInterceptor(new CookiesInterceptor(MyApplication.getInstance().getApplicationContext()))
//                    //设置请求读写的超时时间
//                    .connectTimeout(10, TimeUnit.SECONDS)
//                    .writeTimeout(30, TimeUnit.SECONDS)
//                    .readTimeout(30, TimeUnit.SECONDS)
//                    .cache(cache)
                    .build();
        }
        return mOkHttpClient;
    }

}
