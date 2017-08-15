package HomeWork;

import Algoritms.AbstractAlgoritm;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by admin on 12.08.2017.
 */
public class Flamaster extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "W skrocie";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
//        ArrayList<String> litery = new ArrayList<String>();
        HashMap<String, Integer> leters = new HashMap<>();
        for (int i = 2; i < input.length ; i++) {
            char a[] = new char[input[i].length()];
            a = input[i].toCharArray();
            for (int j = 0; j < a.length ; j++) {
//                System.out.println();
//                for (int k = a.length-1; k>=0; k--) {
//                    if(a[j]!=a[k]){
//                    }
//                    litery.add(String.valueOf(a[j]));
//
//                }
//                System.out.println(litery);

            }
        }
    }
}
