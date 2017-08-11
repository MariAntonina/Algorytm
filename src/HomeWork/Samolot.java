package HomeWork;

import Algoritms.AbstractAlgoritm;

public class Samolot extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Ilość miejsc:";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n1 = Integer.parseInt(input[1]);
        int k1 = Integer.parseInt(input[2]);
        int n2 = Integer.parseInt(input[3]);
        int k2 = Integer.parseInt(input[4]);

            System.out.println(n1*k1+ n2*k2);

    }
}
