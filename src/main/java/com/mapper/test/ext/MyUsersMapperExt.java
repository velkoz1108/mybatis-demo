package com.mapper.test.ext;

import com.model.test.MyUsers;
import com.model.test.MyUsersExample;
import com.model.test.ext.MyUsersExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyUsersMapperExt {

    MyUsersExt selectJson();

}