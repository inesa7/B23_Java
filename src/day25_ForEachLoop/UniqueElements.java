package day25_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"java", "java", "python", "c#"};

        for (String each : words) { // to find the frequency of ech word

            int count = 0;

            for (String word : words) {
                if (word.equals("java"))
                    count++;
            }

            if (count == 1) {
                System.out.println("java");
            }

        }
    }
}
/*
write a program that can print the unique elements from an array of string
            Ex:
                {"java", "java", "python", "c#"}

            output:
                python c#


                MUST use for each loop
You do not have permission to send messages in this channel.

 */