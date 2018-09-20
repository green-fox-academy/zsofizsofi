package com.greenfoxacademy.simba.models;

import java.text.DecimalFormat;

public class BankAccount {
    private String owner;
    private boolean good;
    private String name;
    private double balance;
    private String animalType;

    public BankAccount(String owner, boolean good, String name, double balance, String animalType) {
//        DecimalFormat df = new DecimalFormat();
//        df.setMaximumFractionDigits(2);
//        String a = df.format(balance);
//        double d = Double.parseDouble(a);
        this.owner = owner;
        this.good = good;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;


    }

    public String getOwner() {
        return owner;
    }

    public boolean isGood() {
        return good;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}


//    Add the fields name, balance, animalType in it
//    In your controller create the first endpoint called /show
//        Instantiate a new BankAccountController("Simba", "2000", "lion")
//        Add this BankAccountController to the model
//        Create a thymeleaf template where you show the fields of the BankAccountController