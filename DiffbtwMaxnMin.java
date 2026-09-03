import java.util.*;
public class DiffbtwMaxnMin {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<k;i++){
           min = Math.min(min,arr[i]);
           max = Math.max(max,arr[i]);
        }
        int diff = max - min;
        System.out.print(diff);
    }
}
