package com.java.pojo;

import com.alibaba.fastjson.JSONObject;

public class AipSpeech {
    private int ConnectionTimeoutInMillis;
    private int SocketTimeoutInMillis;

    public AipSpeech(String a,String b ,String c) {
        super();
    }
    public JSONObject asr(byte[] d, String a, int b, String c){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public int getConnectionTimeoutInMillis() {
        return ConnectionTimeoutInMillis;
    }

    public void setConnectionTimeoutInMillis(int connectionTimeoutInMillis) {
        ConnectionTimeoutInMillis = connectionTimeoutInMillis;
    }

    public int getSocketTimeoutInMillis() {
        return SocketTimeoutInMillis;
    }

    public void setSocketTimeoutInMillis(int socketTimeoutInMillis) {
        SocketTimeoutInMillis = socketTimeoutInMillis;
    }

    @Override
    public String toString() {
        return "AipSpeech{" +
                "ConnectionTimeoutInMillis=" + ConnectionTimeoutInMillis +
                ", SocketTimeoutInMillis=" + SocketTimeoutInMillis +
                '}';
    }
}
