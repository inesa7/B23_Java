package day26_MultiDimensionalArrays;

public class MultiDimensionalArrays_Practice {
    public static void main(String[] args) {
        /*
        Given:
                int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
         */

        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        // index:            0               1               2

        // outer for loop
        for(int i = arr2D.length-1; i>=0; i--){ // i: index of each single dimens arr started from

            // inner for loop
            for (int j = 0; j < arr2D[i].length; j++) { // j: index of each element in single dimes arr started from 0
                System.out.print(arr2D[i][j]+" ");  // 9 10 11 12 13
                                                    // 4 5 6 7 8
                                                    //123

            }

            /*
            using for each loop

            for( int each :arr2D[i]){
                System.out.println(each +" ");

            */

                System.out.println(); // to print arrays from the new line
        }


        System.out.println("--------------------------------------");

        /*
        task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
         */

        for (int i = 0; i < arr2D.length; i++) { // i: index of each single dim arr starting from index 0

            for (int j = arr2D[i].length-1; j >=0 ; j--) { // i: index of each element in single dim arr starting from last index
                System.out.print(arr2D[i][j]+" "); //3 2 1
                                                    //8 7 6 5 4
                                                    //13 12 11 10 9
            }
            System.out.println(); // to print arrays from the new line

        }

        System.out.println("---------------------------");

        /*
        task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
         */

        for (int i = arr2D.length - 1; i >= 0; i--) {

           for(int j = arr2D[i].length-1; j>=0; j--){
               System.out.print(arr2D[i][j]+" "); //13 12 11 10 9
                                                 //8 7 6 5 4
                                                // 3 2 1
           }

            System.out.println();

            }

        }



        }


