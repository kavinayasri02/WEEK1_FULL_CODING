package ArrayReversal;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[]arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        } 
        for(int i=k-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
