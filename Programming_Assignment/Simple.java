package Programming_Assignment;

import Programming_Assignment.Calculator.Operations;

public class Simple {
    public static void main(String[] args) {
        Operations op = new Operations(5, 6);
        op.sum();
        op.difference();
        op.multiply();
        op.divide();
    }
}