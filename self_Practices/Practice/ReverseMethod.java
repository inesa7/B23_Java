package Practice;

import java.util.Arrays;

public class ReverseMethod {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(array)));

    }

    public static int[] reverse(int[] array){
        int[] reversedArray = new int[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            reversedArray[j]=array[i];
        }

        return reversedArray;


    }


}
/*
create a return method named reverse that accepts one integer array then returns the reversed array
			ex:
				 array = {1,2,3,4,5}

				 reverse(array) ==> {5,4,3,2,1}

 */