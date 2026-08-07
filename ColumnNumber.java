import java.util.Scanner;
public class ColumnNumber {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        for(int i =1;i<=k;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
