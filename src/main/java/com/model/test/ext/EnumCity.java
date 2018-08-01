package com.model.test.ext;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/1 15:25
 */

public enum EnumCity {
    SHANGHAI(100, "shanghai"), WUHAN(110, "wuhan"), HANGZHOU(120, "hangzhou"), BEIJING(130, "beijing");
    int value;
    String name;

    EnumCity(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    /*方法Value2CityTest是为了typeHandler后加的*/
    public static EnumCity getByValue(int value) {
        for (EnumCity city : EnumCity.values()) {
            if (city.value == value) {
                return city;
            }
        }
        throw new IllegalArgumentException("无效的value值: " + value + "!");
    }
}
