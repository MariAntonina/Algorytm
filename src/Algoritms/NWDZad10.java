package Algoritms;

/**
 * Created by admin on 08.08.2017.
 */
public class NWDZad10 extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "NWD to:";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int x = Integer.parseInt(input[1]);
        int y = Integer.parseInt(input[2]);
        System.out.println(nwd(x, y));
    }

    private int nwd(int x, int y) {
        if (x == y) {
            return x;
        } else {
            if (x < y) {
                y = y - x;
            } else {
                x = x - y;
            }
        }
        return nwd(x,y);
    }
}

