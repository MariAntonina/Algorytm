package Struktury;

import Algoritms.AbstractAlgoritm;

import java.util.Stack;

public class Stos extends AbstractAlgoritm {

    @Override
    public String getName() {
        return "Przeliczanie systemow";
    }

    @Override
    public void runAlgoritm(String[] input) {
        Stack<Integer> st = new Stack<>();
        int L = Integer.parseInt(input[1]);
        int p = Integer.parseInt(input[2]);
        while (L > 0) {
            st.push(L % p);
            L = Math.floorDiv(L, p);
        }

        while (!st.empty()) {
            switch (st.pop()) {
                case (10):
                    System.out.print("A");
                case (11):
                    System.out.print("B");
                case (12):
                    System.out.print("C");
                case (13):
                    System.out.print("D");
                case (14):
                    System.out.print("E");
                case (15):
                    System.out.print("F");
                default:
                    System.out.print(st.pop());

            }
        }
    }
}
