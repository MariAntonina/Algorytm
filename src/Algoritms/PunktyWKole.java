package Algoritms;

/**
 * Created by admin on 08.08.2017.
 */
public class PunktyWKole extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Ilosc punktow to:";
    }

    @Override
    public void runAlgoritm(String[] input) {
        double r = Double.parseDouble(input[1]);
        double rad = r*r;
        int x = 0, y = 0;
        int counter = 1;
        for (x = 0; x <= r; x++) {
            for (y = 0; y <= r; y++) {
                if (((int) Math.sqrt(rad - y *y)) == x) {
                    counter++;
                }
                if ((int) Math.sqrt(rad- x *x)==y){
                    counter++;
                }
            }
        }
            System.out.println(counter);
    }
}
