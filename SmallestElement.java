import java.util.*;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int min = arr[0];
        for(int i =0;i<k;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}
