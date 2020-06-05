public class Main {

    public static void main(String[] args) {
//        calculateFeetAndInchesToCentimeters(6,0); //Option one
        double centimeters  = calculateFeetAndInchesToCentimeters(354);
        if(centimeters<0.0){
            System.out.println("Invalid parameters");
        }
    }
    public static double calculateFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches entered");
            return -1;
        }
//        double centimeters = (feet * 12) * 2.54;      //Option one
//        centimeters += inches * 2.54;
        double centimeters = (((feet * 12) * 2.54) + inches * 2.54);
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    public static double calculateFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " incches");
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
