import java.util.Arrays;

public class SelectSort {
    int[] numbers;

    public SelectSort(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] selectSorting(int[] numbers) {

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
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {157, 98, 3, 57, 1};
        SelectSort mySelectSort = new SelectSort(numbers);
        int[] ints = mySelectSort.selectSorting(numbers);
    }
}
