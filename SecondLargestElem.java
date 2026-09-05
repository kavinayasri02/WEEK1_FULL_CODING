import java.util.Scanner;
public class SecondLargestElem {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        for(int i =0;i<k;i++){
            if(arr[i] > largest){
                secLarge = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLarge && arr[i] != largest){
                secLarge = arr[i];
            }
        }
        if(secLarge == Integer.MIN_VALUE){
            System.out.println("There is no second largest element(all elements might be equal).");
        }else{
            System.out.println("The Second Largest element is : " + secLarge);
        }
    }
}
