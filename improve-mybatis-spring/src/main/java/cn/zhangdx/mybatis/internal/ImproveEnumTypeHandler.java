package cn.zhangdx.mybatis.internal;

import cn.zhangdx.mybatis.annotation.EnumValue;
import org.apache.ibatis.type.EnumTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.lang.reflect.Field;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 简易版Java枚举和Mybatis的类型转换器
 * @author ZDX
 * @date 2025/9/13 14:44
 */
public class ImproveEnumTypeHandler<E extends Enum<E>> extends EnumTypeHandler<E> {

    private final Field propertyField;
    private final Class<E> enumClassType;
    private final E[] enumConstants;

    public ImproveEnumTypeHandler(Class<E> type) {
        super(type);
        this.enumClassType = type;
        this.propertyField = this.resolveEnumValueField(type);
        this.enumConstants = type.getEnumConstants();
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        if (notExistsEnumValueField()) {
            super.setNonNullParameter(ps, i, parameter, jdbcType);
            return;
        }
        Object object = getEnumValue(parameter);
        if (jdbcType == null) {
            ps.setObject(i, object);
        } else {
            ps.setObject(i, object, jdbcType.TYPE_CODE);
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        if (notExistsEnumValueField()) {
            return super.getNullableResult(rs, columnName);
        }
        Object value = rs.getObject(columnName, propertyField.getType());
        if (value == null || rs.wasNull()) {
            return null;
        }
        return valueOf(value);
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        if (notExistsEnumValueField()) {
            return super.getNullableResult(rs, columnIndex);
        }
        Object value = rs.getObject(columnIndex, propertyField.getType());
        if (value == null || rs.wasNull()) {
            return null;
        }
        return valueOf(value);
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        if (notExistsEnumValueField()) {
            return super.getNullableResult(cs, columnIndex);
        }
        Object value = cs.getObject(columnIndex, propertyField.getType());
        if (value == null || cs.wasNull()) {
            return null;
        }
        return valueOf(value);
    }

    private E valueOf(Object value) {
        E[] enumConstants = this.enumConstants;
        for (E enumConstant : enumConstants) {
            Object enumValue = getEnumValue(enumConstant);
            if (enumValue != null && enumValue.equals(value)) {
                return enumConstant;
            }
        }
        return null;
    }

    private Object getEnumValue(E parameter) {
        Field field = this.propertyField;
        if (field == null) {
            return null;
        }
        try {
            field.setAccessible(true);
            return field.get(parameter);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private boolean notExistsEnumValueField() {
        return this.propertyField == null;
    }

    private Field resolveEnumValueField(Class<? extends Enum> enumClass) {
        for (Field field : enumClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(EnumValue.class)) {
                return field;
            }
        }
        return null;
    }
}
