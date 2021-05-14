/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTS;


import java.sql.*;

/**
 *
 * @author buida
 */
public class ConnectionDataBase {
    static Connection conn = null;
    public static Connection getConnectDB()throws ClassNotFoundException, SQLException{
        try {
            //jdbc:sqlserver://localhost:1433;databaseName=QLU
            //jdbc:sqlserver://LocalHost:1433;databaseName=QLTS
            final String url= "jdbc:sqlserver://localhost:1433;databaseName=QLTS";
            final String user = "sa";
            final String pass = "sa123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Ket noi thanh cong!");
        } catch (SQLException e) {
            System.out.println("Khong ket noi duoc!" + e);
        }
        return conn;
    }
}
