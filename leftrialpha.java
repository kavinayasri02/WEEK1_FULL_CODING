import java.util.Scanner;
public class leftrialpha {
public static void main(String[] args) {
    Scanner kavi = new Scanner(System.in);
    int num = kavi.nextInt();
    char let = kavi.next().charAt(0);
    for(int i=1;i<=num;i++){
       for(int j =1;j<=i;j++){
        System.out.print(let + " ");
       }
    }
}  
}