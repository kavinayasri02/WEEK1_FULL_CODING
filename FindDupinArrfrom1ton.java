package ArraySearching;
import java.util.Scanner;
public class FindDupinArrfrom1ton {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        boolean dupFound = false;
        for(int i =0;i<k;i++){
            int idx = Math.abs(arr[i]);
            if(arr[idx] < 0){
                System.err.println(idx + " ");
                dupFound = true;
            }else{
                arr[idx] = -arr[idx];
            }
        }
        if(!dupFound){
            System.err.println("No duplicate element found");
        }
    }
}
