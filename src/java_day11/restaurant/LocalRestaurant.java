package java_day11.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Joe Ferraro", "Rome,Italy", 5, 379);

        Server[] servers={
                new Server("Aurora",711,35,true),
                new Server("Giovanni",712,17,false),
                new Server("Elana",713,34,true)
        };
        Chef[] chefs={
                new Chef("Mario",714,55,true),
                new Chef("Luigi",715,52,false)
        };
        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);
        System.out.println(restaurant);
    }
}
/*
Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information
 */