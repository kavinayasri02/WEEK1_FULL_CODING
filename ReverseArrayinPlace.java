package ArrayReversal;
import java.util.Scanner;
public class ReverseArrayinPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[]arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = k-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
