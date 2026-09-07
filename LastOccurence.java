package ArraySearching;
import java.util.Scanner;
public class LastOccurence {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int LastOcc = kavi.nextInt();
        for(int i =k-1;i>=0;i--){
            if(arr[i] == LastOcc){
                System.out.print("The LastOccurence of an Element is : " + i);
                return;
            }
        }
        System.out.println("There is no LastOccurence Element");
    }
}