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
        for (int i = Chefs.size() - 1; i >= 0; i--) {
            Chef chef1 = Chefs.get(i);
            int currentEmployeeID = chef1.getEmployeeID();
            boolean duplicateFound = false;
            for (int j = i - 1; j >= 0; j--) {
                Chef chef2 = Chefs.get(j);
                if (chef2.getEmployeeID() == currentEmployeeID) {
                    Chefs.remove(i); // Removes duplicate chef
                    duplicateFound = true;
                    break;
                }
            }
            if (!duplicateFound) {
                for (int k = Chefs.size() - 1; k > i; k--) {
                    if (Chefs.get(k).getEmployeeID() == currentEmployeeID) {
                        Chefs.remove(k);
                        break;
                    }
                }
            }
        }
    }
    public void terminateChef(int employeeID) {
        Chefs.removeIf(chef -> chef.getEmployeeID() == employeeID);
    }


    public void removeDuplicateServers() {
        for (int i = Servers.size() - 1; i >= 0; i--) {
            Server server1 = Servers.get(i);
            int currentEmployeeID = server1.getEmployeeID();
            boolean duplicateFound = false;
            for (int j = i - 1; j >= 0; j--) {
                Server server2 = Servers.get(j);
                if (server2.getEmployeeID() == currentEmployeeID) {
                    Servers.remove(i); // Removes duplicate server
                    duplicateFound = true;
                    break;
                }
            }
            if (!duplicateFound) {
                for (int k = Servers.size() - 1; k > i; k--) {
                    if (Servers.get(k).getEmployeeID() == currentEmployeeID) {
                        Servers.remove(k);
                        break;
                    }
                }
            }
        }
    }
    public void terminateServer(int employeeID){
        Servers.removeIf(server -> server.getEmployeeID()==employeeID);
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