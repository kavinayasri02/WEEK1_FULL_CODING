import java.util.Scanner;
public class leftright{
    public static void main(String[] args) {
        Scanner res =new Scanner(System.in);
        int n =res.nextInt();
        int temp=n;
        int step=0;
        while(n>0){
            n/=10;
            step++;
        }
        int div=(int)Math.pow(10, step-1);
        while (div>0) {
            int dig=(temp/div)%10;
            System.out.println(dig);
            div/=10;
        }
    }
}
