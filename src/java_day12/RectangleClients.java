package java_day12;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1=new Rectangle();
        Rectangle rectangle2=new Rectangle();
        Rectangle rectangle3=new Rectangle();

        rectangle1.setLength(2);
        rectangle1.setWidth(2);
        rectangle1.calcArea();
        rectangle1.calcPerimeter();
        System.out.println(rectangle1);

        rectangle2.setLength(5);
        rectangle2.setWidth(5);
        rectangle2.calcArea();
        rectangle2.calcPerimeter();
        System.out.println(rectangle2);

        rectangle3.setLength(0);
        rectangle3.setWidth(2);
        rectangle3.calcArea();
        rectangle3.calcPerimeter();
        System.out.println(rectangle3);
    }
}
