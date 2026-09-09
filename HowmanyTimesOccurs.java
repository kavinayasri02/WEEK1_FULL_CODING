package ArraySearching;
import java.util.*;
public class HowmanyTimesOccurs {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int key = kavi.nextInt();
        int count = 0;
        for(int i=0;i<k;i++){
            if(arr[i] == key){
                count++;
            }
        }
        System.out.println("The Element " + key + "is occured " + count + "times");
    }
}
