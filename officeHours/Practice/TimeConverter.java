package Practice;

public class TimeConverter {
    public static void main(String[] args) {
        //1 hours =
        int inputSeconds=3695;

        int hours,minutes,seconds;

        hours = inputSeconds/3600; //hours = 1
                    //95/60=1
        minutes = (inputSeconds%3600)/60; //1

        seconds=inputSeconds%60;

        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds");
    }
}
