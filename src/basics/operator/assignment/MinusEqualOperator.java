package basics.operator.assignment;

public class MinusEqualOperator {
    public static void main(String[] args)
    {
        //integer variables
        int num1=100, num2=200, num3=300;

        //-= operator is used here to increase the value of variables
        //by the number mentioned in the right side of operator
        num1-=50;
        num2-=100;
        num3-=200;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
