package pl.miloszlewandowski.hackersRank.EasyLevel.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int certanity = 100;
    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(n);
        boolean result = bigInteger.isProbablePrime(certanity);
        System.out.println(result?"prime":"not prime");
        scanner.close();
    }

}
