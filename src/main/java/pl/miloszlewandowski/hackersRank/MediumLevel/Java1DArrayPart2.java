package pl.miloszlewandowski.hackersRank.MediumLevel;

import java.util.Scanner;

public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game) {
        if (leap > game.length) return false;
        int way = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i] == 1) way = 0;
            if (game[i] + leap < way) return true;
            way++;
            if (way == game.length) return false;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ilosc gier
        int q = scan.nextInt();

        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            //q--
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

