//BruteForce Using For Loop

import java.util.*;
public class CountVowelsConso{
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        String k1 = k.toLowerCase();
        int vowelCount = 0;
        int ConsoCount = 0;
        for(int i =0;i<k1.length();i++){
            char ch = k1.charAt(i);
            if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }else if(ch>='a' && ch<='z'){
                ConsoCount++;
            }
        }
        System.out.println("Count of Vowels are : " + vowelCount);
        System.out.println("Count of Consonants are : " + ConsoCount);
    }
}