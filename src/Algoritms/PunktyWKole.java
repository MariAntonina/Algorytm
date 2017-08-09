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
        double a = -r;
        double rad = r * r;
        int counter = 1;
        for (int x = (int) a; x <= (int) r; x++) {
            for (int y = (int) a; y <= (int) r; y++) {
                if (((int) Math.sqrt(rad - (int) y * (int) y)) == x) {
                    counter++;
//                    boolean b = (int) Math.sqrt(((int) y * (int) y) + (int) x * (int) x) <= (int) r;
//                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
