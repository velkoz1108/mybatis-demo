package com.mapper.test.ext;

import com.model.test.ext.MyCity;
import com.model.test.ext.MyUserStatus;
import com.model.test.ext.MyUsersExt;

import java.util.List;

public interface MyUsersMapperExt {

    MyUsersExt selectJson();

//    EnumOrdinalTypeHandler
//    数据存的是 0 就对应 EnumStatus 的第1个
    List<MyUserStatus> selectEnum();

//    EnumTypeHandler
    List<MyUserStatus> selectEnum2();

    List<MyCity> selectEnum3();
}