package day49_Exceptions;

public class ThrowKeyword {

    // throw keyword is used for manually throwing an exception

    public static void main(String[] args) {

        //throw new RuntimeException("This is unexpected event");

        String browser = "Chrome";

        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Chrome browser is selected");
        } else if (browser.equalsIgnoreCase("firefox")){
            System.out.println("Firefox browser is selected");
        } else if (browser.equalsIgnoreCase("opera")){
            System.out.println("Opera browser is selected");
        }else if (browser.equalsIgnoreCase("safari")) {
            System.out.println("Safari browser is selected");
        }else{
            throw new RuntimeException("Invalid browser name: "+browser);
        }


        //throw new BreakTimeException("Time to take a break"); // Time to take a break

         throw new BreakTimeException(); // It's time for a short break







    }
}
