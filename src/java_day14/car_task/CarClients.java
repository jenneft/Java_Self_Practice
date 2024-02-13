package java_day14.car_task;

public class CarClients {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Sequia",2024,75_000,"Green");
        BMW bmw = new BMW("BMW","X1",2016,45_000,"Black");
        Honda honda = new Honda("Honda","Civic",2024,12_000,"Silver");
        Audi audi = new Audi("Audi","A8",2023,55_000,"White");
        Mercedes mercedes = new Mercedes("Mercedes","C300",2019,50_000,"Grey");
        Tesla tesla = new Tesla("Tesla","Model 3",2023,45_000,"Blue");
        Nio nio = new Nio("Nio","ET7",2021,35_000,"Beige");
        CydeoCar cydeoCar = new CydeoCar("CydeoCar","CC33",2024,10_000,"Red");

        test(toyota);
        test(bmw);
        test(honda);
        test(audi);
        test(mercedes);
        test(tesla);
        test(nio);

    }

    private static void test(Car car) {
        System.out.println("Testing " + car.getClass().getSimpleName() + ":");
        car.start();
        car.drive();


        if (car instanceof AutoPark) {
            ((AutoPark) car).autoPark();
        }
        if (car instanceof AutoPilot){
            ( (AutoPilot) car).selfDrive();
        }
        if (car instanceof Flyable) {
            ((Flyable) car).fly();
        }

        car.stop();
        System.out.println();
    }
}
/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */