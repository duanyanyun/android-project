package com.gumu.project.presentation.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.gumu.project.R;
import com.gumu.project.data.HttpResult;
import com.gumu.project.data.User;
import com.gumu.project.data.source.remote.UserLoginRemoteDataSource;
import com.gumu.project.data.source.remote.interfaces.UserLoginService;
import com.gumu.project.util.OkHttpUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).baseUrl("http://192.168.6.110:8090/").client(OkHttpUtils.getOkHttpClient()).build();
        UserLoginService service = retrofit.create(UserLoginService.class);
                service.getUserLogin("hanxiao1","123456")
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.io())
                .doOnNext(new Action1<HttpResult<User>>() {
                    @Override
                    public void call(HttpResult<User> user) {
                         //保存用户信息
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<HttpResult<User>>() {
                    @Override
                    public void onCompleted() {
                        //准备完
                    }
                    @Override
                    public void onError(Throwable e) {
                        //请求失败
                    }
                    @Override
                    public void onNext(HttpResult<User> user) {
                        //请求成功
                        Log.d("测试",user.toString()+"            "+user.getData().getAuthKey());//.getNickname();
                    }
                });

    }
}
