class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b, double c) {
        return a * b * c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.multiply(5, 7);
        System.out.println("multiplying two integers:" + result1);
        double result2 = calculator.multiply(2.5, 3.0, 1.5);
        System.out.println("multiplying three doubles:" + result2);
    }
}
