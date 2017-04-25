package com.gumu.project.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Loki on 2017/2/21.
 */

public class HttpResult<T> {
    @SerializedName("status")
    @Expose
    private  int status;
    @SerializedName("data")
    @Expose
    private T data;

    public T getData(){
        return this.data;
    }

    public int getStatus(){
        return  this.status;
    }

}
