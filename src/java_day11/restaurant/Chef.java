package java_day11.restaurant;

public class Chef {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void makeOrder(){
        System.out.println(name + " is making an order");
    }
    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }



}
/*
Restaurant Task (EXTRA SPICY)
Create a custom class named Chef with the following specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

	Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status



Create a custom class named Server with similar specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

    Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status




Create a custom class named Restaurant with the following specifications:

	Attributes:
			Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)

	Add a constructor that sets the owner, location, and number of stars.

	Actions:
		hireServer(Server server): adds a server object to the Servers ArrayList
		hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs ArrayList
		terminateServer(int employeeID): removes the server with the matching ID from the Servers ArrayList
		toString(): returns a string representation of the Restaurant object, including the number of Servers and Chefs alongside other information



Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information

 */