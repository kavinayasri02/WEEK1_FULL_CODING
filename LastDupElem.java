import java.util.*;
public class LastDupElem {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        boolean found = false;
        int lastDup = -1;
        for(int i = 0;i<k;i++){
            for(int j = i+1;j<k;j++){
                if(arr[i] == arr[j]){
                  lastDup = arr[j];
                  found = true;
                }
            }
        }
            if(found){
                System.out.println("The Last Duplicate element is " + lastDup);
            }else{
                System.out.println("No Duplicates found");
            }   
        }
    }
