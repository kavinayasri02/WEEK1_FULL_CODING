import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner ice = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = ice.nextLine();
        ice.close();
    for(int i=1;i<=name.length();i++){
        System.out.println(name.substring(0, i));
    }
}
}