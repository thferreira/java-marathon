package javamarathon.introduction;

public class Step04Operators {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int result1 = number1 - number2;
        double result2 = number1 / (double) number2;

        System.out.println(result1);
        System.out.println(result2);

        // %

        int rest = 21 % 8;
        System.out.println(rest);

        // < > <= >= == !=

        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenDifferentToTwenty = 10 != 20;

        System.out.println("isTenLessThanTwenty: " + isTenLessThanTwenty);
        System.out.println("isTenGreaterThanTwenty: " + isTenGreaterThanTwenty);
        System.out.println("isTenEqualToTwenty: " + isTenEqualToTwenty);
        System.out.println("isTenDifferentToTwenty: " + isTenDifferentToTwenty);
    }
}
