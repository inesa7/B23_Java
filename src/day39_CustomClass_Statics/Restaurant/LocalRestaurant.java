package day39_CustomClass_Statics.Restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.setInfo("Rosario", "Gaithersburg", 5);
        Server[] servers = {new Server(), new Server(), new Server()};
        servers[0].setInfo("Jane", 1, 15, true);
        servers[1].setInfo("Marina", 2, 14, false);
        servers[2].setInfo("Inna", 3, 13, true);

        Server server = new Server(); // ?
        //server.servers.addAll()

        Chef[] chefs = {new Chef(), new Chef()};
        chefs[0].setInfo("Tony", 4, 25, true);
        chefs[1].setInfo("Linda", 5, 30, false);

        System.out.println(restaurant);




    }

}
/*
Create a class LocalRestaurant that has a main method with the following:
        	- Make a Restaurant object
        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers
        	in the Restaurant object
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs
            in the Restaurant object

            - Print your whole restaurants information

        Extra Tasks:
        	- Find out the cost of all the employees (servers + chefs) by checking all of their hourly rates

        	- Make two new ArrayLists that will separate all the employees (servers + chefs) by full time and part time. Their position of server or chef does not matter for these ArrayList, only their employment status

        	- Make sure the Restaurant is staffed enough for the level of stars it is using the following requirements:
                5 stars: need at least 6 chefs and 10 servers
                4 stars: need at least 3 chefs and 7 servers
                3 stars: need at least 1 chefs and 4 servers

            	- if the restaurant does not have the correct number of chefs or servers based on their number of stars you should print a message: "Need to hire more $chefs or $servers (maybe both). Otherwise you can print: "Up to standard"

 */