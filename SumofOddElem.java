import java.util.Scanner;
public class SumofOddElem{
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int sum = 0;
        for(int i =0;i<k;i++){
            if(arr[i] % 2 != 0){
               sum = sum + arr[i];
            }
        }
        System.out.print(sum);
        }
    }