import java.util.Scanner;

public class Leftalphatriangle {
    public static void main(String[] args) {
        Scanner ck = new Scanner(System.in);
        int n = ck.nextInt();
        for(int row = 1; row <= n; row++){
            char ch = 'A';
            for(int col = 1; col <= row; col++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}