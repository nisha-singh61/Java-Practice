package basics;

public class FindAsciiValue {
   public static void main() {
        char ch = 'a';
        int ascii = ch;
        //cast char to int
       int castAscii = (int) ch;
       System.out.println("The ASCII value of " + ch + " is: " + ascii);
       System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
