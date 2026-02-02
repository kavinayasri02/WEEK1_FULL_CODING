import java.util.Scanner;
public class Namerev {
    public static void main(String[] args) {
        Scanner ice = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = ice.nextLine();
        ice.close();
        for(int i =name.length()-1;i>=0;i--){
            System.out.println(name.substring(0,i));
        }
    }
}