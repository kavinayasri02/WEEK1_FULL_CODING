package ArraySearching;
import java.util.Scanner;
public class FirstUniqueElem {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        boolean found = false;
        for(int i =0;i<k;i++){
            int key = 0;
            for(int j =0;j<k;j++){
                if(arr[i] == arr[j] && i != j){
                   key++;
                }
            }
                if(key == 0){
                    System.out.print("The First Unique Element in the array is " + arr[i]);
                    found = true;
                    break;
                }
            }
            if(!found){
                 System.out.println("No unique elements found. ");
            }
        }
    }