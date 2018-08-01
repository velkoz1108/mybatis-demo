package com.web;

import com.mapper.test.ext.MyUsersMapperExt;
import com.model.test.ext.MyUserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/1 15:12
 */
@RestController
public class TestController {
    @Autowired
    private MyUsersMapperExt myUsersMapperExt;

    @RequestMapping("/test")
    public List<MyUserStatus> test() {
        List<MyUserStatus> userStatus = myUsersMapperExt.selectEnum2();
        return userStatus;
    }

    @RequestMapping("/test2")
    public MyUserStatus test2() {
        List<MyUserStatus> userStatus = myUsersMapperExt.selectEnum2();
        return userStatus.get(0);
    }
}
