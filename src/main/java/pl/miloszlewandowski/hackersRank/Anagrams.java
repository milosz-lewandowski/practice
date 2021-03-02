package pl.miloszlewandowski.hackersRank;

import java.util.Scanner;

public class Anagrams {


    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int acount = 0;
        int bcount = 0;
        for (char ch= 'a'; ch <= 'z';ch++){
            for (int j=0;j <b.length(); j++){
                if (a.charAt(j) == ch) acount++;
                if (b.charAt(j) == ch) bcount++;
            }
            if (acount != bcount ) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
