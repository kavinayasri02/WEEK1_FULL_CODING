package ArrayReversal;
import java.util.Scanner;import java.util.Arrays;
public class ReverseFirstKelem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[]arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        reverseFirstK(arr,k);
        System.out.print(Arrays.toString(arr));
    }
    public static void reverseFirstK(int[]arr,int k){
        int left = 0;
        int right = k-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
