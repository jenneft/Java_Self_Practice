package java_day3;

public class Rectangle {
    public static void main(String[] args) {
        double length = 4.5;
        int width=2;
        double area= (float) length* width;
        double perimeter=((double) 2*(length+width));
        System.out.println("The area of the given rectangle is "+ area);
        System.out.println("The perimeter of the rectangle is "+perimeter);

    }
}
