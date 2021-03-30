package pl.miloszlewandowski.hackersRank.EasyLevel.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubstringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String substring;
        for (int i=0; i<s.length()-k+1; i++){
            substring = s.substring(i, i+k);
            if (smallest.equals("") && largest.equals("")){
                smallest = substring;
                largest = substring;
            }else if (smallest.compareTo(substring) > 0){
                smallest = substring;
            }else if (largest.compareTo(substring) < 0){
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
