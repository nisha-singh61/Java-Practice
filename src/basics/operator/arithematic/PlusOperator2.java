package basics.operator.arithematic;

public class PlusOperator2 {
    public static void main(String[] args) {
        int x = 100;

        /* y is float type so the variable 'add' is
        declared as float type to hold the addition result */

        float y = 20.5f, add;

        //addition of int and float. The result is a float
        add = x+y;

        System.out.println("Sum of x and y is: "+add);
    }
}
