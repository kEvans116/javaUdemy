package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0,4.0));
        printYearsAndDays(525600);
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,25));
    }

    public static double area(double radius){
        if(radius < 0){
            System.out.println("Invalid Value");
            return -1;
        } double pi = Math.PI;
        double circleArea = radius * radius * pi;
        return circleArea;
    }
    public static double area(double x, double y){
        if((x < 0 ) || (y < 0)){
            return -1;
        }else{
            double rectangleArea = (x*y);
            return rectangleArea;
        }
    }

    //New Challenge
    public static void printYearsAndDays(long minutes){
        if( minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long hour = minutes/60L;
            long day = hour/24L;
            long year = day/365L;
            long remainingDays = day % 365;
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }

    //New Challenge
    public static void printEqual(int ant, int bug, int chew){
        if(ant<0 || bug<0 || chew<0){
            System.out.println("Invalid Value");
        } else if((ant==bug)&&(bug==chew)&&(ant==chew)){
            System.out.println("All numbers are equal");
        } else if((ant!=bug)&&(bug!=chew)&&(ant!=chew)){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

    //New Challenge
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer == true) {
            return (temperature <= 45) && (temperature >= 25);
        }if(summer == false) {
            return (temperature<=35) && (temperature >=25);
        }return false;
    }
}
