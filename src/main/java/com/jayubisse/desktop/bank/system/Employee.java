/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayubisse.desktop.bank.system;

/**
 *
 * @author Jay Ubisse
 */
public class Employee extends Person {
    private String role;
    private String username;
    private String password;

    public Employee(String role, String username, String password, String name, String surname, int identidyCardNumber, String bithDate, String gender, String phoneNumber, String secondPhoneNumber, int nuit, String address) {
        super(name, surname, identidyCardNumber, bithDate, gender, phoneNumber, secondPhoneNumber, nuit, address);
        this.role = role;
        this.username = username;
        this.password = password;
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
