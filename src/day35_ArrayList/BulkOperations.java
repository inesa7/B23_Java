package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9) );
        System.out.println(numbers); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        numbers.removeAll(Arrays.asList(1,2,3));
        System.out.println(numbers); // [4, 5, 6, 7, 8, 9]

        System.out.println("------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( numbers );
        System.out.println(numbers); // [4, 5, 6, 7, 8, 9]
        list.addAll(  Arrays.asList( 10, 11, 12, 13, 14,15 )  ); // [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        System.out.println(list);

        System.out.println("------------------------------------------------");

        ArrayList<String>  students = new ArrayList<>();
        students.addAll(  Arrays.asList( "Dilem", "Fhilipp", "Abbos", "Abbos", "Abbos", "Atila", "Ekaterina", "Dilem", "Fhilipp" , "Fhilipp") );
        System.out.println(students); // [Dilem, Fhilipp, Abbos, Abbos, Abbos, Atila, Ekaterina, Dilem, Fhilipp, Fhilipp]

        students.removeAll(  Arrays.asList("Dilem", "Fhilipp", "Abbos")  ); // [Atila, Ekaterina]
        System.out.println(students);

        System.out.println("------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,3,4,5,6,7,8,9,1,1,1,1,1,1,1,1,1,1,1,1) );
        System.out.println(nums);

        nums.removeAll(  Arrays.asList( 1 ) );
        System.out.println(nums); // [2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9]

        // retainAll: keep matching elements, remove  non-matching elements
        nums.retainAll( Arrays.asList(2, 3) );
        System.out.println(nums); // [2, 2, 2, 2, 3, 3, 3, 3, 3]

        System.out.println("------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll( Arrays.asList(  "Dilem", "Fhilipp", "Abbos", "Ahmet", "Andrei", "Gabil", "Aliya", "Atila" ));

        System.out.println(employees);

        //  employees.removeAll( Arrays.asList("Ahmet", "Andrei"));
        employees.retainAll( Arrays.asList("Ahmet", "Andrei"));
        System.out.println(employees);


        System.out.println("----------------------------------------------------------");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList( "Soda", "Milk", "Wine", "Beer", "Eggs", "Bread", "Water", "Apple", "Cherry" , "Paper Towels" ));

        //check if Soda, Wine, Beer all of the are contained in groceryList
        boolean r =groceryList.containsAll(  Arrays.asList("Soda", "Wine", "Beer", "Coffee")  );

        System.out.println("r = " + r); // r = false


        System.out.println("------------------------------------");

        ArrayList<String> l = new ArrayList<>();
        l.add("Enes");
        l.add("Akbor"); //{Enes, Akbor}
        l.add(1, "Alex"); //{Enes, Alex, Akbor}
        l.add(0, "Alp");  //{"Alp", Enes, Alex, Akbor}

        System.out.println(l);

    }

}
