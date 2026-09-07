package ArraySearching;

import java.util.Scanner;
public class FirstOccurence{
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
    int fisrtOcc = kavi.nextInt();
    for(int i=0;i<k;i++){
        if(arr[i] == fisrtOcc){
            System.out.println("The FirstOccurence of Element is : " + i);
            return;
        }
    }
    System.out.print("There is no element");
}
}
