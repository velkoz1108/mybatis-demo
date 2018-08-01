package com.mapper.test.ext;

import com.model.test.MyUsers;
import org.apache.ibatis.annotations.Select;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/1 16:40
 */

public interface MyAnnotationMapper {
    @Select("select user_id as userId,username from users where user_id = 1 ")
    public MyUsers getById();
}
