/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author LuisGuillermo
 */
public class CuentaBancaria {
 
public String name;
public int accountNum;
public double deposit;
public double withdraw;
public double balance;

    
public CuentaBancaria(){
    name = "Esteban del Angel de la Torre";
    accountNum = 8736;
    balance = 15000.75;


} 
public double deposit(){
    return this.deposit;

}

        
public double withdraw(){
    return this.withdraw;

}

 
public double balance(){
    return this.balance;

    }

}
 
    

    
