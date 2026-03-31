package basics.operator.assignment;

public class PlusEqualOperator {
    public static void main(String[] args)
    {
        //integer variables
        int n1=1, n2=2, n3=3;

        //+= operator is used here to increase the value of variables
        //by the number mentioned in the right side of operator
        n1+=10;
        n2+=5;
        n3+=100;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
