class Calculator {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
}

class AdvancedCalculator extends Calculator {
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) { return b != 0 ? a / b : 0; }
}

public class Main {
    public static void main(String[] args) {

        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
    }
}