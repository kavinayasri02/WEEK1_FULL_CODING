import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
     Scanner naya = new Scanner(System.in);
     System.out.println("Enter a Number:");
     int value = naya.nextInt();
     if(value%2==0){
        System.out.println(value+ "is an Even number");
     }else{
        System.out.println(value+"is an Odd number");
     }
    }
}