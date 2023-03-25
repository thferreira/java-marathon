package javamarathon.introduction;

public class Step02PrimitivesTypes {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 200.0D;
        double salaryDouble = 2000.0000000;
        float salaryFloat = (float) salaryDouble;
        byte byteOfAge = 37;
        short shortOfAge = 37;
        boolean isFalse = false;
        boolean isTrue = true;
        char character = '\u0041';

        System.out.println("Your age is: " + age + " years old!");
        System.out.println(salaryFloat);
    }
}
