package com.reus.freeteam.cms.model;

import java.io.Serializable;
import java.util.Date;

import com.reus.freeteam.util.DateUtil;

public class Creditlog implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.id
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.memberid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private String memberid;
    private String membername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.creditruleid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private String creditruleid;
    private String creditrule;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.rewardtype
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private Integer type;
    private String typeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.credit
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private Integer credit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.experience
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private Integer experience;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.credittime
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private Date credittime;
    private Date credittimeToday;//查询条件
    private Date credittimeGreater;//查询条件
    private String credittimeStr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.id
     *
     * @return the value of freecms_creditlog.id
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.id
     *
     * @param id the value for freecms_creditlog.id
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.memberid
     *
     * @return the value of freecms_creditlog.memberid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.memberid
     *
     * @param memberid the value for freecms_creditlog.memberid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.creditruleid
     *
     * @return the value of freecms_creditlog.creditruleid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getCreditruleid() {
        return creditruleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.creditruleid
     *
     * @param creditruleid the value for freecms_creditlog.creditruleid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCreditruleid(String creditruleid) {
        this.creditruleid = creditruleid == null ? null : creditruleid.trim();
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.credit
     *
     * @return the value of freecms_creditlog.credit
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.credit
     *
     * @param credit the value for freecms_creditlog.credit
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.experience
     *
     * @return the value of freecms_creditlog.experience
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Integer getExperience() {
        return experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.experience
     *
     * @param experience the value for freecms_creditlog.experience
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.credittime
     *
     * @return the value of freecms_creditlog.credittime
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Date getCredittime() {
        return credittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.credittime
     *
     * @param credittime the value for freecms_creditlog.credittime
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCredittime(Date credittime) {
        this.credittime = credittime;
    }

	public Date getCredittimeToday() {
		return credittimeToday;
	}

	public void setCredittimeToday(Date credittimeToday) {
		this.credittimeToday = credittimeToday;
	}

	public Date getCredittimeGreater() {
		return credittimeGreater;
	}

	public void setCredittimeGreater(Date credittimeGreater) {
		this.credittimeGreater = credittimeGreater;
	}

	public String getCredittimeStr() {
		if (credittime!=null) {
			credittimeStr=DateUtil.format(credittime, "yyyy-MM-dd HH:mm");
		}
		return credittimeStr;
	}

	public void setCredittimeStr(String credittimeStr) {
		this.credittimeStr = credittimeStr;
	}

	public String getTypeStr() {
		if (1==type) {
			typeStr="奖励";
		}else {
			typeStr="惩罚";
		}
		return typeStr;
	}

	public void setTypeStr(String typeStr) {
		this.typeStr = typeStr;
	}

	public String getCreditrule() {
		return creditrule;
	}

	public void setCreditrule(String creditrule) {
		this.creditrule = creditrule;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}