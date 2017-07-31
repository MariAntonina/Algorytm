package Algoritms;

import java.security.AlgorithmParameterGenerator;

public class Obzartuchy extends AbstractAlgoritm{
    @Override
    public String getName() {
        return "Cisteczkowe zawody";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int dS = 60*60*24;// doba w sekundach

//        for (int i = 3; i < 3 + n; i++) {
//            float (input[i])/dS;
//
//        }


    }
}
