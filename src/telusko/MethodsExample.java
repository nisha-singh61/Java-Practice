package telusko;

class Computer{
    public void playMusic(){
        System.out.println("Music playing...");
    }

    public String getMeAPen(int cost){
        if (cost >= 10)
        return "pen";
        else
            return "Nothing...";
    }
}

public class MethodsExample {
    public static void main() {
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(5);
        System.out.println(str);
    }
}
