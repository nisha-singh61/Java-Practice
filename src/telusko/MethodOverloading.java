package telusko;

class Calculator2{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class MethodOverloading {
    public static void main() {
        Calculator2 calc = new Calculator2();
        int r1 = calc.add(4,6);
        double r2 = calc.add(7.8, 10);
        int r3 = (int)calc.add(7.8, 10);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
