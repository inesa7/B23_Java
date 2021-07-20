package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord_Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] arr = str.split(",");
        String shortestWord=arr[0]; // to check each word with first element "olive" and assign to first element of this string
        String strOfShortestWords=""; // to assign all short words in this string

        for(String each:arr){
            if(each.length()<shortestWord.length()){
                shortestWord=each;
            }
        }
        for ( String element :arr) {
            if(element.length()==shortestWord.length()){
                strOfShortestWords+=element+", ";
            }
        }

        String[] arrOfShortestWords= strOfShortestWords.split(", ");
        System.out.println(Arrays.toString(arrOfShortestWords));
    }
}
