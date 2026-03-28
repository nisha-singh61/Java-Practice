package basics;

public class TypeCastingJava2 {
    public static void main(String[] args) {
        int i = 1001;
        float f = 105.00f;
        long l = i; // Implicit casting: int to long
        double d = f; // Implicit casting: float to double

        System.out.println("int Value: "+i);
        System.out.println("int to long: "+l);
        System.out.println("float value: "+f);
        System.out.println("float to double: "+d);
    }
}
