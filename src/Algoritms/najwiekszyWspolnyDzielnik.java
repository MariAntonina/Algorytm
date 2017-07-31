package Algoritms;

public class najwiekszyWspolnyDzielnik extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "NWD to";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        System.out.println(nwd(k, n));
    }

    private int nwd(int k, int n) {
        if (k == 0)
            return n;
        return nwd(n%k, k);
    }
}
