import java.util.*;
public class Diffbtwseclarsecsmall{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        for(int i =0;i<k;i++){
            if(arr[i] > largest){
                secLarge = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLarge && arr[i] != largest){
                secLarge = arr[i];
            }
        }
        int smallest = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(arr[i] < smallest){
                secsmall = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secsmall && arr[i] != smallest){
                secsmall = arr[i];
            }
        }
        int diff = secLarge - secsmall;
        System.out.print(diff);
    }
}

