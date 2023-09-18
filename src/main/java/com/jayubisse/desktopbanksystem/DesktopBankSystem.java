/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jayubisse.desktopbanksystem;
/**
 *
 * @author Jay Ubisse
 */
public class DesktopBankSystem {
    
    public static void main(String[] args) {
        Employee employeeObj = new Employee("Gerente", "user001", 
                "password005", "Jay", "Ubisse", "12345678F",
                "04-06-1997", "Masculino", "98627123", "27273",
                12244, "Avenida Marginal", "ubisse@mail.com");
        
        employeeObj.registerEmployee();
    }
}
