package Practice;
/*
Given int z=198;
• verify that the number of z is even number
 */
public class TaskDay07 {
    public static void main(String[] args) {
        int z = 198;

        boolean isEven = z % 2 == 0;
        System.out.println(z + " is even: " + isEven);
    }
}

