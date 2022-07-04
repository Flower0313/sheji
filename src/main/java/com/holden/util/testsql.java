package com.holden.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * @ClassName sheji-testsql
 * @Athor Holden_-__--___Xiao
 * @Create 2022年7月03日22:27 - 周日
 * @Describe
 */
public class testsql {
    private static final Logger LOGGER = LoggerFactory.getLogger(testsql.class);

    public static void main(String[] args) throws SQLException {
        Connection conn = DruidUtil.getConnection();
        String database = args[0];
        String tableName = args[1];
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        ResultSetMetaData metaData = null;
        String insert_sql = "";

        try {
            ps = conn.prepareStatement("select * from " + tableName);
            //执行查询
            resultSet = ps.executeQuery();
            metaData = resultSet.getMetaData();
            for (int i = 1; i < metaData.getColumnCount() + 1; i++) {
                String columnName = metaData.getColumnName(i);
                String columnType = metaData.getColumnTypeName(i);
                insert_sql = "insert into datax_config values(" + i + ",'" + columnName + "','" + columnType.toLowerCase() + "','" + tableName + "','" + database + "')";
                LOGGER.info(insert_sql);
                ps.execute(insert_sql);
            }
        } catch (Exception e) {
            LOGGER.error("表{}未找到", tableName);
        }
        DruidUtil.closeAll(resultSet, ps, conn);
    }
}
