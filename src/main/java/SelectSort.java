import java.util.Arrays;

public class SelectSort {


    public static void main(String[] args) {
        int[] numbers = {8, 1, 7, 4, 6, 2, 33, 3, 10};
        System.out.println("Unsorted array: " + Arrays.toString(numbers));

        int min = 0;
        int indexOfMin = 0;
        for (int a = 0; a < numbers.length; a++) {
            min = numbers[a];
            indexOfMin = a;

            for (int b = (a + 1); b < numbers.length; b++) {
                if (numbers[b] < min) {
                    min = numbers[b];
                    indexOfMin = b;
                }
            }
            if (numbers[a] > numbers[indexOfMin]) {
                numbers[indexOfMin] = numbers[a];
                numbers[a] = min;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
