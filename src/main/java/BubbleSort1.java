
import java.util.Arrays;

public class BubbleSort1 {

    int[] numbers;

    public BubbleSort1(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] bubbleSorting(int[] numbers) {
        System.out.println("Unsorted array: " + Arrays.toString(numbers));
        System.out.println(" ");

        for (int a = numbers.length - 1; a >= 1; a--) {
            System.out.println("next circle");
            for (int b = 0; b < a; b++) {
                if (numbers[b] > numbers[b + 1]) {
                    int temp = numbers[b];
                    numbers[b] = numbers[b + 1];
                    numbers[b + 1] = temp;
                }
                System.out.println(Arrays.toString(numbers));
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {157, 98, 3, 57, 1};
        BubbleSort1 myBubbleSort = new BubbleSort1(numbers);
        int[] ints = myBubbleSort.bubbleSorting(numbers);
    }
}


