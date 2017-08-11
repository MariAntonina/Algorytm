package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 08.08.2017.
 */
public class Przedszkolanka extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Tyle cukierkow";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int gr1 = Integer.parseInt(input[1]);
        int gr2 = Integer.parseInt(input[2]);
        int iloczynGrup = gr1*gr2;

        while (gr2 != 0){
            int n = gr2;
            gr2 = gr1%gr2;
            gr1 = n;}
            iloczynGrup = iloczynGrup/gr1;
        System.out.println(iloczynGrup);
        }


    }
