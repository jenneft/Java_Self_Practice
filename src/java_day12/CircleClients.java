package java_day12;

public class CircleClients {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        circle1.setRadius(21);
        circle1.calcArea();
        circle1.calcPerimeter();
        System.out.println(circle1);


        Circle circle2=new Circle();
        circle2.setRadius(34);
        circle2.calcArea();
        circle2.calcArea();
        System.out.println(circle2);

        Circle circle3=new Circle();
        circle3.setRadius(0);//test validation
        circle3.getRadius();
        System.out.println(circle3);






    }
}
