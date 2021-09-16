package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Water");
        groceryList.add("Fruit");
        groceryList.add("Vegetables");
        System.out.println(groceryList); // [Eggs, Milk, Bread, Water, Fruit, Vegetables]

        groceryList.add(0, "Cream");
        System.out.println(groceryList); // [Cream, Eggs, Milk, Bread, Water, Fruit, Vegetables]

        System.out.println("-----------------------------------------------");

        // set(index, Object) method: replace old element at given index with new; replace Eggs with Yogurt
        groceryList.set(1, "Yogurt");
        System.out.println(groceryList); // [Cream, Yogurt, Milk, Bread, Water, Fruit, Vegetables]

        System.out.println("-----------------------------------------------");

        // remove(index) method:

        groceryList.remove(1); // remove "Yogurt"
        System.out.println(groceryList); // [Cream, Milk, Bread, Water, Fruit, Vegetables]

        //remove(object) as a String " ":
        groceryList.remove("Water");
        System.out.println(groceryList); // [Cream, Milk, Bread, Fruit, Vegetables]

        // the return type in remove(Object) is boolean
        boolean r1 =  groceryList.remove("Water");
        System.out.println(r1); // true

        System.out.println("-----------------------------------------------");

        System.out.println(groceryList); // [Cream, Bread, Fruit, Vegetables]

        // clear(Object) method: removes all Objects
        groceryList.clear();
        System.out.println(groceryList); // [] empty

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        System.out.println(list1); // [10, 20, 30, 40, 50]

        // to remove index as an int:
        list1.remove(1);
        System.out.println(list1); // [10, 30, 40, 50]

        // to remove as an object "30":
        list1.remove( (Integer) 30);
        System.out.println(list1); // [10, 40, 50]

        System.out.println("-----------------------------------------------");
        
        // indexOf method
        ArrayList<Character> list = new ArrayList<>();
        
        list.add('A'); // 0
        list.add('A'); // 1
        list.add('A'); // 2
        list.add('B'); // 3
        list.add('A'); // 4
        list.add('D'); // 5
        list.add('C'); // 6
        System.out.println(list);
        
        list.indexOf('A'); // 0
        list.lastIndexOf('A'); //4
        
        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (Character each : list) {
            if(list.indexOf(each) == list.lastIndexOf(each)){
                uniqueChars.add(each);
            }
        }

        System.out.println("uniqueChars = " + uniqueChars);

        System.out.println("-----------------------------------------------");


        //remove duplicates with contains .method

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        ArrayList<Character> result = new ArrayList<>();

        //option 1
        for (int i = 0; i < characters.size(); i++) {
            if(!result.contains(characters.get(i))){
                result.add(characters.get(i));
            }
        }

        //option 2
        for (Character each : characters) {
            if(!result.contains(each)){
                result.add(each);
            }
        }

        System.out.println("result = " + result);

        System.out.println("-----------------------------------------------");

        //reverse
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        ArrayList<Integer> result1 = new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            result1.add(nums.get(i));
        }

        System.out.println(result1); // [400, 300, 200, 100]

        System.out.println("----------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        System.out.println(n1.equals(n2)); // true

        }
    }

