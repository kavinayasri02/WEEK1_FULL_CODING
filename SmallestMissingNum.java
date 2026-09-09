package ArraySearching;
import java.util.Scanner;
public class SmallestMissingNum {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int i =0;
        while(i<k){
            int crtIdx = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= k && arr[i] != arr[crtIdx]){
                int temp = arr[i];
                arr[i] = arr[crtIdx];
                arr[crtIdx] = temp;
            }else{
                i++;
            }
        }
        int miss = k + 1;
        for(int j = 0;j<k;j++){
            if(arr[j] != j+1){
                miss = j + 1;
                break;
            }
        }
        System.out.println("The Smallest Missing positive number is : " + miss);
    }
}
