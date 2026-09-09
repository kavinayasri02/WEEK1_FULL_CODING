package ArraySearching;
import java.util.Scanner;
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int ExpSum = (k *(k+1))/2;
        int actualSum = 0;
        for(int i =0;i<arr.length;i++){
            actualSum += arr[i]; 
        }
    int missNum = ExpSum - actualSum;
    System.out.println("The Missing Number is " + missNum);
    }
}
