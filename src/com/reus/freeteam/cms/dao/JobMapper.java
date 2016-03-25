package com.reus.freeteam.cms.dao;

import com.reus.freeteam.cms.model.Job;
import com.reus.freeteam.cms.model.JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int countByExample(JobExample example);
    int countByExampleCache(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int deleteByExample(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int insert(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int insertSelective(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    List<Job> selectByExample(JobExample example);
    List<Job> selectPageByExample(JobExample example);
    List<Job> selectPageByExampleCache(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    Job selectByPrimaryKey(String id);
    Job selectByPrimaryKeyCache(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int updateByPrimaryKeySelective(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_job
     *
     * @mbggenerated Sat Jul 06 16:55:27 CST 2013
     */
    int updateByPrimaryKey(Job record);
}