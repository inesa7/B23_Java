package day49_Exceptions;

public class ThrowsKeyword {

    // throws keyword is used for checked exceptions if method is not going to be used/called somewhere else

    public static void main(String[] args) throws InterruptedException {

        System.out.println("test started");
        System.out.println("Step 1");

        Thread.sleep(3000);

        System.out.println("Step 2");
        Thread.sleep(3000);

        System.out.println("test comlpeted");




    }


    public static void sleep(double seconds) throws InterruptedException {

        long milliSeconds = (long)(seconds*1000);
        Thread.sleep(milliSeconds);
    }
}

