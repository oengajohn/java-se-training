package com.systechafrica.part2.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            DataAccess mysql = new MysqlDataAccess();
            mysql.connect();
            ResultSet productResultSet = mysql.executeQuery("SELECT * from products");
            while (productResultSet.next()) {
                int productId = productResultSet.getInt("id");
                String productName = productResultSet.getString("name");
                System.out.println("ID: " + productId + " Name: " + productName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
