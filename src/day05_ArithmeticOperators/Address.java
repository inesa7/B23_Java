package day05_ArithmeticOperators;

public class Address {

        /*
        1. create a class named Address and declare the following variables:
                name, buildingNumber, streetName, city, state, zipCode

                use string concatenation to display the full address of the person

                Ex:
                    Daniel Owens
                    7925 Jones Branch Dr
                    McLean VA 22102
         */
        public static void main(String[] args) {

            String name = "Daniel Owens";
            int buildingNumber = 7925;
            String streetName = "Jones Branch Dr";
            String city = "McLean";
            String state = "VA";
            int zipCode = 22102;

            System.out.println(name + "\n" + buildingNumber + " " +
                    streetName+" " + "\n" + city + " " + state + " " + zipCode);
        }
    }


