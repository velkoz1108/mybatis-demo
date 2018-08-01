package com.model.test.ext;

import com.model.test.UserStatus;
import lombok.Data;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/1 14:24
 */
public enum EnumStatus  {
    NORMAL(1, "正常"),
    FROZEN(2, "冻结"),
    DELETE(3, "注销"),
    WHY(4, "注销?"),
    REALLY(5, "注销??");
    private int code;
    private String info;

    EnumStatus(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
