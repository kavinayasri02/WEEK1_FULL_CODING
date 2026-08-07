import java.util.Scanner;
public class AlphaReverseTriangle {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        for(int i =1;i<=k;i++){
            for(int j =k;j>=i;j--){
                System.out.print((char)('A'+ j-1)+ " ");
            }
            System.out.println();
        }
    }
}
