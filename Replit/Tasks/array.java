package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class array {

        // your codes here
        public static void add_to_r(int[] r, int n) {
            //create new array with one more position:

            int[] arr1 = new int[r.length+1];

            for (int i = 0;  i < arr1.length-1; i++) {
                arr1[i] = r[i];
            }
            arr1[arr1.length-1]=n;
            System.out.println(Arrays.toString(arr1));


        }

        // Do not change those lines
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter size and number:");
            int size = inp.nextInt(),
                    n = inp.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter numbers:");
            for(int i=0 ; i <=size-1; i++){
                arr[i]=inp.nextInt();
            }

            add_to_r(arr, n);


        }
    }

