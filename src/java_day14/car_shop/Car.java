package java_day14.car_shop;

public class Car {
    String model,color;
    int year;
    double price;
    public boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public Car(String model, String color, int year, double price) {
        if(!isValidString(model))
            throw new RuntimeException("Model value cannot be null and empty");
        if(!isValidString(color))
            throw new RuntimeException("Color value cannot be null and empty");
        if(year<2009)
            throw new RuntimeException("Year cannot be less then 2010");
        if(price<0)
            throw new RuntimeException("Price must be positive");
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
