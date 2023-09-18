/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayubisse.desktopbanksystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jay Ubisse
 */
public class DBConnection {
    private static Connection dbCon;
    
    public static Connection connectDB() {
        try {
            System.out.println("-> Conectando a base de dados...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/desktop_bank_system";
            DBConnection.dbCon = DriverManager.getConnection(dbURL, "root", "");
            System.out.println("-> Connectado a base de dados com sucesso!");
            return DBConnection.dbCon;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public static void closeDBConnection() {
        try {
            DBConnection.dbCon.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
