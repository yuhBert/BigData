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
public class avgInternalFunction {

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
                ResultSet rs = stmt.executeQuery("select avg(Col1) from withsql");
                while (rs.next()) {
                    System.out.println("avg temp is " + rs.getFloat(1));
                }
                ResultSet rs2 = stmt.executeQuery("select avg(Col2) from withsql");
                while (rs2.next()) {
                    System.out.println("avg temp is " + rs2.getFloat(1));
                }
                ResultSet rs3 = stmt.executeQuery("select avg(Col3) from withsql");
                while (rs3.next()) {
                    System.out.println("avg temp is " + rs3.getFloat(1));
                }
                ResultSet rs4 = stmt.executeQuery("select avg(Col4) from withsql");
                while (rs4.next()) {
                    System.out.println("avg temp is " + rs4.getFloat(1));
                }
                ResultSet rs5 = stmt.executeQuery("select avg(Col5) from withsql");
                while (rs5.next()) {
                    System.out.println("avg temp is " + rs5.getFloat(1));
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
