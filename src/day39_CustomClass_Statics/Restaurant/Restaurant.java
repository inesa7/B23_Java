package day39_CustomClass_Statics.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    ArrayList<Server> servers = new ArrayList<Server>();
    ArrayList<Chef> chefs = new ArrayList<Chef>();

    public void setInfo(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServer(Server[] server){
        servers.addAll(Arrays.asList(server));
    }

    public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime){
        Server server = new Server();
        server.setInfo(name, employeeID, hourlyRate, fullTime);
        servers.add(server);
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chef){
        chefs.addAll(Arrays.asList(chef));
    }

    public void hireChef(String name, int employeeID, double hourlyRate, boolean fullTime){
        Chef chef = new Chef();
        chefs.add(chef);
        chef.setInfo(name, employeeID, hourlyRate, fullTime);
        chefs.add(chef);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }

    public void terminateEmployee(String title, int employeeID) {
        if (title.equals("server")) {
            String name = "";
            for (Server server : servers){
                if(server.employeeID==employeeID){
                    name= server.name;
                }
            }
            servers.removeIf(server -> server.employeeID==employeeID);
            System.out.println(name+" was terminated");

        }else if(title.equals("chef")){
            String name1 = "";
            for(Chef chef : chefs){
                if(chef.employeeID==employeeID){
                    name1=chef.name;
                }
            }
            chefs.removeIf(server -> server.employeeID==employeeID);
            System.out.println(name1+" was terminated");

        }else{
            System.out.println("invalid employee type");
        }
    }
}
/*
Create a class called Restaurant

            Attributes:
                Owner (String), Location (String), numberOfStars (int)
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)

            Actions: (all void methods)

                setInfo(): sets the owner, location, and number of stars with the given parameters
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
                hireServer(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version
                accept the given parameters/information of a Server and will add the given Server to the ArrayList of Servers

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                hireChef(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version
                accept the given parameters/information of a Chef and will add the given Chef to the ArrayList of Chefs

                toString(): Return (String) of all the information of a Restaurant object.
                No need to print the whole list of Servers or Chefs.
                Print the number of Servers and Chefs along side the other information(size)

                terminateEmployee(String title, int employeeID): Create a method that will accept a String title which can
                only be "server" or "chef". If any other String is given it is invalid and the no action should be done
                (an error message can be given "invalid employee type"). Once you know which type of employee
                you are terminating use their given employeeID in the correct ArrayList type and
                remove them (you can give a message if you want: "$name was terminated").


 */
