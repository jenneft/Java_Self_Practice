package java_day14.car_shop;

public class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public boolean isEligibleForRecall(){
        return (year >=2010 && year <=2011);
    }
}
