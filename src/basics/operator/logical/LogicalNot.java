package basics.operator.logical;

public class LogicalNot {
    public static void main(String[] args) {
        int mathVar = 94, scienceVar =99;

        //In this case, marks in science subject is not required
        //to be checked.
        if (!(mathVar<75)){
            System.out.println("Admission granted.");
        }
        else{
            System.out.println("Sorry! Admission is not granted.");
        }
    }
}
