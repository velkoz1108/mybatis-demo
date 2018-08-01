package com.model.test.ext;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/1 15:28
 */
@MappedTypes({EnumCity.class, EnumStatus.class})
public class CityTypeHandler extends BaseTypeHandler<EnumCity> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, EnumCity enumCity, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, enumCity.getValue());
        preparedStatement.setString(i, enumCity.getName());
    }

    @Override
    public EnumCity getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return EnumCity.getByValue(resultSet.getInt(s));
    }

    @Override
    public EnumCity getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return EnumCity.getByValue(resultSet.getInt(i));
    }

    @Override
    public EnumCity getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return EnumCity.getByValue(callableStatement.getInt(i));
    }
}
