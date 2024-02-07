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
            this.Chefs.addAll(Arrays.asList(chefs));
        }

    public void removeDuplicates() {
        boolean[] encounteredEmployeeIDs = new boolean[1000]; // Assuming employee IDs range

        for (int i = Chefs.size() - 1; i >= 0; i--) {
            Chef chef = Chefs.get(i);
            int currentEmployeeID = chef.getEmployeeID();

            if (encounteredEmployeeIDs[currentEmployeeID]) {
                Chefs.remove(i); // Removes duplicate chef
            } else {
                encounteredEmployeeIDs[currentEmployeeID] = true;
            }
        }
    }

    public void terminateChef(int employeeID) {
        Chefs.removeIf(chef -> chef.getEmployeeID() == employeeID);//to terminate an individual employee
    }


    public void removeDuplicateServers() {
        boolean[] encounteredEmployeeIDs = new boolean[1000]; // Assuming employee IDs range

        for (int i = Servers.size() - 1; i >= 0; i--) {
            Server server = Servers.get(i);
            int currentEmployeeID = server.getEmployeeID();

            if (encounteredEmployeeIDs[currentEmployeeID]) {
                Servers.remove(i); // Removes duplicate server
            } else {
                encounteredEmployeeIDs[currentEmployeeID] = true;
            }
        }
    }

    public void terminateServer(int employeeID){
        Servers.removeIf(server -> server.getEmployeeID()==employeeID);//to terminate an individual employee
    }


    public String toString() {
        return getClass().getSimpleName()+": {" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", employeeID=" + employeeID +"\n->"+
                " Servers=" + Servers +"\n->"+
                " Chefs=" + Chefs +
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


/*    OPTION TO REMOVE THE DUPLICATES:

public void terminateChef(int employeeID) {
        for (int i = Chefs.size() - 1; i >= 0; i--) {
            Chef chef = Chefs.get(i);
            if (chef.getEmployeeID() == employeeID) {
                Chefs.remove(i); // Removes the last occurrence
                break;
            }
        }
    }


   ANOTHER OPTION TO TERMINATE A DUPLICATE:

       public void terminateChef(int employeeID) {

        for (Chef chef : Chefs) {
            if (chef.getEmployeeID() == employeeID) {
                Chefs.remove(chef);
                break; // Removes the first occurrence
            }
        }
    }

    */
