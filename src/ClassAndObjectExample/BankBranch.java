package ClassAndObjectExample;

class Bank{
    String bankName;
    String city;
    int ifscCode;
    int pincode;
    void withdraw(){
        System.out.println("You are withdrawing money from " +bankName+ " -->Location: " +city+ " -->pincode: "+pincode);
    }
}

public class BankBranch {
    public static void main(String[] args) {
        System.out.println("This is the branch of the bank...");
        Bank draw = new Bank();

        draw.bankName = "SBI";
        draw.city = "Mumbai";
        draw.ifscCode = 12345678;
        draw.pincode = 515411;

        draw.withdraw();
    }
}
