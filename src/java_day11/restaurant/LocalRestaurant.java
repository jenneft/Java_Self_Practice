package java_day11.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Joe Ferraro", "Rome,Italy", 5, 379);

        Server[] servers = {
                new Server("Peach", 711, 34, true),
                new Server("Peach", 711, 34, true),
                new Server("Yoshi", 712, 35, true),
                new Server("Yoshi", 712, 35, true),
                new Server("Bowser", 713, 17, false),

        };
        Chef[] chefs = {
                new Chef("Mario", 714, 55, true),//testing if it removes the chef with the matching ID from the Chefs ArrayList
                new Chef("Mario", 714, 55, true),
                new Chef("Luigi", 715, 52, false),
                new Chef("Luigi", 715, 52, false),
                new Chef("Toad", 716, 55, true),
        };

        restaurant.hireChef(chefs);
        restaurant.removeDuplicates();
        restaurant.terminateChef(716);


        restaurant.hireServer(servers);
        restaurant.removeDuplicateServers();
        restaurant.terminateServer(713);


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