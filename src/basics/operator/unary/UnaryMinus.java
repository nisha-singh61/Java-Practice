package basics.operator.unary;

public class UnaryMinus {
    public static void main(String[] args) {
        int number = 101;

        //opposite of number. The number with opposite sign is also called
        //additive inverse. The sum of number and it's additive inverse is zero
        int numberInverse = -number;

        System.out.println("The value of number is: "+number);
        System.out.println("Opposite of number is: "+numberInverse);
    }
}
