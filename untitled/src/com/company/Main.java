package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0,2.0));

        for(int i=0; i<5; i++){
            System.out.println("Loop " + i + " hello!");
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate / 100));
    }
}
