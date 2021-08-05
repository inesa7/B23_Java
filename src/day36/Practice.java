package day36;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8));

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < 5) {
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8));

        // remove elements that are less than 5

        list2.removeIf(p -> p < 5);
        System.out.println(list2); // [5, 5, 6, 6, 7, 7, 7, 8, 8, 8]

        // remove odd numbers
        list2.removeIf(p -> p % 2 != 0);
        System.out.println(list2); // remove odd numbers [6, 6, 8, 8, 8]

        System.out.println("------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Inna", "Lena", "Marina", "Anna", "Lori", "Helen", "Phil"));

        // remove all names that contain "a":
        names.removeIf(p -> p.contains("a"));
        System.out.println(names); // [Lori, Helen, Phil]

        System.out.println("------------------------------------------------------");

        // remove palindrome
        ArrayList<String> palindrome = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Java", "Python", "Pop", "Kayak"));

        names.removeIf(p -> StringUtility.isPalindrome(p));
        System.out.println(names); // [Lori, Helen, Phil, Java, Python]

        for (String each : names) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            boolean isPalindrome = reverse.equalsIgnoreCase(each);
            names.removeIf(p -> isPalindrome);

            System.out.println(names);

        }
    }
}

