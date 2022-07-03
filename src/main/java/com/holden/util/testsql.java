package com.holden.util;

import java.sql.*;

/**
 * @ClassName sheji-testsql
 * @Athor Holden_-__--___Xiao
 * @Create 2022年7月03日22:27 - 周日
 * @Describe
 */
public class testsql {
    public static void main(String[] args) throws SQLException {
        Connection conn = DruidUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from department");
        //执行查询
        ResultSet resultSet = ps.executeQuery();
        String insert_sql = "";

        ResultSetMetaData metaData = resultSet.getMetaData();
        for (int i = 1; i < metaData.getColumnCount() + 1; i++) {
            String columnName = metaData.getColumnName(i);
            String columnType = metaData.getColumnTypeName(i);
            insert_sql = "insert into xxx values(" + i + "," + columnName + "," + columnType + ")";
            System.out.println(insert_sql);
        }

        DruidUtil.closeAll(resultSet, ps, conn);


    }
}
