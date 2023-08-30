/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayubisse.desktop.bank.system;

/**
 *
 * @author Jay Ubisse
 */
public class Custumer extends Person {
    private String custumerID;
    private Account accoundInfo;

    public Custumer(String custumerID, Account accoundInfo, String name, String surname, int identidyCardNumber, String bithDate, String gender, String phoneNumber, String secondPhoneNumber, int nuit, String address) {
        super(name, surname, identidyCardNumber, bithDate, gender, phoneNumber, secondPhoneNumber, nuit, address);
        this.custumerID = custumerID;
        this.accoundInfo = accoundInfo;
    }

    public String getCustumerID() {
        return custumerID;
    }

    public Account getAccoundInfo() {
        return accoundInfo;
    }
    
}
