import java.util.*;
public class PrintEleminRev {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] sri = new int[k];
        for(int i =0;i<k;i++){
            sri[i] = kavi.nextInt();
        }
        for(int i=k-1;i>=0;i--){
            System.out.print(sri[i] + " ");
        }
    }
}