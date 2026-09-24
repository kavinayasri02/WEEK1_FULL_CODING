import java.util.*;
public class RemovingMinElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int maxLen = 0;
        int i =0;
        for(int j=0;j<n;j++){
            while(i<=j && 2 * arr[i] <= arr[j]){
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
        }
        System.out.print(n-maxLen);
        sc.close();
    }
}
