package com.company;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(7);
        printTheDay(0);

        //char switch example
        char switchValue = 'D';
        switch (switchValue) {
            case 'A':
                System.out.println("value was A");
                break;
            case 'B':
                System.out.println("value was B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value was actually " + switchValue);
                break;
            default:
                System.out.println("not found");
                break;
        }

        //String switch example  (using .toLowerCase() method so that the input is not case sensitive)
        String month = "JanuARy";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
        }

        //a new method for the switch statement (days of the week) called in main method
    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printTheDay(int day){
        if(day == 1){
            System.out.println("Sunday");
        }else if(day == 2){
            System.out.println("Monday");
        }else if(day == 3){
            System.out.println("Tuesday");
        }else if(day == 4){
            System.out.println("Wednesday");
        }else if(day == 5){
            System.out.println("Thursday");
        }else if(day ==6){
            System.out.println("Friday");
        }else if(day == 7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day");
        }
    }

    public static boolean isLeapYear(int year){
        if((year <= 0) || (year > 9999)){
            return false;
        }
        switch (year) {
            case (Math.abs(year/100)) && case %= 0 :
                return false;
                break;
            case Math.abs(year/4):
                return true;
                break;
            case Math.abs(year/400):
                return true;
                break;
            default:
                return false;
                break;
        }}
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        }
        if ((year < 1) || (year > 9999)) {
            return -1;
        }
        switch()
    }
    }
}