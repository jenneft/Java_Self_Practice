package java_day07;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();

        rectangle1.length=25;
        rectangle1.width=10;

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);

        Rectangle rectangle2=new Rectangle();

        rectangle2.length=55;
        rectangle2.width=12;

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        System.out.println(rectangle2);

    }
}
