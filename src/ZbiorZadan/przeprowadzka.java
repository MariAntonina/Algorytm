package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

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

        for (int i = 0; i < iloscTestow; i++) {
            ileRzeczy = Integer.parseInt(input[it]);
            it++;
            pojemnosc = Integer.parseInt(input[it]);
            it++;
            int wagi[] = new int[ileRzeczy];
            for (int j = 0; j < ileRzeczy; j++) {
                wagi[j] = Integer.parseInt(input[it]);
                it++;
                System.out.print(wagi[j] + " ");
            }
            for (int j = 0; j < wagi.length; j++) {
                for (int k = wagi.length - 1; k >= 0; k--) {
                    if ((wagi[j] + wagi[k]) == 20 && j != k) {
                        System.out.print(wagi[j] + " ");
                        System.out.print(wagi[k]);
                        System.out.println();
                    }
                    if ((wagi[j] + wagi[k]) < 20 && j != k) {
                        System.out.print(wagi[j] + " ");
                        System.out.print(wagi[k]);
                        System.out.println();
                    }
                }
            }
        }
    }
}
