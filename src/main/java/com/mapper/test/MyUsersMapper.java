package com.mapper.test;

import com.model.test.MyUsers;
import com.model.test.MyUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int countByExample(MyUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int deleteByExample(MyUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int insert(MyUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int insertSelective(MyUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    List<MyUsers> selectByExample(MyUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    MyUsers selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") MyUsers record, @Param("example") MyUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int updateByExample(@Param("record") MyUsers record, @Param("example") MyUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int updateByPrimaryKeySelective(MyUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    int updateByPrimaryKey(MyUsers record);
}