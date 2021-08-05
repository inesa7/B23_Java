package day40_Custom_Class_Statics.Address;

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;
    public static String country = "USA";

    public void setInfo(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city +" " + state + ", " + zipCode;
    }
}
/*
Create a class named Address
    Attributes:
        instance:  buildingNumber, street, city, state, zipCode;
        static: country
 */