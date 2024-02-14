package java_day14.car_shop;

public class Audi extends Car {
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    //Audi: Years 2015 to 2019
    public boolean isEligibleForRecall(){
        return (year>=2015 && year<=2019);
    }
}
