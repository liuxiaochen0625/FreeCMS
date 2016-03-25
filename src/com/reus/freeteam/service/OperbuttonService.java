package com.reus.freeteam.service;

import java.util.List;


import com.reus.freeteam.base.BaseService;
import com.reus.freeteam.dao.OperbuttonMapper;
import com.reus.freeteam.model.Operbutton;
import com.reus.freeteam.model.OperbuttonExample;
import com.reus.freeteam.model.OperbuttonExample.Criteria;


/**
 * 关于操作按钮的相关服务
 * @author freeteam
 * 2011-4-8
 */
public class OperbuttonService extends BaseService{

	private OperbuttonMapper operbuttonMapper;

	public OperbuttonMapper getOperbuttonMapper() {
		return operbuttonMapper;
	}

	public void setOperbuttonMapper(OperbuttonMapper operbuttonMapper) {
		this.operbuttonMapper = operbuttonMapper;
	}
	
	public OperbuttonService(){
		initMapper("operbuttonMapper");
	}
	/**
	 * 查询所有
	 * @param funcid
	 * @return
	 */
	public List<Operbutton> findAll() {
		return operbuttonMapper.selectByExample(null);
	}
	/**
	 * 查询菜单下有效操作按钮
	 * @param funcid
	 * @return
	 */
	public List<Operbutton> findByFuncOk(String funcid) {
		if (funcid!=null && funcid.trim().length()>0) {
			OperbuttonExample operbuttonExample=new OperbuttonExample();
			Criteria criteria=operbuttonExample.createCriteria();
			criteria.andFuncEqualTo(funcid);
			criteria.andIsokEqualTo("1");
			operbuttonExample.setOrderByClause("ordernum");
			return operbuttonMapper.selectByExample(operbuttonExample);
		}
		return null;
	}
	/**
	 * 查询菜单下有效操作按钮
	 * @param funcid
	 * @return
	 */
	public List<Operbutton> findByFunc(String funcid) {
		if (funcid!=null && funcid.trim().length()>0) {
			OperbuttonExample operbuttonExample=new OperbuttonExample();
			Criteria criteria=operbuttonExample.createCriteria();
			criteria.andFuncEqualTo(funcid);
			operbuttonExample.setOrderByClause("ordernum");
			return operbuttonMapper.selectByExample(operbuttonExample);
		}
		return null;
	}
	/**
	 * 查询操作按钮
	 * @param funcid
	 * @return
	 */
	public Operbutton findById(String id) {
		if (id!=null && id.trim().length()>0) {
			return operbuttonMapper.selectByPrimaryKey(id);
		}
		return null;
	}
	/**
	 * 判断操作按钮名是否存在
	 * @param name
	 * @return
	 */
	public boolean haveName(String funcId,String name){
		if (funcId!=null && funcId.trim().length()>0
				&& name!=null && name.trim().length()>0) {
			OperbuttonExample example=new OperbuttonExample();
			Criteria criteria=example.createCriteria();
			criteria.andFuncEqualTo(funcId);
			criteria.andNameEqualTo(name);
			return operbuttonMapper.countByExample(example)>0;
		}
		return false;
	}
	/**
	 * 添加
	 * @param operbutton
	 */
	public void insert(Operbutton operbutton){
		operbuttonMapper.insert(operbutton);
		DBCommit();
	}
	/**
	 * 更新
	 * @param operbutton
	 */
	public void update(Operbutton operbutton){
		operbuttonMapper.updateByPrimaryKey(operbutton);
		DBCommit();
	}
	/**
	 * 删除
	 * @param id
	 */
	public void delete(String id){
		operbuttonMapper.deleteByPrimaryKey(id);
		DBCommit();
	}
}
