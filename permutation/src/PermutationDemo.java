import java.util.Arrays;

public class PermutationDemo {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printPermutation(int[] arr, int index) {
        int size = arr.length;
        if (size == index + 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = index; i < size; i++) {
                swap(arr, i, index);
                printPermutation(arr, index + 1);
                swap(arr, index, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        printPermutation(arr, 0);
    }
}
