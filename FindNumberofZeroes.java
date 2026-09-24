import java.util.*;
public class FindNumberofZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int l = 0,r=n-1,fz = n;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == 0){
                fz = mid;
                r = mid -1;
            }else{
                l = mid+1;
            }
        }
        System.out.println(n - fz);
    }
}
