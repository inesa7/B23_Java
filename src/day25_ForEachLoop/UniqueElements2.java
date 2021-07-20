package day25_ForEachLoop;

public class UniqueElements2 {
    public static void main(String[] args) {


        char[] chars = {'A', 'B', 'C', 'A', 'D', 'D', 'C', 'F'};

        for(char each : chars) {

            int count = 0;

            for (char character : chars) {
                if (character == each)
                    count++;
            }

            if(count==1){
                System.out.println(each);
            }



        }
    }
}