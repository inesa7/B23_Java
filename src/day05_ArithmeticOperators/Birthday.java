package day05_ArithmeticOperators;
/*
3. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.

 */
public class Birthday {

    public static void main(String[] args) {

        String name = "Mark",
            birthMonth = "April";

        int birthDay = 25,
            birthYear = 1998;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/"+birthYear +".");

        int age = 2021 - birthYear;
        System.out.println(name+" is "+age+" years old. ");

    }
}
