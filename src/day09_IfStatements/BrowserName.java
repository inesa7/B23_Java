package day09_IfStatements;
/*
write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, output should be: Invalid Browser Name
             Ex:
                browserName = "chrome";

                output:
                    Chrome Browser is Selected
 */
public class BrowserName {
    public static void main(String[] args) {
        String browserName = "Chrome";

        if (browserName == "Chrome") {
            System.out.println(browserName + " Browser is selected");
        } else if (browserName == "Firefox") {
            System.out.println(browserName + " Browser is selected");
        } else if (browserName == "Opera") {
            System.out.println(browserName + " Browser is selected");
        }else if(browserName == "Safari"){
        System.out.println(browserName+" Browser is selected");
        }else{
            System.out.println("Invalid Browser Name");
        }
    }
}
