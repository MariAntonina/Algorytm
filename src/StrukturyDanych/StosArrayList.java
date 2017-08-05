package StrukturyDanych;

import Algoritms.AbstractAlgoritm;

import java.util.ArrayList;
import java.util.Stack;

public class StosArrayList extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Palindrom na stosie";
    }

    @Override
    public void runAlgoritm(String[] input) {
        Stack<Integer> st = new Stack<>();

        ArrayList<Integer> doStosu = new ArrayList<Integer>();

        for (int i = 1; i < input.length; i++) {
            doStosu.add(Integer.parseInt(input[i]));
        }

        int n = doStosu.size();
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                st.add(doStosu.get(i));
            }
        } else {
            for (int i = 0; i < (n / 2)+1; i++) {
                st.add(doStosu.get(i));
            }
        }

        for (int i = 0; i < n / 2; i++) {
            if (st.pop() == doStosu.get(i)) {
                System.out.print("lista jest palindromem");
                return;
            }
        }
        System.out.println("Brak palindromu");
        }
    }

