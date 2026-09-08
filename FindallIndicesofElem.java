package ArraySearching;
import java.util.*;
public class FindallIndicesofElem {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr= new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int key = kavi.nextInt();
        System.out.print("The Given element occurs at index ");
        for(int i =0;i<k;i++){
            if(arr[i] == key){
                System.out.print(i + " ");
            }
        }
    }
}
