/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withSQL;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mariscalyu_SD2082
 */
public class SQLwithConnection {

    public static void main(String[] args)
            throws Exception {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Time Started " + dtf.format(now));
        LocalTime start = java.time.LocalTime.now();
        System.out.println("Time Started " + start);
        for (int i = 1; i < 201; i++) {
            try {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/yuhbert", "root", "");
                stmt = (Statement) con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
                String sql = "INSERT INTO `withsql`( `Id`,`Col1`, `Col2`, `Col3`, `Col4`, `Col5`) VALUES ('" + i + "','" + i + "','" + (i + 1) + "','" + (i + 2) + "','" + (i + 3) + "'," + (i + 4) + ")";

                stmt.executeUpdate(sql);
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }

        }

//        LocalDateTime End = LocalDateTime.now();
//        String endTime = dtf.format(End);
//        System.out.println("Time Ended " + endTime);
        LocalTime end = java.time.LocalTime.now();
        System.out.println("Time Ended " + end);
    }
}
