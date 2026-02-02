import java.util.Scanner;
public class lefthollowtriangle {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int n = src.nextInt();
        for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            if(row==1||row==n||col==1||col==n|row==col)
            System.out.print( " * ");
            else
            System.out.print("   ");
        }
System.out.println();

    }
}
}
