package java_day11.restaurant;

import java_day11.restaurant.Chef;
import java_day11.restaurant.Server;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    String Owner, Location;

    int numberOfStars;
    int employeeID;
    ArrayList<Server> Servers;
    ArrayList<Chef> Chefs;

    public Restaurant(String owner, String location, int numberOfStars, int employeeID) {
        Owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
        this.employeeID = employeeID;
        this.Servers = new ArrayList<>(); // Initialize the Servers ArrayList
        this.Chefs = new ArrayList<>();
    }

    public void hireServer(Server server){
        Servers.add(server);
        }
        public void hireServer(Server[] servers){
            this.Servers.addAll(Arrays.asList(servers));
        }
        public void hireChef(Chef chef){
        Chefs.add(chef);
        }
        public void hireChef(Chef[] chefs){
            for (Chef chef : chefs) {
                this.Chefs.add(chef);
            }
        }

    public void terminateChef(int employeeID){
        Chefs.removeIf(chef -> chef.getEmployeeID() == employeeID);
    }
    public void terminateServer(int employeeID){
        Servers.removeIf(server -> server.getEmployeeID()==employeeID);
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", employeeID=" + employeeID +
                ", Servers=" + Servers +
                ", Chefs=" + Chefs +
                '}';
    }

}
/*

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

 */