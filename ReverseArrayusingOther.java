package ArrayReversal;
import java.util.Scanner;
public class ReverseArrayusingOther {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[]arr = new int[k];
        int[]brr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int l = 0;
        for(int i=k-1;i>=0;i--){
            brr[l++] = arr[i];
        }
        for(int i=0;i<k;i++){
            System.out.print(brr[i]);
        }
    }
}
