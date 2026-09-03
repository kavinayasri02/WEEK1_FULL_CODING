import java.util.*;
public class FirstNLast {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
            System.out.print(arr[0]+ " " + arr[k-1]);
        }
    }
