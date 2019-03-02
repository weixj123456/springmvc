package com.jsx.model;

public class Require {
    private Integer id;

    private Integer reqid;

    private String type;

    private String reqname;

    private String istest;

    private String reqpartment;

    private String relatesys;

    private String yewuer;

    private String tester;

    private String isproduct;

    private String developer;

    private String isupdate;

    private String productdate;

    private String descp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReqid() {
        return reqid;
    }

    public void setReqid(Integer reqid) {
        this.reqid = reqid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getReqname() {
        return reqname;
    }

    public void setReqname(String reqname) {
        this.reqname = reqname == null ? null : reqname.trim();
    }

    public String getIstest() {
        return istest;
    }

    public void setIstest(String istest) {
        this.istest = istest == null ? null : istest.trim();
    }

    public String getReqpartment() {
        return reqpartment;
    }

    public void setReqpartment(String reqpartment) {
        this.reqpartment = reqpartment == null ? null : reqpartment.trim();
    }

    public String getRelatesys() {
        return relatesys;
    }

    public void setRelatesys(String relatesys) {
        this.relatesys = relatesys == null ? null : relatesys.trim();
    }

    public String getYewuer() {
        return yewuer;
    }

    public void setYewuer(String yewuer) {
        this.yewuer = yewuer == null ? null : yewuer.trim();
    }

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester == null ? null : tester.trim();
    }

    public String getIsproduct() {
        return isproduct;
    }

    public void setIsproduct(String isproduct) {
        this.isproduct = isproduct == null ? null : isproduct.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(String isupdate) {
        this.isupdate = isupdate == null ? null : isupdate.trim();
    }

    public String getProductdate() {
        return productdate;
    }

    public void setProductdate(String productdate) {
        this.productdate = productdate == null ? null : productdate.trim();
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp == null ? null : descp.trim();
    }
}