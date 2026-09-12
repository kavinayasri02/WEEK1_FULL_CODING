package ArrayReversal;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseLastKelem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[]arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        reverseLastK(arr,k);
        System.out.print(Arrays.toString(arr));
    }
    public static void reverseLastK(int[]arr,int k){
        int n = arr.length;
        int left = n-k;
        int right = n-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
