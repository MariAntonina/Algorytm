package ZbiorZadan;

import Algoritms.AbstractAlgoritm;
/**
 * Created by admin on 13.08.2017.
 */
public class bajtockieSwieto extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Bajtockie święto trojkata";
    }

    @Override

    public void runAlgoritm(String[] input) {

        int iterator = Integer.parseInt(input[1]);
        int it = 2;
        double p = 0;// p =(a+b+c)/2;
        double poleHerona = 0;
        double sumaKompletna = 0;
        int zapotrzebowanieNaKrede = 0;

        for (int i = 0; i < iterator; i++) {

            double zuzycie = 0;
            sumaKompletna = 0.0;
            int uczesticy = Integer.parseInt(input[it]);
            it++;
            double kreda = Double.parseDouble(input[it]); // średnie użycie kredy
            it++;


            for (int j = 0; j < uczesticy; j++) {
                double sumaBokow = 0;
                double a = Double.parseDouble(input[it]) / 100;
                it++;
                double b = Double.parseDouble(input[it]) / 100;
                it++;
                double c = Double.parseDouble(input[it]) / 100;
                it++;

                if (b < a + c || c < a + b || a < b + c) {
                    p = (a + b + c) / 2;
                } else {
                    System.out.println("Nie mozna skonstruowac trójkąta");
                }

                poleHerona = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                zuzycie = poleHerona * kreda;
                sumaKompletna = sumaKompletna + zuzycie;
            }
            zapotrzebowanieNaKrede = (int)(sumaKompletna * 1000);
            System.out.println(zapotrzebowanieNaKrede);
        }
    }
}

