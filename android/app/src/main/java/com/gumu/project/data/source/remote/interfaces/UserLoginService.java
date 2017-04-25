package com.gumu.project.data.source.remote.interfaces;

import com.gumu.project.data.HttpResult;
import com.gumu.project.data.User;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Loki on 2017/2/21.
 */

public interface UserLoginService {
    /*
* 获取用户登录
* */
    @GET("/api/user/login")
    Observable<HttpResult<User>> getUserLogin(@Query("user_id") String nikename, @Query("pwd") String pwd);


}
