package ArraySearching;
import java.util.*;
public class Elemthatappearsonce {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =-0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
      for(int j = 0;j<k;j++){
        int count = 0;
        for(int r =j;r<k;r++){
            if(arr[j] == arr[r]){
                count++;
            }
        }
        if(count == 1){
            System.out.print("The element that appears once is: " + arr[j] + "in the index" + j);
            return;
        }
      }
    System.out.print("No element appears once");
    kavi.close();
    }
}
