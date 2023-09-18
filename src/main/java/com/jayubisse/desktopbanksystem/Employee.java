/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayubisse.desktopbanksystem;

import java.sql.*;

/**
 *
 * @author Jay Ubisse
 */
public class Employee extends Person {
    private String role;
    private String username;
    private String password;

    public Employee(String role, String username, String password, String name, String surname, String identidyCardNumber, String bithDate, String gender, String phoneNumber, String secondPhoneNumber, int nuit, String address, String email) {
        super(name, surname, identidyCardNumber, bithDate, gender, phoneNumber, secondPhoneNumber, nuit, address, email);
        this.role = role;
        this.username = username;
        this.password = password;
    }
    
    public void registerEmployee() {
        Connection conn = DBConnection.connectDB();
        System.out.println("-> Inserindo dados na base de dados...");
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "INSERT INTO " +
                    "desktop_bank_system.employee(name, surname, id_card_number, birth_date, " +
                    "gender, phone_number, second_phone_number, nuit, email, address, username, password, role) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            prepStmt.setString(1, super.getName());
            prepStmt.setString(2, super.getSurname());
            prepStmt.setString(3, super.getIdentidyCardNumber());
            prepStmt.setString(4, super.getBithDate());
            prepStmt.setString(5, super.getGender());
            prepStmt.setString(6, super.getPhoneNumber());
            prepStmt.setString(7, super.getSecondPhoneNumber());
            prepStmt.setInt(8, super.getNuit());
            prepStmt.setString(9, super.getEmail());
            prepStmt.setString(10, super.getAddress());
            prepStmt.setString(11, this.getUsername());
            prepStmt.setString(12, this.getPassword());
            prepStmt.setString(13, this.getRole());
            prepStmt.executeUpdate();
            DBConnection.closeDBConnection();
            System.out.println("-> Dados inseridos com sucesso!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
