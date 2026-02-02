import java.util.Scanner;
public class countdigit {
    public static void main(String[] args){
        Scanner kavi=new Scanner(System.in);
        int n = kavi.nextInt();
        int step=0;
        while(n>0){
            n/=10;
            step++;
        }
        System.out.println(step);
    }
}
