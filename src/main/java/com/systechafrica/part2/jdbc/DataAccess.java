package com.systechafrica.part2.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;

public interface DataAccess {
    Connection connect();
    ResultSet executeQuery(String query);
    int executeUpdate(String query);
    void close();
}
