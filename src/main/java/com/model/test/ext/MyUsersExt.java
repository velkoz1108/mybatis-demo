package com.model.test.ext;

import com.model.test.MyUsers;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MyUsersExt extends MyUsers {

    private List<String> strArrList;

    private ObjJsonData objJsonData;

    private List<Map<String,Object>> objArrList ;
}