package day27_Recap;

public class FirstUniqueElementFromArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,1,1,1};
        int firstUniqueElement = 0;

        for (int j = 0; j < nums.length ; j++) { // outer loop for repeating the inner loop

        int frequency = 0;
        for (int i = 0; i < nums.length; i++) { // inner loop is for finding the frequency of one element
            if(nums[i] == nums[j]){
                frequency++;
            }
            if(frequency==1){ // the element is unique
                firstUniqueElement=nums[j];
                break; // to make sure that only the first unique element is returned from the loop
            }
            }
            System.out.println(nums[j]);

            System.out.println("firstUniqueElement = " + firstUniqueElement);
        }

        /*
        using for each loop:
        for( int each : nums){
       int frequency = 0;
        for (int i = 0; i <= nums.length-1; i++) { // inner loop is for finding the frequency of one element
            if(nums[i] == nums[j]){
                frequency++;
            }
            if(frequency==1){ // the element is unique
                firstUniqueElement=nums[j];
                break; // to make sure that only the first unique element is returned from the loop
            }
            }
       }
         */

    }
}
/*
write a program that can return the first unique element from the array
 */