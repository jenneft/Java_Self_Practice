package java_day14.car_task;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public Car(String make, String model, int year, double price, String color) {
        if (!isValidString(make))
            throw new RuntimeException("Make Cannot Be Null or Empty");
        if (!isValidString(model))
            throw new RuntimeException("Model Cannot Be Null or Empty");
        if (!isValidString(color))
            throw new RuntimeException("Color Cannot Be Null or Empty");
        if (year < 1986)
            throw new RuntimeException("Year Must Not Be Less Than 1886");
        if (price < 0)
            throw new RuntimeException("Price Must Not Be Negative");

        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {

        System.out.println(make + " Stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


}
/*

Car Task Requirements:
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()

2. Create an Interface Named 'AutoPark':
    - Variable:
        - hasAutoPark
    - Abstract Method:
        - autoPark()

3. Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()

4. Create an Interface Named 'Flyable':
    - Variable:
        - canFly
    - Abstract Method:
        - fly()

5. Create a Subclass of Car Named 'Toyota'.
6. Create a Subclass of Car Named 'Honda'.
7. Create a Subclass of Car Named 'BMW'.
8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */