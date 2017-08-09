package Algoritms;

import java.security.AlgorithmParameterGenerator;

public class Obzartuchy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Cisteczkowe zawody";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int iterator = Integer.parseInt(input[1]);//ilosc tabel
        int it = 2;
        int dobaSek = 86400; // doba w sekundach
        int sec = 0; // czas jedzenia 1 ciastka

        for (int i = 0; i < iterator; i++)//ilosc testow
        {
            int iloscuczestnikow = Integer.parseInt(input[it]);
            it++;
            int iloscciastekwpudelku = Integer.parseInt(input[it]);
            it++;
            int tab[] = new int[iloscuczestnikow];

            for (int j = 0; j < iloscuczestnikow; j++) {
                tab[j] = Integer.parseInt(input[it]);
                it++;
            }

            double iloscDobowaCiastek = 0;
            double pudelko = 0;
            for (int k = 0; k < tab.length; k++) {
                sec = tab[k];
                iloscDobowaCiastek += (dobaSek / sec);
                pudelko = iloscDobowaCiastek / iloscciastekwpudelku;
            }

            if (pudelko != (int) pudelko) {
                pudelko = (int) pudelko + 1;
                System.out.println(pudelko);
            } else {
                System.out.println(pudelko);
            }
        }
    }
}



