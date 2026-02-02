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
public class numbersqare{
    public static void main(String[] args) {
    Scanner kavi = new Scanner(System.in);
        int val = kavi.nextInt();
        int ini = 0;
         for (int row = 1; row <= val; row++ , System.out.println()){
            if(row%2==1){
                for(int col=ini+1;col<=ini+val;col++){
                   System.out.printf("%3d",col);
                }
                ini+=2*val;
            }
            else{
                for(int col=ini;col>ini-val;col--){
                    System.out.printf("%3d",col);
                }
            }
         }
        }
    }
    /*output for this will be 
    5
  1  2  3  4  5
 10  9  8  7  6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25
  */