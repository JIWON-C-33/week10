import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("+,-,*,/를 입력 하시오: ");
        char i = scanner.next().charAt(0);
        System.out.print("첫 번째 숫자를 입력: ");
        double num1 = scanner.nextDouble();
        System.out.print("두 번째 숫자 입력: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        if (i == '+') {
            result = calculator.add(num1, num2);
        } else if (i == '-') {
            result = calculator.subtract(num1, num2);
        } else if (i == '*') {
            result = calculator.multiply(num1, num2);
        } else if (i == '/') {
            result = calculator.divide(num1, num2);
        } else {
            System.out.println("연산자를 잘못 입력 했습니다");
            scanner.close();
            return;
        }
        System.out.println("결과: " + result);
    }
}