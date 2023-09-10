import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(4);
        System.out.println("Исходный массив: " + Arrays.toString(randomArray));

        int[] sortedArray = sortArray(randomArray);
        System.out.println("Упорядоченный массив: " + Arrays.toString(sortedArray));
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = array.clone();
        int temp;

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        return sortedArray;
    }
}
