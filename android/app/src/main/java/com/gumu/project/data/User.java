package com.gumu.project.data;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Loki on 2017/2/21.
 */

public class User {

    @SerializedName("user_id")
    @Expose
    private int userId;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("head_img")
    @Expose
    private String headImg;
    @SerializedName("sex")
    @Expose
    private int sex;
    @SerializedName("level")
    @Expose
    private int level;
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("auth_key")
    @Expose
    private String authKey;

    public void setUserId(@NonNull Integer userid){
        this.userId=  userid;
    }
    public int getUserId(){
        return this.userId;
    }

    public void setNickname(@NonNull String nickname){
        this.nickname=  nickname;
    }
    public String getNickname(){
        return this.nickname;
    }

    public void setHeadImg(@NonNull String headImg){
        this.headImg=  headImg;
    }
    public String getHeadImg(){
        return this.headImg;
    }

    public void setSex(@NonNull Integer sex){
        this.sex=  sex;
    }
    public int getSex(){
        return this.sex;
    }

    public void setLevel(@NonNull Integer level){
        this.level=  level;
    }
    public int getLevel(){
        return this.level;
    }

    public void setStatus(@NonNull Integer status){
        this.status=  status;
    }
    public int getStatus(){
        return this.status;
    }

    public void setAuthKey(@NonNull String authKey){
        this.authKey=  authKey;
    }
    public String getAuthKey(){
        return this.authKey;
    }



}
