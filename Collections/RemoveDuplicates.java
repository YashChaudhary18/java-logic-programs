import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Create a list with duplicate elements
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);

        System.out.println("Original List:");
        System.out.println(numbers);

        // Convert List to Set (removes duplicates automatically)
        Set<Integer> uniqueSet = new HashSet<>(numbers);

        // Convert Set back to List
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("List after removing duplicates:");
        System.out.println(uniqueList);
    }
}