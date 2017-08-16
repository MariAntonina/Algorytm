package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

import java.util.ArrayList;

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

        for (int i = 0; i < iloscTestow; i++) {
            ileRzeczy = Integer.parseInt(input[it]);
            it++;
            pojemnosc = Integer.parseInt(input[it]);
            it++;
            for (int j = 0; j < wagi.size(); j++) {
                for (int k = wagi.size() - 1; k >= 0; k--) {
                    if (wagi.get(j) == pojemnosc) {
                        counter++;
                        wagi.remove(j);
//                        System.out.println(wagi);
                    }
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

            for (int j = 0; j < wagi.size(); j++) {
                for (int k = 0; k < wagi.size(); k++) {
                    while ((wagi.get(j) + wagi.get(k)) < pojemnosc && j != k) //&& (Math.max( wagi.get(k))>wagi.get(j))) {
                    { counter++;
                        wagi.remove(k);
                        wagi.remove(j);
                        break;
                    }
//                    System.out.println(wagi);
//                    System.out.println(counter);
                }
            }
            for (int j = 0; j < wagi.size(); ) {
                if (wagi.get(j) < pojemnosc) {
                    wagi.remove(j);
                    counter++;
//                    System.out.println(wagi);
//                    System.out.println(counter);
                }
            }
            System.out.println(counter);
        }
    }
}

