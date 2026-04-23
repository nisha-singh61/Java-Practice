package ClassAndObjectExample;

class Student{
    String name;  //variables
    int age;
    void study()  //methods or functions
    {
        System.out.println(name+" is studying");
    }
}

public class Swift {
    public static void main(String[] args) {
        System.out.println("Hello Swift...");
        Student std = new Student();  //object creation
        //access variable of student
        std.name="Nisha";  //assigning values
        std.age=20;

        std.study();   //calling of methods
    }
}
