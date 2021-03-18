package pl.miloszlewandowski.hackersRank;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitsetsSize = scanner.nextInt();
        int operationsQuantity = scanner.nextInt();
        BitSet b1 = new BitSet(bitsetsSize);
        BitSet b2 = new BitSet(bitsetsSize);
        for (int i = 0; i < operationsQuantity; i++) {
            String operation = scanner.next();

            switch (operation) {
                case "AND": {
                    int firstBitset = scanner.nextInt();
                    int secondBitset = scanner.nextInt();
                    if (firstBitset == 1) {
                        b1.and(b2);
                    } else if (firstBitset == 2) {
                        b2.and(b1);
                    }
                    break;
                }
                case "OR": {
                    int firstBitset = scanner.nextInt();
                    int secondBitset = scanner.nextInt();
                    if (firstBitset == 1) {
                        b1.or(b2);
                    } else if (firstBitset == 2) {
                        b2.or(b1);
                    }
                    break;
                }
                case "XOR": {
                    int firstBitset = scanner.nextInt();
                    int secondBitset = scanner.nextInt();
                    if (firstBitset == 1) {
                        b1.xor(b2);
                    } else if (firstBitset == 2) {
                        b2.xor(b1);
                    }
                    break;
                }
                case "SET": {
                    int currentBitset = scanner.nextInt();
                    int bit = scanner.nextInt();
                    if (currentBitset == 1) {
                        b1.set(bit);
                    } else if (currentBitset == 2) {
                        b2.set(bit);
                    }
                    break;
                }
                case "FLIP": {
                    int currentBitset = scanner.nextInt();
                    int bit = scanner.nextInt();
                    if (currentBitset == 1) {
                        b1.flip(bit);
                    } else if (currentBitset == 2) {
                        b2.flip(bit);
                    }
                    break;
                }
            }
            System.out.println(b1.cardinality()+" "+ b2.cardinality());
        }
    }
}

