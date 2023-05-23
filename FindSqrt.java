import java.util.Scanner;
public class FindSqrt {
    public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		System.out.println("******Enter Base Number*******");
		int inputNumber = (int)in1.nextInt();
		int resultNumber = inputNumber;
		//System.out.println(input);
        //int inputNumber = 2;
        //int resultNumber = 2;
		System.out.println("******Enter Square Root Of*******");
		int sqrt = (int)in2.nextInt();
		resultNumber *= inputNumber;
		System.out.println("Initial OP: " + resultNumber);
        for (int i = 0; i < (sqrt - 2); i++) {
            resultNumber *= inputNumber;
            System.out.println("Every Operation O/p: " + resultNumber);
        }
        System.out.println("Final Result:: " + resultNumber);
    }
}
