package com.allenwipf;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Wipf on 5/9/17.
 */
public class Account {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account(){
        this(0, 0.00, "John Doe", "example@example.com",
                "(000) 000-0000");
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, double balance, String name, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    // More Methods
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("You deposited " + amount + ". Your new balance is " + this.balance);
    }

    public void withdraw(double amount){
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("You withdrew " + amount + ". Your new balance is " + this.balance);
        } else {
            System.out.println("You have insufficent funds. Your balance is " + this.balance);
        }
    }
}
