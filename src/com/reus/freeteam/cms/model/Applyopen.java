package com.reus.freeteam.cms.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Applyopen implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.id
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String id;
    private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    private String addtimeStr;
    private String retimeStr;
    private String stateStr;
    private String typeStr;
    private String lpname;



    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.linkman
     *
     * @mbggenerated Thu Mar 21 12:51:34 CST 2013
     */
    private String linkman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.linkmantel
     *
     * @mbggenerated Thu Mar 21 12:51:34 CST 2013
     */
    private String linkmantel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.lpfax
     *
     * @mbggenerated Thu Mar 21 12:51:34 CST 2013
     */
    private String lpfax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.lpaddress
     *
     * @mbggenerated Thu Mar 21 12:51:34 CST 2013
     */
    private String lpaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.lppostcode
     *
     * @mbggenerated Thu Mar 21 12:51:34 CST 2013
     */
    private String lppostcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.lpemail
     *
     * @mbggenerated Thu Mar 21 12:51:34 CST 2013
     */
    private String lpemail;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.type
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.name
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.unit
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.cardtype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String cardtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.cardid
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String cardid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.address
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.postcode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String postcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.tel
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.fax
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String fax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.email
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.unitcode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String unitcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.legalperson
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String legalperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.buslicense
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String buslicense;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.detail
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.touse
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String touse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.pubtype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String pubtype;
    private String pubtypeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.gettype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String gettype;
    private String gettypeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.applyfree
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String applyfree;
    private String applyfreeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.othertype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String othertype;
    private String othertypeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.infonum
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String infonum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.querycode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String querycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.ip
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.state
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.recontent
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String recontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.retime
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private Date retime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.proflow
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String proflow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.userid
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_applyopen.addtime
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    private Date addtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.id
     *
     * @return the value of freecms_applyopen.id
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.id
     *
     * @param id the value for freecms_applyopen.id
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.type
     *
     * @return the value of freecms_applyopen.type
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.type
     *
     * @param type the value for freecms_applyopen.type
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.name
     *
     * @return the value of freecms_applyopen.name
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.name
     *
     * @param name the value for freecms_applyopen.name
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.unit
     *
     * @return the value of freecms_applyopen.unit
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.unit
     *
     * @param unit the value for freecms_applyopen.unit
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.cardtype
     *
     * @return the value of freecms_applyopen.cardtype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.cardtype
     *
     * @param cardtype the value for freecms_applyopen.cardtype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.cardid
     *
     * @return the value of freecms_applyopen.cardid
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.cardid
     *
     * @param cardid the value for freecms_applyopen.cardid
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.address
     *
     * @return the value of freecms_applyopen.address
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.address
     *
     * @param address the value for freecms_applyopen.address
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.postcode
     *
     * @return the value of freecms_applyopen.postcode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.postcode
     *
     * @param postcode the value for freecms_applyopen.postcode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.tel
     *
     * @return the value of freecms_applyopen.tel
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.tel
     *
     * @param tel the value for freecms_applyopen.tel
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.fax
     *
     * @return the value of freecms_applyopen.fax
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getFax() {
        return fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.fax
     *
     * @param fax the value for freecms_applyopen.fax
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.email
     *
     * @return the value of freecms_applyopen.email
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.email
     *
     * @param email the value for freecms_applyopen.email
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.unitcode
     *
     * @return the value of freecms_applyopen.unitcode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.unitcode
     *
     * @param unitcode the value for freecms_applyopen.unitcode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode == null ? null : unitcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.legalperson
     *
     * @return the value of freecms_applyopen.legalperson
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getLegalperson() {
        return legalperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.legalperson
     *
     * @param legalperson the value for freecms_applyopen.legalperson
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.buslicense
     *
     * @return the value of freecms_applyopen.buslicense
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getBuslicense() {
        return buslicense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.buslicense
     *
     * @param buslicense the value for freecms_applyopen.buslicense
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setBuslicense(String buslicense) {
        this.buslicense = buslicense == null ? null : buslicense.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.detail
     *
     * @return the value of freecms_applyopen.detail
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.detail
     *
     * @param detail the value for freecms_applyopen.detail
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.touse
     *
     * @return the value of freecms_applyopen.touse
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getTouse() {
        return touse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.touse
     *
     * @param touse the value for freecms_applyopen.touse
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setTouse(String touse) {
        this.touse = touse == null ? null : touse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.pubtype
     *
     * @return the value of freecms_applyopen.pubtype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getPubtype() {
        return pubtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.pubtype
     *
     * @param pubtype the value for freecms_applyopen.pubtype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setPubtype(String pubtype) {
        this.pubtype = pubtype == null ? null : pubtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.gettype
     *
     * @return the value of freecms_applyopen.gettype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getGettype() {
        return gettype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.gettype
     *
     * @param gettype the value for freecms_applyopen.gettype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setGettype(String gettype) {
        this.gettype = gettype == null ? null : gettype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.applyfree
     *
     * @return the value of freecms_applyopen.applyfree
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getApplyfree() {
        return applyfree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.applyfree
     *
     * @param applyfree the value for freecms_applyopen.applyfree
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setApplyfree(String applyfree) {
        this.applyfree = applyfree == null ? null : applyfree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.othertype
     *
     * @return the value of freecms_applyopen.othertype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getOthertype() {
        return othertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.othertype
     *
     * @param othertype the value for freecms_applyopen.othertype
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setOthertype(String othertype) {
        this.othertype = othertype == null ? null : othertype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.infonum
     *
     * @return the value of freecms_applyopen.infonum
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getInfonum() {
        return infonum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.infonum
     *
     * @param infonum the value for freecms_applyopen.infonum
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setInfonum(String infonum) {
        this.infonum = infonum == null ? null : infonum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.querycode
     *
     * @return the value of freecms_applyopen.querycode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getQuerycode() {
        return querycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.querycode
     *
     * @param querycode the value for freecms_applyopen.querycode
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setQuerycode(String querycode) {
        this.querycode = querycode == null ? null : querycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.ip
     *
     * @return the value of freecms_applyopen.ip
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.ip
     *
     * @param ip the value for freecms_applyopen.ip
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.state
     *
     * @return the value of freecms_applyopen.state
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.state
     *
     * @param state the value for freecms_applyopen.state
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.recontent
     *
     * @return the value of freecms_applyopen.recontent
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getRecontent() {
        return recontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.recontent
     *
     * @param recontent the value for freecms_applyopen.recontent
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setRecontent(String recontent) {
        this.recontent = recontent == null ? null : recontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.retime
     *
     * @return the value of freecms_applyopen.retime
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public Date getRetime() {
        return retime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.retime
     *
     * @param retime the value for freecms_applyopen.retime
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setRetime(Date retime) {
        this.retime = retime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.proflow
     *
     * @return the value of freecms_applyopen.proflow
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getProflow() {
        return proflow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.proflow
     *
     * @param proflow the value for freecms_applyopen.proflow
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setProflow(String proflow) {
        this.proflow = proflow == null ? null : proflow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.userid
     *
     * @return the value of freecms_applyopen.userid
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.userid
     *
     * @param userid the value for freecms_applyopen.userid
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_applyopen.addtime
     *
     * @return the value of freecms_applyopen.addtime
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_applyopen.addtime
     *
     * @param addtime the value for freecms_applyopen.addtime
     *
     * @mbggenerated Wed Mar 20 16:49:42 CST 2013
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
	public String getAddtimeStr() {
		if (addtime!=null) {
			addtimeStr=sdf.format(addtime);
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}

	public String getRetimeStr() {
		if (retime!=null) {
			retimeStr=sdf.format(retime);
		}
		return retimeStr;
	}

	public void setRetimeStr(String retimeStr) {
		this.retimeStr = retimeStr;
	}
	public String getStateStr() {
		if ("1".equals(state)) {
			stateStr="已办结";
		}else {
			stateStr="办理中";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getTypeStr() {
		if ("1".equals(type)) {
			typeStr="法人/其他组织";
		}else {
			typeStr="公民";
		}
		return typeStr;
	}

	public void setTypeStr(String typeStr) {
		this.typeStr = typeStr;
	}

	public String getPubtypeStr() {
		pubtypeStr="纸面";
		if ("1".equals(pubtype)) {
			pubtypeStr="电子邮件";
		}
		else if ("2".equals(pubtype)) {
			pubtypeStr="光盘";
		}
		else if ("3".equals(pubtype)) {
			pubtypeStr="磁盘";
		}
		return pubtypeStr;
	}

	public void setPubtypeStr(String pubtypeStr) {
		this.pubtypeStr = pubtypeStr;
	}

	public String getGettypeStr() {
		gettypeStr="邮寄";
		if ("1".equals(gettype)) {
			gettypeStr="快递";
		}
		else if ("2".equals(gettype)) {
			gettypeStr="电子邮件";
		}
		else if ("3".equals(gettype)) {
			gettypeStr="传真";
		}
		else if ("4".equals(gettype)) {
			gettypeStr="自行领取";
		}
		return gettypeStr;
	}

	public void setGettypeStr(String gettypeStr) {
		this.gettypeStr = gettypeStr;
	}

	public String getApplyfreeStr() {
		applyfreeStr="不";
		if ("1".equals(applyfree)) {
			applyfreeStr="申请。请提供相关证明";
		}
		return applyfreeStr;
	}

	public void setApplyfreeStr(String applyfreeStr) {
		this.applyfreeStr = applyfreeStr;
	}

	public String getOthertypeStr() {
		othertypeStr="否";
		if ("1".equals(othertype)) {
			othertypeStr="是";
		}
		return othertypeStr;
	}

	public void setOthertypeStr(String othertypeStr) {
		this.othertypeStr = othertypeStr;
	}

	public String getLpname() {
		return lpname;
	}

	public void setLpname(String lpname) {
		this.lpname = lpname;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getLinkmantel() {
		return linkmantel;
	}

	public void setLinkmantel(String linkmantel) {
		this.linkmantel = linkmantel;
	}

	public String getLpfax() {
		return lpfax;
	}

	public void setLpfax(String lpfax) {
		this.lpfax = lpfax;
	}

	public String getLpaddress() {
		return lpaddress;
	}

	public void setLpaddress(String lpaddress) {
		this.lpaddress = lpaddress;
	}

	public String getLppostcode() {
		return lppostcode;
	}

	public void setLppostcode(String lppostcode) {
		this.lppostcode = lppostcode;
	}

	public String getLpemail() {
		return lpemail;
	}

	public void setLpemail(String lpemail) {
		this.lpemail = lpemail;
	}
}