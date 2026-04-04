package basics.operator.assignment;

public class Example1 {
    public static void main(String[] args) {
        int num;
        if (10 == (num = 10)) {
            System.out.println("The value of num is: " + num);
        }
    }
}
