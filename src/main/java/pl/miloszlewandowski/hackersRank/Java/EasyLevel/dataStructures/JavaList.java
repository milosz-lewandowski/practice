package pl.miloszlewandowski.hackersRank.Java.EasyLevel.dataStructures;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listLenght = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < listLenght; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }
        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            String operation = scanner.next();
            if (operation.equals("Insert")){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            }
            else {
                int index = scanner.nextInt();
                list.remove(index);

            }
        }
        scanner.close();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
