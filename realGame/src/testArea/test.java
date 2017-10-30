package testArea;

import java.util.BitSet;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        BitSet[] bitset = new BitSet[3];

        bitset[1] = b1;
        bitset[2] = b2;

        while (m-- > 0) {
            String op = in.next();
            int b = in.nextInt();
            int c = in.nextInt();

            switch (op) {
                case "AND":
                    bitset[b].and(bitset[c]);
                    break;
                case "OR":
                    bitset[b].or(bitset[c]);
                    break;
                case "XOR":
                    bitset[b].xor(bitset[c]);
                    break;
                case "FLIP":
                    bitset[b].flip(c);
                    break;
                case "SET":
                    bitset[b].set(c);
                    break;
            }

            System.out.println(b1.cardinality() +  " " + b2.cardinality());



        }


    }
}