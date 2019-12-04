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
public class deleteWithoutConnection {

    public static void main(String[] args)
            throws Exception {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Time Started " + dtf.format(now));
        LocalTime start = java.time.LocalTime.now();
        System.out.println("Time Started " + start);
        try {
            int id = 1;
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/yuhbert", "root", "");
            stmt = (Statement) con.createStatement();
            for (int i = 1; i < 1001; i++) {
                String sql = "DELETE FROM `withsql` WHERE Id = '" + id + "'";
                stmt.executeUpdate(sql);
                id++;
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
//        LocalDateTime End = LocalDateTime.now();
//        String endTime = dtf.format(End);
//        System.out.println("Time Ended " + endTime);
        LocalTime end = java.time.LocalTime.now();
        System.out.println("Time Ended " + end);
    }
}
