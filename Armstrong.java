import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = num.nextInt();
        num.close();
        int og = n;
        int result = 0;
        int n =String.valueOf(n).length();
        while(n>0){
            int digit=n%10;
            result+=(int)Math.pow(digit,n);
            n/=10;
        }
       if(result == og){
        System.out.println(og + "is an Armstrong number");
       }
       else{
        System.out.println(og + "is not an Armstrong number"); 
       }
    }
}
