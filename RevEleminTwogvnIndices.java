import java.util.Scanner;
import java.util.Arrays;

public class RevEleminTwogvnIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        int steps = sc.nextInt();
        int[] rightRotatedArr = arr.clone();
        int[] leftRotatedArr = arr.clone();

        rotateRight(rightRotatedArr, steps);
        rotateLeft(leftRotatedArr, steps);
        System.out.println("Right Rotated Array: " + Arrays.toString(rightRotatedArr));
        System.out.println("Left Rotated Array:  " + Arrays.toString(leftRotatedArr));
    }

    public static void reverse(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void rotateRight(int[] arr, int k) {
        if (arr == null || arr.length <= 1)
            return;
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void rotateLeft(int[] arr, int k) {
        if (arr == null || arr.length <= 1)
            return;
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
}
