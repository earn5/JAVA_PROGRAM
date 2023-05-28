import java.util.Scanner;

class Calculator {
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {

        Scanner scin1 = new Scanner(System.in);
        Scanner scin2 = new Scanner(System.in);

        System.out.println("**Please Enter First Number**");
        int n1 = scin1.nextInt();

        System.out.println("**Please Enter Second Number**");
        int n2 = scin2.nextInt();

        Calculator calc = new Calculator();
        int r = calc.add(n1, n2);

        System.out.println(
                "Result:: \n" + r);
    }
}
