/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jayubisse.desktop.bank.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Axxel Milton
 */
public class DesktopBankSystem {

    public static void main(String[] args) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/desktop_bank_system", "root", "");
                Statement stmt = dbcon.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
                while(rs.next()) {
                    System.out.println(rs.getString("username") 
                            + " " + rs.getString("password") 
                            + " " + rs.getString("role"));
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DesktopBankSystem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        
    }
}
