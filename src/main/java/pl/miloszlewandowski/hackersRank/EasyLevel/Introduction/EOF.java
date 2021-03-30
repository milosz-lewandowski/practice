package pl.miloszlewandowski.hackersRank.EasyLevel.Introduction;

import java.util.Scanner;

public class EOF {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int lineNumber = 0;
            String line;
            while(scanner.hasNextLine()){
                lineNumber++;
                System.out.println(lineNumber + " " + scanner.nextLine());
            }
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        }
    }