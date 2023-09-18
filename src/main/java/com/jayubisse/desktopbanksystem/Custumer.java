/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayubisse.desktopbanksystem;

/**
 *
 * @author Jay Ubisse
 */
public class Custumer extends Person {
    private String custumerID;
    private int accountNumber;

    public Custumer(String custumerID, String name, String surname, String identidyCardNumber, String bithDate, String gender, String phoneNumber, String secondPhoneNumber, int nuit, String address, String email) {
        super(name, surname, identidyCardNumber, bithDate, gender, phoneNumber, secondPhoneNumber, nuit, address, email);
        this.custumerID = custumerID;
    }

    public String getCustumerID() {
        return custumerID;
    }

 
    
}
