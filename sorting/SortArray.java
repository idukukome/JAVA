import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        Arrays.sort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}