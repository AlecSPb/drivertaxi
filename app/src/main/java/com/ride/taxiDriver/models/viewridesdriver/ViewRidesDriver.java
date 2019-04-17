
package com.ride.taxiDriver.models.viewridesdriver;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ViewRidesDriver {

    @SerializedName("result")
    @Expose
    private Integer result;
    @SerializedName("msg")
    @Expose
    private List<Msg> msg = null;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public List<Msg> getMsg() {
        return msg;
    }

    public void setMsg(List<Msg> msg) {
        this.msg = msg;
    }

}
