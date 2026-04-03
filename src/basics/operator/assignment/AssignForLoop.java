package basics.operator.assignment;

public class AssignForLoop {
    public static void main(String[] args) {
        int n = 10;
        // The first expression of the for loop is
        // an assignment operation where the value
        // of the loop variable is initialized
        for (int i = 1; i <= n; ++i) {
            System.out.print(i + " ");
        }
    }
}