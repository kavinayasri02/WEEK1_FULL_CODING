import java.util.Scanner;
public class CountPosNeg {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int PosCount =0;
        int NegCount =0;
        for(int i =0;i<k;i++){
            if(arr[i] > 0){
                PosCount++;
            }else{
                NegCount++;
            }
        }
        System.out.println(PosCount+ " is the Count of Positive Elements");
        System.out.println(NegCount+ " is the Count of Negative Elements");
    }
}
