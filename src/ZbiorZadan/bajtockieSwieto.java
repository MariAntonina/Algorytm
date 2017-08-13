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
        double pole = 0;
        double p = 0;
        double poleHerona = 0;
        double zuzycie = 0;

        for (int i = 0; i < iterator; i++) {
            int uczesticy = Integer.parseInt(input[it]);
            it++;
            double kreda = Double.parseDouble(input[it]); // średnie użycie kredy
            it++;
            double tab[] = new double[3];
            int max = 0;

            for (int j = 0; j < uczesticy; j++) {
                double sum = 0;
                for (int k = 0; k < 3; k++) {
                    tab[k] = Double.parseDouble(input[it])/100;// boki w metrach
                    it++;
                }
                if (tab[0] != tab[1] || tab[0] != tab[2] || tab[1] != tab[2]) {
                    boolean a = false;
                    for (int k = tab.length - 1; k >= 0; k--) {
                        if (tab[k] >= tab[max]) {
                            max = k;
//                            System.out.println(max);
                        }
                        for (int s = 0; s < tab.length; s++) {
                            for (int l = 0; l < tab.length; l++) {
                                if (tab[s] != tab[max] && tab[j] != tab[s] && tab[j] != tab[max]) {
                                    a = tab[max] < tab[s] + tab[j];
                                }
                            }
                        }
                    }
                    if (a == true) {
                        for (int o = 0; o < tab.length; o++) {
                            sum += tab[o];
                        }
                    }
                } else {
                    for (int k = 0; k < tab.length; k++) {
                        sum += tab[k];
                    }
                }
                p = sum / 2;
                poleHerona = Math.sqrt(p * (p - tab[0]) * (p - tab[1]) * (p - tab[2]));
                zuzycie = poleHerona*kreda;
            }
//            System.out.println(poleHerona);
            zuzycie +=zuzycie;
            zuzycie = zuzycie/uczesticy;
            System.out.println(zuzycie);
        }
    }
}
