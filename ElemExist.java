package ArraySearching;
import java.util.Scanner;
public class ElemExist {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int key = kavi.nextInt();
        for(int i = 0;i<k;i++){
            if(arr[i] == key){
                System.out.println("The element is found at : " + i);
                return;
            }
            }
            System.out.println("The element is not found !");
        }
    }
