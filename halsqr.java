import java.util.Scanner;

public class halsqr{
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int n = src.nextInt();
        for(int row=1;row<=n;row++){
        for(int col=1;col<=n;col++){
            if(row==1||row==n||col==1||col==n)
            System.out.print( " 4 ");
            else
            System.out.print("   ");
        }
System.out.println();

    }
}
}