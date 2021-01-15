package com.example.thumbnailview;

import java.util.ArrayList;

public class ResponsePrdList {
    private String rtnCd;
    private String rtnMsg;
    private RtnData rtnData;


    public ResponsePrdList(String rtnCd, String rtnMsg, RtnData rtnData){
        this.rtnCd = rtnCd;
        this.rtnMsg = rtnMsg;
        this.rtnData = rtnData;
    }

    public String getRtnCd() {
        return rtnCd;
    }
    public String getRtnMsg() {
        return rtnMsg;
    }
    public RtnData getRtnData() {
        return rtnData;
    }
}
