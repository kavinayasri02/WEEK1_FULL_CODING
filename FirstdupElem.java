package ArraySearching;
import java.util.Scanner;
public class FirstdupElem {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        boolean found = false;
        for(int i =0;i<k;i++){
            int count = 0;
            for(int j = i+1;j<k;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > 0){
                System.out.print(arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No duplicates found");
        }
    }
}
