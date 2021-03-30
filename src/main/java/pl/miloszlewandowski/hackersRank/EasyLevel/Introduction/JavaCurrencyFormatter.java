package pl.miloszlewandowski.hackersRank.EasyLevel.Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indianf  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinanf  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat francenf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = usnf.format(payment);
        String india = indianf.format(payment);
        String china = chinanf.format(payment);
        String france = francenf.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
