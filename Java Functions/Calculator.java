public class Calculator {

    public int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public int divide(int numberOne, int numberTwo) {
        if(numberTwo == 0){
            throw new ArithmeticException("Division by zero");
        }
        return numberOne / numberTwo;
    }
}
