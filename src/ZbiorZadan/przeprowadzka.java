package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by admin on 14.08.2017.
 */
public class przeprowadzka extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Potrzeba tyle pudelek";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int iloscTestow = Integer.parseInt(input[1]);
        int ileRzeczy = 0;// ilość eksponatów
        int pojemnosc = 0;//pojemność pudełka
        int counter = 0;
        int it = 2;

        ArrayList<Integer> wagi = new ArrayList<Integer>();
        for (int i = 4; i < input.length; i++) {
            wagi.add(Integer.parseInt(input[i]));
        }
        System.out.println(wagi);

        Collections.sort(wagi);

        for (int i = 0; i < iloscTestow; i++) {
            ileRzeczy = Integer.parseInt(input[it]);
            it++;
            pojemnosc = Integer.parseInt(input[it]);
            it++;
            for (int j = 0; j < wagi.size(); j++) {
                if (wagi.get(j) == pojemnosc) {
                    counter++;
                    wagi.remove(j);
//                        System.out.println(wagi);
                }
            }
            for (int j = 0; j < wagi.size(); j++) {
                for (int k = 0; k < wagi.size(); k++) {
                    if ((wagi.get(j) + wagi.get(k)) == pojemnosc && j != k) {
                        counter++;
                        wagi.remove(k);
                        wagi.remove(j);
                    }
                }
            }
//                    System.out.println(wagi);
//                    System.out.println(counter);

        for (int t = 0; t < wagi.size(); t++) {
            for (int m = 0; m < wagi.size(); m++) {
                int max = 0;
                if((wagi.get(t) + wagi.get(m)) < pojemnosc && t != m) {
                    if (wagi.get(m) > max) {
                        max = m;
                        wagi.remove(m);
                        wagi.remove(t);}
                }
                    counter++;
                }
//                System.out.println(wagi);
//                System.out.println(counter);
                    }
                }


                for (int s = 0; s < wagi.size(); ) {
                    if (wagi.get(s) < pojemnosc) {
                        wagi.remove(s);
                        counter++;
//                    System.out.println(wagi);
//                    System.out.println(counter);
                    }
                }
                System.out.println(counter);

            }
        }