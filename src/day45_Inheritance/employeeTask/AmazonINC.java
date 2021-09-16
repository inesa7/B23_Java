package day45_Inheritance.employeeTask;

public class AmazonINC { // Amazon has a tester

    public static void main(String[] args) {

        Tester tester = new Tester("Rob", 'M', 32, 11, "SDET", 120000);
        tester.eat("Pizza");
        tester.sleep();
        tester.testing();

        Developer developer = new Developer("John", 'M', 43, 67, "Developer", 150000);
        developer.eat("steak");
        developer.sleep();
        developer.code();
        developer.fixBugs();

        Driver driver = new Driver("Vova", 'M', 23, 76, "Driver", 80000);
        driver.eat("sushi");
        driver.sleep();
        driver.drive();









    }
}
