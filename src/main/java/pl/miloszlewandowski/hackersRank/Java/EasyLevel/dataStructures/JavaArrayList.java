package pl.miloszlewandowski.hackersRank.Java.EasyLevel.dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList2D = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
//            System.out.println("");
            int recordsForEachLine = scanner.nextInt();
            arrayList2D.add(new ArrayList<Integer>());
//            System.out.println("line: " + i + ": ");
            for (int j = 0; j < recordsForEachLine; j++) {
                int actualInt = scanner.nextInt();
                arrayList2D.get(i).add(actualInt);
//                System.out.printf(" "+ actualInt);

            }
//            System.out.println(arrayList2D.get(i));

        }
        int numberOfQueries = scanner.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            int lineNumber = scanner.nextInt();
            int integerIndex = scanner.nextInt();
            try {
//                System.out.println("query "+i+": ");
                System.out.println(arrayList2D.get(lineNumber-1).get(integerIndex-1));
            } catch (Exception e){
//                e.printStackTrace();
                System.out.println("ERROR!");
            }
        }


    }
}
