/*public class posneg {
    public static void main(String[] args) {
        byte a = 32;
        byte b =-12;
        if(a>0){
            System.out.println(a+"is a positive number");
        }else{
            System.out.println(a+"is a negative number");
        }
        if(b>0){
            System.out.println(b+"is a positive number");
        }else{
            System.out.println(b+"is a negative number");
        }
    }
}*/
import java.util.Scanner;
public class posneg{
    public static void main(String[] args) {
        Scanner sri = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sri.nextInt();
        if(number>0){
            System.out.println(number+"is a Positive number");
        }else{
            System.out.println(number+"is a Negative number");
        }
        sri.close();
    }
}
/*6
6is a Positive number
 -90
-90is a Negative number*/