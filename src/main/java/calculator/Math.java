package calculator;

public class Math {

    public int add(int a, int b){
        return a + b;
    }

    public double divide(double number1, double number2){
        if (number2 == 0){
            throw new ArithmeticException("number can not by divide by 0");
        }

        return number1/number2;
    }
}
