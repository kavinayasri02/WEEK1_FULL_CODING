import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =kavi.nextInt();
        kavi.close();
        int square = num*num;
        int sum=0;
        while(square>0){
            int digit=square%10;
            sum+=digit;
            square/=10;
        }
        if(sum==num){
            System.out.println(num +"is a Neon number");
        }
        else{
            System.out.println(num +"is not a Neon number");
        }
        }
}
