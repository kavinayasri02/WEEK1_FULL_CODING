//Using the For loop

import java.util.*;
public class RemoveDupChars {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        char[] s = k.toCharArray();
        System.out.println("Duplicate characters are : ");
        for(int i =0 ;i<s.length;i++){
           int count = 1;
           if(s[i] == '0' || s[i] == ' '){
            continue;
           }
           for(int j =i+1;j<s.length;j++){
            if(s[i] == s[j]){
                count++;
                s[j] = '0';
            }
           }
           if(count > 1){
            System.out.println(s[i] + " appears " + count + " times");
           }
        }
      
    }
}

//Using LinkedHashSet and StringBuilder

import java.util.*;
public class RemoveDupchars {
    public static String removeDup(String s){
        if( s == null || s.isEmpty()){
            return s;
        }
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(set.add(ch)){
                sb.append(ch);
            }
        }return sb.toString();
    }public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        System.out.println(removeDup(k));
    }
}
