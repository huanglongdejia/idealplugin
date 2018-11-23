package com.hl.jsonformat;

/**
 * @author huanglong
 * @Description: json formate 使用
 * @date 2018/11/2314:26
 */
public class JsonFormat {
    /**
     * {"type":1,"activityId":11888,"pin":"feiyue89","time":"2018-11-23 14:11:51","channel":"2","token":"fdf98ea41285d3ddf8cd469a9dee340a","bizId":"11868361256","sku":"31241092821"}
     */

    /**
     * type : 1
     * activityId : 11888
     * pin : feiyue89
     * time : 2018-11-23 14:11:51
     * channel : 2
     * token : fdf98ea41285d3ddf8cd469a9dee340a
     * bizId : 11868361256
     * sku : 31241092821
     */

    private Integer type;
    private Integer activityId;
    private String pin;
    private String time;
    private String channel;
    private String token;
    private String bizId;
    private String sku;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
