package pl.miloszlewandowski.hackersRank.Java.EasyLevel.dataStructures;

import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scanner.nextInt();
        }
        int result = 0;
        for (int sumowanychElementow = n; sumowanychElementow > 0; sumowanychElementow--) { // ile razy odpala sumator

            for (int indexStart = 0; indexStart <= n - sumowanychElementow; indexStart++) {

                int iterationSum= 0;
                for (int indexElementu = indexStart; indexElementu < indexStart + sumowanychElementow; indexElementu++)        iterationSum += tab[indexElementu]; //ile elementów do siebie dodaje

                if (iterationSum < 0)   result++; // jesli suma mniejsza od 0 zostaje dodana do wyniku

            }






        }
        System.out.println(result);

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
