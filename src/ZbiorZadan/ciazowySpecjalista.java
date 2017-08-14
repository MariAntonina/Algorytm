package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 14.08.2017.
 */
public class ciazowySpecjalista extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Ciaza trwa:";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int iterator = Integer.parseInt(input[1]);
        int it = 2;
        double x = 0; // obecna roznica wieku miedzy dzieckiem a matka
        double y = 0; // za y lat
        double z = 0; // za y lat z matka z razy starsza
        double obliczenia = 0;
        int ciaza = 0;

        for (int i = 0; i < iterator ; i++) {
            x = Integer.parseInt(input[it]);
            it++;
            y = Integer.parseInt(input[it]);
            it++;
            z = Integer.parseInt(input[it]);
            it++;
            obliczenia = ((x + (y*(1 - z))) /(z - 1));
            obliczenia = Math.abs(obliczenia)*12;
            ciaza = (int) obliczenia;
            System.out.println(ciaza);
        }
    }
}
