package ArrayReversal;
import java.util.Scanner;import java.util.Arrays;
public class RotateArrayLeftbyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[]arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int tym = sc.nextInt();
        rotateLeft(arr,tym);
        System.out.print("Rotated Array: "+ Arrays.toString(arr));
    }
    public static void rotateLeft(int[]arr,int k){
        if(arr==null||arr.length<=1)return;
        int n = arr.length;
        k = k%n;
        for(int i=0;i<k;i++){
            int first = arr[0];
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
    }
}
