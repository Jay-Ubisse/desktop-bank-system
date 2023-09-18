/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayubisse.desktop.bank.system;

/**
 *
 * @author Jay Ubisse
 */
public class Account {
    private int accountNumber;
    private int accountNib;
    private double balance;
    private String accountType;
    private String createdAt;

    public Account(int accountNumber, int accountNib, double balance, String accountType, String createdAt) {
        this.accountNumber = accountNumber;
        this.accountNib = accountNib;
        this.balance = balance;
        this.accountType = accountType;
        this.createdAt = createdAt;
    }
    
    public double getkBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountNib() {
        return accountNib;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    
    
}
