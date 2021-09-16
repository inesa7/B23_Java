package day42_CustomClass_Constructor.car;

public class Car {
    public String make, model, color;
    public double price;
    public int year;

    public Car(String make) { // 1st constructor: initializes the make ONLY
        this.make = make;
    }

    public Car(String make, String model) { // 2nd constructor: initializes make & model (MUST use constructor call to set the make)
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) { // 3rd constructor: initializes make, model, year (MUST use constructor call to set the make, model)
        this(make, model);
        this.year=year;
    }

    public Car(String make, String model, int year, double price){ // 4th constructor: initializes make, mode, year, price (MUST use constructor call to set the make, model, year)

        this(make, model, year);
        this.price=price;
    }

    public Car(String make, String model, String color, double price, int year) { //5th Constructor: initializes all the instances(MUST use constructor call to set the make, mode, year, price, color)
        this(make, model, year, price);
        this.color=color;

    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}

/*
instance variables:
		 		make, model, year, price, color

 		1st constructor: initializes the make ONLY

 		2nd constructor: initializes make & model
 				(MUST use constructor call to set the make)

		3rd constructor: initializes make, model, year
				(MUST use constructor call to set the make, model)

		4th constructor: initializes make, mode, year, price
				(MUST use constructor call to set the make, model, year)

		5th Constructor: initializes all the instances
				(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString

 */
