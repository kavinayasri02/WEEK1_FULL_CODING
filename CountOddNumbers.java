import java.util.Scanner;
public class CountOddNumbers {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int count = 0;
        for(int i =0;i<k;i++){
           if(arr[i] % 2 != 0){
             count++;
           }
        }
        System.out.print(count);
    }
}
