import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        num();
        d2();

    }

    public static void num() {
        System.out.println("Введите дробное число:");
        Scanner sc = new Scanner(System.in);
        try {
            float num = sc.nextFloat();
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Нужно ввести число!");
            num();


        }
    }
    public static void d2()

    {
        try {
            int d = 0;
            int[] intArray = new int[10];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}