import java.util.Scanner;
public class SearchforNum {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        //Enter the element to be searched
        int key = kavi.nextInt();
        for(int i=0;i<k;i++){
            if(arr[i] == key){
                key = arr[i];
                System.out.println("The element searched is : " + i);
                return;
            }
        }
    }
}
