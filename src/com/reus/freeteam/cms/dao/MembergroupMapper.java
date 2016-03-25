package com.reus.freeteam.cms.dao;

import com.reus.freeteam.cms.model.Membergroup;
import com.reus.freeteam.cms.model.MembergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MembergroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int countByExample(MembergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int deleteByExample(MembergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int insert(Membergroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int insertSelective(Membergroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    List<Membergroup> selectByExample(MembergroupExample example);
    List<Membergroup> selectPageByExample(MembergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    Membergroup selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int updateByExampleSelective(@Param("record") Membergroup record, @Param("example") MembergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int updateByExample(@Param("record") Membergroup record, @Param("example") MembergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int updateByPrimaryKeySelective(Membergroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    int updateByPrimaryKey(Membergroup record);
}