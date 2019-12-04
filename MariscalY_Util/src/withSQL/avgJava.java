/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withSQL;

import java.sql.*;
import java.time.LocalTime;

/**
 *
 * @author mariscalyu_SD2082
 */
public class avgJava {

    public static void main(String[] args)
            throws Exception {
        LocalTime start = java.time.LocalTime.now();
        System.out.println("Time Started " + start);

        try {
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/yuhbert", "root", "");
            stmt = (Statement) con.createStatement();

            for (int i = 1; i < 1001; i++) {

                ResultSet rs = stmt.executeQuery("select sum(Col1) from withsql");
                while (rs.next()) {
                    float avg = rs.getFloat(1) / 1000;
                    System.out.println("column one average is " + avg);
                }

                ResultSet rs2 = stmt.executeQuery("select sum(Col2) from withsql");
                while (rs2.next()) {
                    float avg = rs2.getFloat(1) / 1000;
                    System.out.println("column two average is " + avg);
                }

                ResultSet rs3 = stmt.executeQuery("select sum(Col3) from withsql");
                while (rs3.next()) {
                    float avg = rs3.getFloat(1) / 1000;
                    System.out.println("column three average is " + avg);
                }

                ResultSet rs4 = stmt.executeQuery("select sum(Col4) from withsql");
                while (rs4.next()) {
                    float avg = rs4.getFloat(1) / 1000;
                    System.out.println("column four average is " + avg);
                }
                
                ResultSet rs5 = stmt.executeQuery("select sum(Col5) from withsql");
                while (rs5.next()) {
                    float avg = rs5.getFloat(1) / 1000;
                    System.out.println("column four average is " + avg);
                }
                con.close();
                break;
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        LocalTime end = java.time.LocalTime.now();
        System.out.println("Time Ended " + end);

    }

}
