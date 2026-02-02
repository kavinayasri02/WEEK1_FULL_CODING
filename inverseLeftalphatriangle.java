import java.util.Scanner;

public class inverseLeftalphatriangle {
    public static void main(String[] args) {
        Scanner ck = new Scanner(System.in);
        int n = ck.nextInt();
        for(int row = n-1; row >= 1; row--){
            char ch = 'A';
            for(int col = 1; col <= row; col++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}