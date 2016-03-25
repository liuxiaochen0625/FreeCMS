package com.reus.freeteam.action;

import java.util.List;


import com.reus.freeteam.base.BaseAction;
import com.reus.freeteam.dao.OperlogsMapper;
import com.reus.freeteam.model.Operlogs;
import com.reus.freeteam.model.OperlogsExample;
import com.reus.freeteam.model.RoleFunc;
import com.reus.freeteam.model.OperlogsExample.Criteria;
import com.reus.freeteam.util.Pager;


/**
 * 
 * <p>Title: OperLogAction.java</p>
 * 
 * <p>Description: 操作日志</p>
 * 
 * <p>Date: Dec 14, 2011</p>
 * 
 * <p>Time: 10:45:59 PM</p>
 * 
 * <p>Copyright: 2011</p>
 * 
 * <p>Company: freeteam</p>
 * 
 * @author freeteam
 * @version 1.0
 * 
 * <p>============================================</p>
 * <p>Modification History
 * <p>Mender: </p>
 * <p>Date: </p>
 * <p>Reason: </p>
 * <p>============================================</p>
 */
public class OperLogAction extends BaseAction{

	private Operlogs operlog;
	private OperlogsMapper operlogsMapper;
	private List<Operlogs> operlogList;
	private String order="opertime desc";
	public OperLogAction(){
		initMapper("operlogsMapper");
	}


	/**
	 * 列表
	 * @return
	 */
	public String list(){
		if (order.trim().length()==0) {
			order=" opertime desc ";
		}
		OperlogsExample example=new OperlogsExample();
		Criteria criteria=example.createCriteria();
		if (operlog!=null && operlog.getLoginname()!=null && operlog.getLoginname().trim().length()>0) {
			criteria.andLoginnameLike("%"+operlog.getLoginname().trim()+"%");
		}
		if (operlog!=null && operlog.getContent()!=null && operlog.getContent().trim().length()>0) {
			criteria.andContentLike("%"+operlog.getContent().trim()+"%");
		}
		if (operlog!=null && operlog.getIp()!=null && operlog.getIp().trim().length()>0) {
			criteria.andIpLike("%"+operlog.getIp().trim()+"%");
		}
		if (order!=null && order.trim().length()>0) {
			example.setOrderByClause(order);
		}
		//非admin用户只能查看自己的操作日志
		if (!isAdminLogin()) {
			criteria.andLoginnameEqualTo(getLoginName());
		}
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		operlogList=operlogsMapper.selectPageByExample(example);
		totalCount=operlogsMapper.countByExample(example);
		Pager pager=new Pager(getHttpRequest());
		pager.appendParam("operlog.loginname");
		pager.appendParam("operlog.content");
		pager.appendParam("operlog.ip");
		pager.appendParam("pageSize");
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.appendParam("order");
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStr("operLog_list.do");
		pageStr=pager.getOutStr();
		return "list";
	}
	
	
	
	public Operlogs getOperlog() {
		return operlog;
	}

	public void setOperlog(Operlogs operlog) {
		this.operlog = operlog;
	}


	public OperlogsMapper getOperlogsMapper() {
		return operlogsMapper;
	}


	public void setOperlogsMapper(OperlogsMapper operlogsMapper) {
		this.operlogsMapper = operlogsMapper;
	}


	public List<Operlogs> getOperlogList() {
		return operlogList;
	}


	public void setOperlogList(List<Operlogs> operlogList) {
		this.operlogList = operlogList;
	}


	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}
	
	
}
