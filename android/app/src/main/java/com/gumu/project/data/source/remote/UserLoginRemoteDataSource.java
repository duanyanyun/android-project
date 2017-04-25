package com.gumu.project.data.source.remote;

import android.support.annotation.NonNull;

import com.gumu.project.data.HttpResult;
import com.gumu.project.data.User;
import com.gumu.project.data.source.UserLoginSource;
import com.gumu.project.data.source.remote.interfaces.UserLoginService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Observable;

/**
 * Created by Loki on 2017/2/21.
 */

public class UserLoginRemoteDataSource implements UserLoginSource {
    @Override
    public Observable<HttpResult<User>> getUserLogin(@NonNull String nikename, @NonNull String pwd, boolean remember) {
//        Retrofit retrofit = new Retrofit.Builder().addCallAdapterFactory(RxJavaCallAdapterFactory.create()).baseUrl("http://192.168.6.69:8090").build();
//        UserLoginService service = retrofit.create(UserLoginService.class);
//        return service.getUserLogin(nikename,pwd,remember);
        return null;
    }
}
