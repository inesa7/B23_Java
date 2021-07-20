package Practice;

public class ArrayContains {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int num =6;
        System.out.println(contains(array,num));
    }

    public static boolean contains(int[] array, int num){
        boolean contains = false;

        for (int i = 0; i < array.length; i++) { //{1,2,3,4,5}
            if(array[i]==num){ //3
                contains=true;
                // break;

//            }else{
//                contains=false;
            }
        }

        return contains;
    }



}
/*
create a return method named contains that accepts one integer array and one integer,
returns true if the integer is contained in the array, otherwise returns false
			Ex: array = {1,2,3,4,5}
				num = 5;

				contains(array, num) ==> true

 */