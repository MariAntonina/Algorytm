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
        int dobaSek = 86400; // doba w sekundach
        int sec = 0; // czas jedzenia 1 ciastka
        double iloscDobowaCiastek = 0;
        double pudelko = 0; // ilość pudełek

        for (int i = 0; i < iterator; i++) {
            for (int j = 2; j < input.length; j = j + 2 + Integer.parseInt(input[j])) {
                int tab[] = new int[Integer.parseInt(input[j]) + 1];
                for (int k = 0; k < tab.length; k++) {
                    tab[k] = Integer.parseInt(input[j + 1]);
                    j++;
                }
                for (int k = 1; k < tab.length; k++) {
                    int ciastka = tab[0]; //liczba cistek w pudełku
                    sec = tab[k];
                    iloscDobowaCiastek += (dobaSek / sec);
                    pudelko = iloscDobowaCiastek / ciastka;
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
}



