package HomeWork;

import Algoritms.AbstractAlgoritm;

public class PunktyWKole extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Ilosc punktow to:";
    }

    @Override
    public void runAlgoritm(String[] input) {
        double r = Double.parseDouble(input[1]);
        int counter = 0;
        for (int x = (int) -r; x <=  r; x++) {
            for (int y = (int) -r; y <=  r; y++) {
                if(Math.sqrt(x*x + y*y)<= r)
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
