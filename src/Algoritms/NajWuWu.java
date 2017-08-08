package Algoritms;

/**
 * Created by admin on 08.08.2017.
 */
public class NajWuWu extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "NWW to";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        System.out.println("Dla liczby:" + a  + " i " + b + " wynosi: " + nww(a, b));
    }

    private int nwd(int a, int b) {
        if (a == 0)
            return b;
        return nwd(b % a, a);
    }

    private int nww(int a, int b) {
        if (a == b){
            return a;
        } else {
            return (a * b)/nwd(a, b);
        }
    }
}