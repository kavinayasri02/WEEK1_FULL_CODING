package ArrayReversal;
import java.util.Scanner;
import java.util.Arrays;

public class RotateArrayRightbyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        int tym = sc.nextInt();
        rotateRight(arr, tym);
        System.out.print("Rotated Array: " + Arrays.toString(arr));
    }

    public static void rotateRight(int[] arr, int k) {
        if (arr == null || arr.length <= 1)
            return;
        int n = arr.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }
}
