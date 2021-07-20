package day23_Arrays;

public class NamesScores {
    public static void main(String[] args) {

         int [] scores = {85,70,95,90,100};
         String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};
         // index:             0        1       2       3       4

        int maxScore = scores[0];
        String maxName;

        int minScore = scores[0];

        for (int i = 0; i <=names.length-1; i++) {
            String eachName = names[i];
            int eachScore = scores[i];
            System.out.println(names[i] + ":"+ scores[i]);

            if(eachScore>maxScore){
                maxScore = eachScore;
                maxName = eachName;
            }
        }

        System.out.println("maxScore = " + maxScore);
    }
}
