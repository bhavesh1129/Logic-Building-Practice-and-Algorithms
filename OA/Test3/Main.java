package OA.Test3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String operator = sc.next();
        int num2 = sc.nextInt();

        int result = doArthematicOperation(num1, num2, operator);
        System.out.println("Result : " + num1 + "" + operator + "" + num2 + "=" + result);
    }

    private static int doArthematicOperation(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
        }
        return 0;
    }
}
