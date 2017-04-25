package com.gumu.project.data.source;

import android.support.annotation.NonNull;

import com.gumu.project.data.HttpResult;
import com.gumu.project.data.User;

import retrofit2.Call;
import rx.Observable;

/**
 * Created by Loki on 2017/2/21.
 */

public interface UserLoginSource {
    /*
    * 获取用户登录
    * */
    Observable<HttpResult<User>> getUserLogin(@NonNull String nikename, @NonNull String pwd, boolean remember);


}
