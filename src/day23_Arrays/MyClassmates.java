package day23_Arrays;

public class MyClassmates {
    public static void main(String[] args) {
        // if the number of elements to store is known
        String[] group = {"Esra", "Suat", "Aisu", "Ella", "Elena", "Yusuf", "Mohammed", "Tin", "Rmatua"}; //9 people

        String[] group9 = new String[9]; // if we don't know what elements are but we know their number
        System.out.println("Size: "+group9.length);

        for (int i = 0; i <= group9.length-1 ; i++) { // i: index numbers of the array
            System.out.println(group9);

        }

    }
}
