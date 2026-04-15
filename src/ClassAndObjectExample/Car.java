package ClassAndObjectExample;

public class Car {
    // 1. Properties (Fields) belong here, at the class level
    String color;

    // 2. Behaviors (Methods) also belong at the class level
    void drive() {
        System.out.println("Car is driving");
    }

    // 3. The main method is where the program execution starts
    public static void main(String[] args) {
        // Create an object (Instance) of the Car class
        Car myCar = new Car();

        // Accessing the properties and behaviors
        myCar.color = "Red";
        myCar.drive();

        System.out.println("The car color is: " + myCar.color);
    }
}