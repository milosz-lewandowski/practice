package pl.miloszlewandowski.hackersRank.Java.EasyLevel.Strings;

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s, ",'?._@");
        System.out.println(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
        scan.close();
    }
}
