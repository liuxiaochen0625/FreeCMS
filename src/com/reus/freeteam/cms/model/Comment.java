package com.reus.freeteam.cms.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.reus.freeteam.util.DateUtil;

public class Comment {
	
	
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.id
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String id;


    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sdffull=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Date starttime;
    private Date endtime;
    private String starttimeStr;
    private String endtimeStr;
    private int countnum;
    private String datename;
    private String sitename;
    private String commentstate;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.siteid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String siteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.memberid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.membername
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String membername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.isAnonymous
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String isanonymous;
    private String isanonymousStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.objid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String objid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.objtype
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String objtype;
    private String objtypeStr;
    private Map<String, String> objtypes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.ip
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.addtime
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private Date addtime;
    private String addtimeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.state
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String state;
    private String stateStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_comment.content
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.id
     *
     * @return the value of freecms_comment.id
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.id
     *
     * @param id the value for freecms_comment.id
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.siteid
     *
     * @return the value of freecms_comment.siteid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.siteid
     *
     * @param siteid the value for freecms_comment.siteid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.memberid
     *
     * @return the value of freecms_comment.memberid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.memberid
     *
     * @param memberid the value for freecms_comment.memberid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.membername
     *
     * @return the value of freecms_comment.membername
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getMembername() {
        return membername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.membername
     *
     * @param membername the value for freecms_comment.membername
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.isAnonymous
     *
     * @return the value of freecms_comment.isAnonymous
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getIsanonymous() {
        return isanonymous;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.isAnonymous
     *
     * @param isanonymous the value for freecms_comment.isAnonymous
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setIsanonymous(String isanonymous) {
        this.isanonymous = isanonymous == null ? null : isanonymous.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.objid
     *
     * @return the value of freecms_comment.objid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getObjid() {
        return objid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.objid
     *
     * @param objid the value for freecms_comment.objid
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setObjid(String objid) {
        this.objid = objid == null ? null : objid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.objtype
     *
     * @return the value of freecms_comment.objtype
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getObjtype() {
        return objtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.objtype
     *
     * @param objtype the value for freecms_comment.objtype
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setObjtype(String objtype) {
        this.objtype = objtype == null ? null : objtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.ip
     *
     * @return the value of freecms_comment.ip
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.ip
     *
     * @param ip the value for freecms_comment.ip
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.addtime
     *
     * @return the value of freecms_comment.addtime
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.addtime
     *
     * @param addtime the value for freecms_comment.addtime
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.state
     *
     * @return the value of freecms_comment.state
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.state
     *
     * @param state the value for freecms_comment.state
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_comment.content
     *
     * @return the value of freecms_comment.content
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_comment.content
     *
     * @param content the value for freecms_comment.content
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	public Map<String, String> getObjtypes() {
		objtypes=new HashMap<String, String>();
		objtypes.put("info", "信息");
		return objtypes;
	}

	public void setObjtypes(Map<String, String> objtypes) {
		this.objtypes = objtypes;
	}

	public String getObjtypeStr() {
		Map<String, String> objtypes=getObjtypes();
		if (objtypes!=null && getObjtype()!=null) {
			if (objtypes.containsKey(objtype.trim())) {
				objtypeStr=objtypes.get(objtype.trim());
			}
		}
		return objtypeStr;
	}

	public void setObjtypeStr(String objtypeStr) {
		this.objtypeStr = objtypeStr;
	}

	public String getIsanonymousStr() {
		isanonymousStr="否";
		if ("1".equals(isanonymous)) {
			isanonymousStr="是";
		}
		return isanonymousStr;
	}

	public void setIsanonymousStr(String isanonymousStr) {
		this.isanonymousStr = isanonymousStr;
	}

	public String getStateStr() {
		stateStr="未审核";
		if ("1".equals(state)) {
			stateStr="已审核";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getAddtimeStr() {
		if (addtime!=null) {
			addtimeStr=DateUtil.format(addtime, "yyyy-MM-dd HH:mm");
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getStarttimeStr() {
		if (starttime!=null) {
			starttimeStr=sdffull.format(starttime);
		}
		return starttimeStr;
	}

	public void setStarttimeStr(String starttimeStr) {
		this.starttimeStr = starttimeStr;
	}

	public String getEndtimeStr() {
		if (endtime!=null) {
			endtimeStr=sdffull.format(endtime);
		}
		return endtimeStr;
	}

	public void setEndtimeStr(String endtimeStr) {
		this.endtimeStr = endtimeStr;
	}


	public int getCountnum() {
		return countnum;
	}

	public void setCountnum(int countnum) {
		this.countnum = countnum;
	}

	public String getDatename() {
		return datename;
	}

	public void setDatename(String datename) {
		this.datename = datename;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getCommentstate() {
		return commentstate;
	}

	public void setCommentstate(String commentstate) {
		this.commentstate = commentstate;
	}
}