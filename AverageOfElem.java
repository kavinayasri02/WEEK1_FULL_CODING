import java.util.Scanner;
public class AverageOfElem {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int sum =0;
        for(int i =0;i<k;i++){
            sum += arr[i];
        }
        sum = sum/k;
        System.out.print(sum);
    }
}