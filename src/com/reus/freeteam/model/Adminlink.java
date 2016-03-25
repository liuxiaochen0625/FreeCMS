package com.reus.freeteam.model;

import java.io.Serializable;

public class Adminlink implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_adminlink.id
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_adminlink.name
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_adminlink.url
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_adminlink.isok
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    private String isok;

    private String isokStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_adminlink.ordernum
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    private Integer ordernum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_adminlink.img
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_adminlink.type
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    private String type;
    public static String TYPE_SYS="0";//系统链接
    public static String TYPE_USER="1";//个人链接

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_adminlink.userid
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    private String userid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_adminlink.id
     *
     * @return the value of freecms_adminlink.id
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_adminlink.id
     *
     * @param id the value for freecms_adminlink.id
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_adminlink.name
     *
     * @return the value of freecms_adminlink.name
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_adminlink.name
     *
     * @param name the value for freecms_adminlink.name
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_adminlink.url
     *
     * @return the value of freecms_adminlink.url
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_adminlink.url
     *
     * @param url the value for freecms_adminlink.url
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_adminlink.isok
     *
     * @return the value of freecms_adminlink.isok
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public String getIsok() {
        return isok;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_adminlink.isok
     *
     * @param isok the value for freecms_adminlink.isok
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_adminlink.ordernum
     *
     * @return the value of freecms_adminlink.ordernum
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_adminlink.ordernum
     *
     * @param ordernum the value for freecms_adminlink.ordernum
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_adminlink.img
     *
     * @return the value of freecms_adminlink.img
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_adminlink.img
     *
     * @param img the value for freecms_adminlink.img
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_adminlink.type
     *
     * @return the value of freecms_adminlink.type
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_adminlink.type
     *
     * @param type the value for freecms_adminlink.type
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_adminlink.userid
     *
     * @return the value of freecms_adminlink.userid
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_adminlink.userid
     *
     * @param userid the value for freecms_adminlink.userid
     *
     * @mbggenerated Wed May 29 11:31:27 CST 2013
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

	public String getIsokStr() {
		if ("1".equals(isok)) {
			isokStr="是";
		}else {
			isokStr="否";
		}
		return isokStr;
	}

	public void setIsokStr(String isokStr) {
		this.isokStr = isokStr;
	}
}