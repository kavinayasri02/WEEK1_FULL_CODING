/*public class alphacontsqr {//continuous alphabet 
    public static void main(String[] args) {
        int n = 5; // number of rows and columns
        char ch = 'a'; // starting character

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(ch + " ");
                ch++; // move to next alphabet
            }
            System.out.println();
        }
    }
}*/
import java.util.Scanner;
public class alphacontsqr{
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int val = kavi.nextInt();
        char ch=60;
         for (int row = 1; row <= val; row++) {
            for (int col = 1; col <= val; col++) {
                System.out.print(ch + " ");
                ch++; // move to next alphabet
            }
            System.out.println();
    }
}
}
//otp will be 
/*a b c d e 
f g h i j 
k l m n o 
p q r s t 
u v w x y*/