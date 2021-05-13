package pl.miloszlewandowski.hackersRank.Java.MediumLevel;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  I have spent like 2 hours trying to figure this out and I gave up,
 *  This solution is taken from hackerrank exercise discussion
 */

public class TagContentExtractor {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        while (testCases-- > 0) {
            String line = scan.nextLine();

            boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));

                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
    }
}