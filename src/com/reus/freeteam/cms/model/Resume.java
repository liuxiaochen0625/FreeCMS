package com.reus.freeteam.cms.model;

import java.util.Date;

import com.reus.freeteam.util.DateUtil;

public class Resume {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.id
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String id;
    private String state;
    private String stateStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.siteid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String siteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.memberid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.membername
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String membername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.name
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.sex
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String sex;
    private String sexStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.birthday
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private Date birthday;
    private String birthdayStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.email
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.qq
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.tel
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.address
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.img
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.attch
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String attch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.job
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String job;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.content
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.addtime
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.recontent
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String recontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.retime
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private Date retime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.reuserid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String reuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.reusername
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String reusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_resume.ip
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    private String ip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.id
     *
     * @return the value of freecms_resume.id
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.id
     *
     * @param id the value for freecms_resume.id
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.siteid
     *
     * @return the value of freecms_resume.siteid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.siteid
     *
     * @param siteid the value for freecms_resume.siteid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.memberid
     *
     * @return the value of freecms_resume.memberid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.memberid
     *
     * @param memberid the value for freecms_resume.memberid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.membername
     *
     * @return the value of freecms_resume.membername
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getMembername() {
        return membername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.membername
     *
     * @param membername the value for freecms_resume.membername
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.name
     *
     * @return the value of freecms_resume.name
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.name
     *
     * @param name the value for freecms_resume.name
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.sex
     *
     * @return the value of freecms_resume.sex
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.sex
     *
     * @param sex the value for freecms_resume.sex
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.birthday
     *
     * @return the value of freecms_resume.birthday
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.birthday
     *
     * @param birthday the value for freecms_resume.birthday
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.email
     *
     * @return the value of freecms_resume.email
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.email
     *
     * @param email the value for freecms_resume.email
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.qq
     *
     * @return the value of freecms_resume.qq
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.qq
     *
     * @param qq the value for freecms_resume.qq
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.tel
     *
     * @return the value of freecms_resume.tel
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.tel
     *
     * @param tel the value for freecms_resume.tel
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.address
     *
     * @return the value of freecms_resume.address
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.address
     *
     * @param address the value for freecms_resume.address
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.img
     *
     * @return the value of freecms_resume.img
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.img
     *
     * @param img the value for freecms_resume.img
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.attch
     *
     * @return the value of freecms_resume.attch
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getAttch() {
        return attch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.attch
     *
     * @param attch the value for freecms_resume.attch
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setAttch(String attch) {
        this.attch = attch == null ? null : attch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.job
     *
     * @return the value of freecms_resume.job
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.job
     *
     * @param job the value for freecms_resume.job
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.content
     *
     * @return the value of freecms_resume.content
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.content
     *
     * @param content the value for freecms_resume.content
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.addtime
     *
     * @return the value of freecms_resume.addtime
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.addtime
     *
     * @param addtime the value for freecms_resume.addtime
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.recontent
     *
     * @return the value of freecms_resume.recontent
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getRecontent() {
        return recontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.recontent
     *
     * @param recontent the value for freecms_resume.recontent
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setRecontent(String recontent) {
        this.recontent = recontent == null ? null : recontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.retime
     *
     * @return the value of freecms_resume.retime
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public Date getRetime() {
        return retime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.retime
     *
     * @param retime the value for freecms_resume.retime
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setRetime(Date retime) {
        this.retime = retime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.reuserid
     *
     * @return the value of freecms_resume.reuserid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getReuserid() {
        return reuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.reuserid
     *
     * @param reuserid the value for freecms_resume.reuserid
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setReuserid(String reuserid) {
        this.reuserid = reuserid == null ? null : reuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.reusername
     *
     * @return the value of freecms_resume.reusername
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getReusername() {
        return reusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.reusername
     *
     * @param reusername the value for freecms_resume.reusername
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setReusername(String reusername) {
        this.reusername = reusername == null ? null : reusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_resume.ip
     *
     * @return the value of freecms_resume.ip
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_resume.ip
     *
     * @param ip the value for freecms_resume.ip
     *
     * @mbggenerated Wed Jul 10 17:35:22 CST 2013
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateStr() {
		stateStr="未回复";
		if ("1".equals(state)) {
			stateStr="已回复";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getBirthdayStr() {
		birthdayStr = DateUtil.format(birthday, "yyyy-MM-dd");
		return birthdayStr;
	}

	public void setBirthdayStr(String birthdayStr) {
		this.birthdayStr = birthdayStr;
	}

	public String getSexStr() {
		sexStr="女";
		if ("1".equals(sex)) {
			sexStr="男";
		}
		return sexStr;
	}

	public void setSexStr(String sexStr) {
		this.sexStr = sexStr;
	}
}