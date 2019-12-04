/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withSQL;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mariscalyu_SD2082
 */
public class deleteWithConnection {

    public static void main(String[] args)
            throws Exception {


//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
        LocalTime start = java.time.LocalTime.now();
        System.out.println("Time Started " + start);
        int id = 1;
        for (int i = 1; i < 201; i++) {
            try {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/yuhbert", "root", "");
                stmt = (Statement) con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
                String sql = "DELETE FROM `withsql` WHERE Id = '" + id + "'";

                stmt.executeUpdate(sql);
                id++;

                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }

        }

//        LocalDateTime End = LocalDateTime.now();
//        String endTime = dtf.format(End);
        LocalTime end = java.time.LocalTime.now();
        System.out.println("Time Ended " + end);
    }
}
