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

        ArrayList<String> doStosu = new ArrayList<String>();
        for (int i = 1; i <input.length  ; i++) {
            doStosu.add(input[i]);
        }
        for (int i = 1; i <doStosu.size() ; i++) {
            int v1=0;
            int v2=0;
            switch (doStosu.get(i)){
                case "M":
                    v1 = st.pop();
                    v2 = st.pop();
                    st.push(v1 * v2);
                    break;
                case "D":
                    v1 = st.pop();
                    v2 = st.pop();
                    st.push(v1 + v2);
                    break;
                case "O":
                    v1 = st.pop();
                    v2 = st.pop();
                    st.push(v1 - v2);
                    break;
                case "I":
                    v1 = st.pop();
                    v2 = st.pop();
                    st.push(v1 / v2);
                    break;
                case "R":
                    System.out.print(st.pop());
                    break;
                default:
                    st.push(Integer.parseInt(input[i]));
            }
        }
    }
}

