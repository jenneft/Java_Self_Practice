package java_day12;
import static java.lang.Math.*;
public class Circle {
    //Encapsulation must haves: private modifier, public getter(to read) and setter(to write)

    private double radius;
    private static int trackCircle = 1;

    //Step 1: Generate getter and setter
    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Radius Cannot Be Negative or Zero "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }
    //Step2: Generate constructor
    public Circle() {
        this.radius=1;
    }

    //Step3: Actions
    public double calcArea(){
        return Math.round(radius*radius*PI);
    }
    public double calcPerimeter(){
        return Math.floor(2*radius*PI);
    }

    @Override
    public String toString() {
        return "Circle"+trackCircle++ +"{" +
                "radius=" + radius +
                " ,area="+calcArea()+
                " ,perimeter="+calcPerimeter()+
                '}';
    }
    /*
    public double area(){
        return radius*radius*PI;
    }
    public double perimeter(){
        return 2 * radius* PI;
    }
 */

}
/*
 Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.
 */