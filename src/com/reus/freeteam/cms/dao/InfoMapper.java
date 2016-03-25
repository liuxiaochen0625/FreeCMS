package com.reus.freeteam.cms.dao;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.reus.freeteam.cms.model.Info;
import com.reus.freeteam.cms.model.InfoExample;

public interface InfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int countByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int deleteByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int insert(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int insertSelective(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    List<Info> selectByExampleWithBLOBs(InfoExample example);
    List<Info> workloadPage(InfoExample example);
    List<Info> workload(InfoExample example);
    List<Info> siteStatPage(InfoExample example);
    List<Info> siteStat(InfoExample example);
    List<Info> channelStat(InfoExample example);
    List<Info> infoUpdateYear(InfoExample example);
    List<Info> infoUpdateYearPage(InfoExample example);
    List<Info> infoUpdateMonth(InfoExample example);
    List<Info> infoUpdateMonthPage(InfoExample example);
    List<Info> infoUpdateDay(InfoExample example);
    List<Info> infoUpdateDayPage(InfoExample example);
    List<Info> infoUpdateWeek(InfoExample example);
    int workloadCount(InfoExample example);
    int workloadSum(InfoExample example);
    int siteStatCount(InfoExample example);
    int siteStatSum(InfoExample example);
    int channelStatCount(InfoExample example);
    int channelStatSum(InfoExample example);
    int infoUpdateYearCount(InfoExample example);
    int infoUpdateYearSum(InfoExample example);
    int infoUpdateMonthCount(InfoExample example);
    int infoUpdateMonthSum(InfoExample example);
    int infoUpdateDayCount(InfoExample example);
    int infoUpdateDaySum(InfoExample example);
    int infoUpdateWeekSum(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    List<Info> selectByExample(InfoExample example);

    List<Info> selectPageByExample(InfoExample example);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    Info selectByPrimaryKey(String id);
    Info selectClickByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int updateByExampleWithBLOBs(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int updateByPrimaryKeySelective(Info record);
    int click(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int updateByPrimaryKeyWithBLOBs(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    int updateByPrimaryKey(Info record);
}