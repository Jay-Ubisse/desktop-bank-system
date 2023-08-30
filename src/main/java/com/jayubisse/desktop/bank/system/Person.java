/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jayubisse.desktop.bank.system;

/**
 *
 * @author Jay Ubisse
 */
public class Person {
    private String name;
    private String surname;
    private int identidyCardNumber;
    private String bithDate;
    private String gender;
    private String phoneNumber;
    private String secondPhoneNumber;
    private int nuit;
    private String address;

    public Person(String name, String surname, int identidyCardNumber, String bithDate, String gender, String phoneNumber, String secondPhoneNumber, int nuit, String address) {
        this.name = name;
        this.surname = surname;
        this.identidyCardNumber = identidyCardNumber;
        this.bithDate = bithDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.secondPhoneNumber = secondPhoneNumber;
        this.nuit = nuit;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdentidyCardNumber() {
        return identidyCardNumber;
    }

    public void setIdentidyCardNumber(int identidyCardNumber) {
        this.identidyCardNumber = identidyCardNumber;
    }

    public String getBithDate() {
        return bithDate;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
