package HomeWork;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 14.08.2017.
 */
public class snieg extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Slady się pokryją razy:";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int c = Integer.parseInt(input[3]);
        int dystans = Integer.parseInt(input[4])*100;// metry na centymetry

        System.out.println(dystans/nww3(nww(a, b), c));
    }

    
    private int nwd(int a, int b) {
        if (a == 0)
            return b;
        return nwd(b % a, a);
    }

    private int nww(int a, int b) {
        if (a == b) {
            return a;
        } else {
            return (a * b) / nwd(a, b);
        }
    }

    private int nwd3(int nwd, int c) {
        if (nwd == 0) {
            return c;
        } else {
            return nwd3(c % nwd, nwd);
        }
    }

    private int nww3(int nww, int c) {
        if (nww == c) {
            return nww;
        } else {
            return (nww * c)/nwd3(nww,c);
        }
    }
}
