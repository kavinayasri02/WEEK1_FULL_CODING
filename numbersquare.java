/*public class numbersquare {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}*/
/*otp will be 
 1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 */
/*import java.util.Scanner;
public class numbersquare{
    public static void main(String[] args) {
        Scanner sis = new Scanner(System.in);
        int val = sis.nextInt();
        for(int i = 1;i<=val;i++){
            for(int j =1;j<=val;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}*/
/* ourput will be 
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5*/
import java.util.Scanner;
public class numbersquare{
     Scanner kavi = new Scanner(System.in);
        int val = kavi.nextInt();
         for (int row = 1; row <= val; row++) {
            for (int col = 1; col <= val; col++) {
                System.out.print(val + " ");
            }
        }
}