package pl.miloszlewandowski.hackersRank.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            int sum = x /y;
            System.out.println(sum);
        } catch (InputMismatchException e){

            System.out.println("java.util.InputMismatchException");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
