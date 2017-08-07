package Struktury;

import Algoritms.AbstractAlgoritm;

import java.util.Stack;

/**
 * Created by admin on 03.08.2017.
 */
public class ONP extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Odwrotna notacja";
    }

    @Override
    public void runAlgoritm(String[] input) {
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <input.length ; i++) {
            int v1=0;
            int v2=0;
            switch (input[i]){
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

