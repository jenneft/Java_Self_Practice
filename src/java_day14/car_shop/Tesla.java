package java_day14.car_shop;

public class Tesla extends Car {
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public boolean isEligibleForRecall(){
        return (year>=2015 && year<=2016);
    }



}
