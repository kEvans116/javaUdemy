public class MegaBytesConverter {

    public static void main(String[] args) {
//        boolean answer =  isLeapYear(0);
//        System.out.println(answer);
//
//        boolean answer1 =  isLeapYear(1111);
//        System.out.println(answer);

        boolean a = hasTeen(5, 13, 90);
        System.out.println(a);

        boolean b = isTeen(15);
        System.out.println(b);

    }
    public static boolean hasTeen(int one, int two, int three){
        return one >= 13 && one <=19 || two >= 13 && two <=19 || three >= 13 && three <=19;
    }
    public static boolean isTeen(int number){
        return number >= 13 && number <= 19;
    }
}