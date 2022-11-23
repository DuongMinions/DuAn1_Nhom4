/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TRAN VAN DUONG
 */
public class DBContext1 {

   public static final String HOSTNAME = "localhost";

    public static final String PORT = "1433";

    public static final String DBNAME = "DATA_DUAN";

    public static final String USERNAME = "sa";

    public static final String PASSWORD = "songlong";

    /**
     *
     * Get connection to MSSQL Server
     *
     * @return Connection
     *
     */
    public static Connection getConnection() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);

        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace(System.out);

        }

        return null;

    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
