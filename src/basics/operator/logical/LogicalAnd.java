package basics.operator.logical;

public class LogicalAnd {
    public static void main(String[] args) {
        int mathVar = 94, scienceVar =99;

        //checking whether marks in both the subjects are
        //greater than 95
        if (mathVar >=95 && scienceVar>=95){
            System.out.println("Admission granted.");
        }
        else{
            System.out.println("Sorry! Admission is not granted.");
        }
    }
}
