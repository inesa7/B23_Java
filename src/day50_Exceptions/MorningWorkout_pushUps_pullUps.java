package day50_Exceptions;

public class MorningWorkout_pushUps_pullUps {

    public static void main(String[] args) {

        for (int i = 1; i < 30; i++) {
            System.out.println("Push up " + i);
            pause(2.5);
        }

        System.out.println("----------------------");

        for (int i = 1; i < 20; i++) {
            System.out.println("Pull up "+i);
            pause(3.5);
        }
    }

        public static void pause(double seconds){ // we created custom method pause() to get rid of exception

            try { // we use try/catch because we are going to call pause() method more than one time
                Thread.sleep((long)(seconds * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
/*
Do 30 push-ups
                try pausing 2.5 seconds in each

        2. Do 20 Pull-ups
                try pausing 3.5 seconds in each
 */
