/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayubisse.desktopbanksystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jay Ubisse
 */
public class Account {
    private int accountNumber;
    private int accountNib;
    private double balance;
    private String accountType;
    private Date createdAt;
    private String accountTitularID;
    private short accountPin;

    public Account(int accountNumber, int accountNib, double balance, String accountType, Date createdAt, String accountTitularID, short accountPin) {
        this.accountNumber = accountNumber;
        this.accountNib = accountNib;
        this.balance = balance;
        this.accountType = accountType;
        this.createdAt = createdAt;
        this.accountTitularID = accountTitularID;
        this.accountPin = accountPin;
    }
    
    public double getBalance(int accountNumber) {
        Connection conn = DBConnection.connectDB();
        System.out.println("-> Obtedo informacoes da conta...");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM accounts WHERE account_number = " + accountNumber);
            DBConnection.closeDBConnection();
            return rs.getInt("balance");
        } catch (SQLException ex) {
            System.out.println(ex);
            return -1;
        }
    }

    public int getAccountNib() {
        return accountNib;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountPin(short accountPin) {
        this.accountPin = accountPin;
    }

    public double setBalance(double amount) {
        double actualBalance = getBalance(accountNumber);
        double newBalance = actualBalance + amount;
        Connection conn = DBConnection.connectDB();
        System.out.println("-> Actualizando saldo...");
        try {
            PreparedStatement prepStmt = conn.prepareStatement("");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public String getAccountTitularID() {
        return accountTitularID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    
    public String transferMoney(int destinationAccountNIB, double amount){
        return null;
    }
    
    public String withdrawMoney(double amount) {
        return null;
    }
    
    
}
