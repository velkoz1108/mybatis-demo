package com.model.test.ext;

import com.alibaba.fastjson.annotation.JSONField;
import com.model.test.UserStatus;
import lombok.Data;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/1 14:31
 */
@Data
public class MyUserStatus extends UserStatus {
    EnumStatus enumStatus;


}
