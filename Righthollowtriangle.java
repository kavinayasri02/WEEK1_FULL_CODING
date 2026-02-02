import java.util.Scanner;
public class Righthollowtriangle{
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        for(int row = 1; row <= n; row++){
            // Print leading spaces
            for(int space = 1; space <= n - row; space++){
                System.out.print("   "); // 3 spaces to align with " * "
            }
            // Print stars with hollow logic
            for(int col = 1; col <= row; col++){
                if(row == 1 || row == n || col == 1 || col == row)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}