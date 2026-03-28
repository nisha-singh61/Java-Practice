package basics;

public class TypeCastingJava {
    public static void main() {
        double d = 4.55d;
        float f = 1.35f;
        int i = (int)d; //Explicit casting: double to int
        int i2 =(int)f; //Explicit casting: double to float
        System.out.println("Double Value: "+d);
        System.out.println("Double to int: "+i);
        System.out.println("Float value: "+f);
        System.out.println("Float to int: "+i2);
    }
}
