package com.example.thumbnailview;

import java.util.ArrayList;

public class List {
    private String prdtId;
    private String allcId;
    private String allcNm;
    private String hotYn;
    private ArrayList<ListArMetaId> listArMetaId = null;
    private String logoFileUrl;
    private String modlNm;
    private String newYn;
    private ArrayList<PrdtCatgList> prdtCatgList = null;
    private String prdtNm;
    private String rate;
    private String thumFileUrl;

    public String getPrdtId() { return prdtId; }
    public String getAllcId() { return allcId; }
    public String getAllcNm() { return allcNm; }
    public String getHotYn() { return hotYn; }
    public ArrayList<ListArMetaId> getListArMetaId() { return listArMetaId; }
    public String getLogoFileUrl() { return logoFileUrl; }
    public String getModlNm() { return modlNm; }
    public String getNewYn() { return newYn; }
    public ArrayList<PrdtCatgList> getPrdtCatgList() { return prdtCatgList; }
    public String getPrdtNm() { return prdtNm; }
    public String getRate() { return rate; }
    public String getThumFileUrl() { return thumFileUrl; }
}
