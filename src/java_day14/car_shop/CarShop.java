package java_day14.car_shop;

import java.util.ArrayList;

public class CarShop {
    public static void main(String[] args) {
        Car[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };


        CarShop carShop = new CarShop(cars);

        //1.2. Display all cars eligible for recall:
        System.out.println("Display all cars that are eligible for recall: ");
        carShop.displayRecallCars();

        System.out.println("-----------------------------------------------------------------------------------------");

        //1.3. Display the car with the highest price.
        System.out.println("Display car with the highest price: "+carShop.displayHighestPricedCar());;

        System.out.println("-----------------------------------------------------------------------------------------");

        //        1.4. Display the car with the lowest price.
        System.out.println("Display car with the lowest price: "+carShop.displayLowestPricedCar());


        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Tesla> teslaCars = carShop.getTeslaCars();
        System.out.println("Tesla cars: "+ teslaCars);

    }

    public Car[] cars;

    public CarShop(Car[] cars) {
        this.cars = cars;
    }

    public void displayRecallCars() {
        for (Car eachCar : cars) {
            if (eachCar instanceof Honda && ((Honda) eachCar).isEligibleForRecall()) {
                System.out.println(eachCar);
            }
            if (eachCar instanceof Audi && ((Audi) eachCar).isEligibleForRecall()) {
                System.out.println(eachCar);
            }
            if (eachCar instanceof Tesla && ((Tesla) eachCar).isEligibleForRecall()) {
                System.out.println(eachCar);
            }
        }
    }

    public Car displayHighestPricedCar() {
        Car maxPrice = cars[0];
        for (Car each : cars) {
            if (each.price > maxPrice.price) {
                maxPrice = each;
            }
        }
        return maxPrice;
    }

    public Car displayLowestPricedCar() {
        Car minPrice = cars[0];
        for (Car each : cars) {
            if (each.price < minPrice.price) {
                minPrice = each;
            }
        }
        return minPrice;
    }

    public ArrayList<Tesla> getTeslaCars(){
        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car tesla : cars) {
            if(tesla instanceof Tesla){
                teslaCars.add((Tesla)tesla);
            }
        }
        return teslaCars;
    }

}

/*

CarShop Class Task:
1. Create a Class Named 'CarShop':
    - Given an array of Car objects:
            Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
            };

    - Tasks:
        1.2. Display all cars eligible for recall:
            - Honda: Years 2010 to 2011
            - Audi: Years 2015 to 2019
            - Tesla: Years 2015 to 2016
        1.3. Display the car with the highest price.
        1.4. Display the car with the lowest price.
        1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.

 */