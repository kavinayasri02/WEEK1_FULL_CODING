
import java.util.Scanner;
public class PascalsTriangle {
public static void main(String[]args){
    Scanner kavi = new Scanner(System.in);
    int k = kavi.nextInt();
    for(int i = 0 ; i<k;i++){
         int val = 1;
        for(int j = 0;j<=i;j++){
            System.out.print(val + " ");
            val = val * (i-j)/(j+1);
        }
        System.out.println();
    }
}    
}
