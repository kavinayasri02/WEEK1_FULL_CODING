package ArraySearching;
import java.util.*;
public class CheckifArrayhasDup {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        boolean hasDup = false;
        for(int i =0;i<k;i++){
            for(int j =i+1;j<k;j++){
                if(arr[i] == arr[j]){
                    hasDup = true;
                    break;
                }
            }
            if(hasDup){
                break;
            }
        }
        System.out.println("The Array Contains duplicate : "+ hasDup);
    }
}