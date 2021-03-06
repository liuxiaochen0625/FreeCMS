package com.reus.freeteam.cms.model;

import java.io.Serializable;

public class Link implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column link.id
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column link.parid
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    private String parid;
    private String isClass;//是否是查询分类
    private String className;//分类名称
    private String type;
    public static String TYPE_DOWN="1";//下拉链接
    public static String TYPE_IMG="2";//图片链接
    public static String TYPE_TEXT="3";//文字链接
    private String img;
    private String pagemark;
    private String pagemarks;
    private String classPagemarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column link.name
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column link.url
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column link.isok
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    private String isok;
    private String isokStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column link.ordernum
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    private Integer ordernum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column link.site
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    private String site;
    private String siteName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column link.id
     *
     * @return the value of link.id
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column link.id
     *
     * @param id the value for link.id
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column link.parid
     *
     * @return the value of link.parid
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public String getParid() {
        return parid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column link.parid
     *
     * @param parid the value for link.parid
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public void setParid(String parid) {
        this.parid = parid == null ? null : parid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column link.name
     *
     * @return the value of link.name
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column link.name
     *
     * @param name the value for link.name
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column link.url
     *
     * @return the value of link.url
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column link.url
     *
     * @param url the value for link.url
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column link.isok
     *
     * @return the value of link.isok
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public String getIsok() {
        return isok;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column link.isok
     *
     * @param isok the value for link.isok
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column link.ordernum
     *
     * @return the value of link.ordernum
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column link.ordernum
     *
     * @param ordernum the value for link.ordernum
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column link.site
     *
     * @return the value of link.site
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public String getSite() {
        return site;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column link.site
     *
     * @param site the value for link.site
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

	public String getIsokStr() {
		isokStr="否";
		if ("1".equals(isok)) {
			isokStr="是";
		}
		return isokStr;
	}

	public void setIsokStr(String isokStr) {
		this.isokStr = isokStr;
	}

	public String getIsClass() {
		return isClass;
	}

	public void setIsClass(String isClass) {
		this.isClass = isClass;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getPagemark() {
		return pagemark;
	}

	public void setPagemark(String pagemark) {
		this.pagemark = pagemark;
	}

	public String getPagemarks() {
		return pagemarks;
	}

	public void setPagemarks(String pagemarks) {
		this.pagemarks = pagemarks;
	}

	public String getClassPagemarks() {
		return classPagemarks;
	}

	public void setClassPagemarks(String classPagemarks) {
		this.classPagemarks = classPagemarks;
	}
}