package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

import java.util.ArrayList;

/**
 * Created by admin on 09.08.2017.
 */
public class DzienTygodnia extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "To bedzie super ";
    }

    @Override
    public void runAlgoritm(String[] input) {
    String dzien = input[1];
    int n = Integer.parseInt(input[2]);
    String dni[] = {"Pn", "Wt", "Sr", "Czw", "Pt", "Sb", "Nd"};
    int nrDnia =0;
    String bedzie = null;
        for (int i = 0; i < dni.length; i++) {
            if(dni[i].equals(dzien)){
                i = i+n;
                nrDnia = (i)%dni.length;
                bedzie = dni[nrDnia];
            }
        }
        System.out.printf("%s", bedzie );
    }
}
