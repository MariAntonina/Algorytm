package StrukturyDanych;

import Algoritms.AbstractAlgoritm;

import java.util.Stack;


public class ZadniePiąte extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Stos ONP";
    }

    @Override
    public void runAlgoritm(String[] input) {

        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <input.length ; i++) {
            int v1=0;
            int v2=0;
            switch (input[i]){
                case "(":

                    break;
                case ")":

                case "M":


                    break;
                case "D":

                    break;
                case "O":
                   ;
                    break;
                case "I":

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

