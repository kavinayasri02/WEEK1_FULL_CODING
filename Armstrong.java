import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = num.nextInt();
        num.close();
        int originalnumber = number;
        int result = 0;
        int n =String.valueOf(number).length();
        while(number>0){
            int digit=number%10;
            result+=(int)Math.pow(digit,n);
            number/=10;
        }
       if(result == originalnumber){
        System.out.println(originalnumber + "is an Armstrong number");
       }
       else{
        System.out.println(originalnumber + "is not an Armstrong number"); 
       }
    }
}
