package com.model.test;

public class UserStatus {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_status.id
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_status.status
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_status.en_status
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    private String enStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_status.user_id
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_status.city_code
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    private Integer cityCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_status.id
     *
     * @return the value of user_status.id
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_status.id
     *
     * @param id the value for user_status.id
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_status.status
     *
     * @return the value of user_status.status
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_status.status
     *
     * @param status the value for user_status.status
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_status.en_status
     *
     * @return the value of user_status.en_status
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public String getEnStatus() {
        return enStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_status.en_status
     *
     * @param enStatus the value for user_status.en_status
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public void setEnStatus(String enStatus) {
        this.enStatus = enStatus == null ? null : enStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_status.user_id
     *
     * @return the value of user_status.user_id
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_status.user_id
     *
     * @param userId the value for user_status.user_id
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_status.city_code
     *
     * @return the value of user_status.city_code
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public Integer getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_status.city_code
     *
     * @param cityCode the value for user_status.city_code
     *
     * @mbggenerated Wed Aug 01 15:25:12 CST 2018
     */
    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }
}