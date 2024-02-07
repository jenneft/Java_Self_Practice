package java_day12;
import static java.lang.Math.*;
public class Rectangle {
    private double width;
    private double length;
    private static int tracker = 1;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(width<=0 && length<=0){
            System.err.println("Width and Length cannot be negative or zero");
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public double calcArea(){
        return Math.round(width*length);
    }
    public double calcPerimeter(){
    return Math.round(2*(width*length));
    }

    @Override
    public String toString() {
        return "Rectangle"+tracker++ +"{" +
                "width=" + width +
                ", length=" + length +
                ", area="+calcArea()+
                ", perimeter="+calcPerimeter()+
                '}';
    }
}


/*

2. Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.

 */