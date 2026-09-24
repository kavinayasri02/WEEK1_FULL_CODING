import java.util.*;
public class CaseConvBitManip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if(ch >= 'a' && ch<= 'z'){
            ch = (char)(ch & ~32);
           }else if(ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch | 32);
           }
           res.append(ch);
        }
        System.out.println(res);
}
}