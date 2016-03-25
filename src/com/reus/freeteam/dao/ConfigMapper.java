package com.reus.freeteam.dao;

import com.reus.freeteam.model.Config;
import com.reus.freeteam.model.ConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int countByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int deleteByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int insert(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int insertSelective(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    List<Config> selectByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    Config selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int updateByPrimaryKeySelective(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_config
     *
     * @mbggenerated Mon Jan 14 20:20:20 CST 2013
     */
    int updateByPrimaryKey(Config record);
    int updateByCode(Config record);
}