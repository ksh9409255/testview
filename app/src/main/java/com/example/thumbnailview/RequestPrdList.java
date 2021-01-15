package com.example.thumbnailview;

public class RequestPrdList {
    private String allcId;
    private String pageNo;
    private String prdtCatgSeq;
    private String sort;
    private String srchWord;

    public RequestPrdList(String allcId, String pageNo, String prdtCatgSeq, String sort, String srchWord){
        this.allcId=allcId;
        this.pageNo=pageNo;
        this.prdtCatgSeq=prdtCatgSeq;
        this.sort=sort;
        this.srchWord=srchWord;
    }
}
