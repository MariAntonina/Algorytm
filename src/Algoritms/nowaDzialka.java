package Algoritms;


public class nowaDzialka extends AbstractAlgoritm{
    @Override
    public String getName() {
        return "Kroki kwadratowe";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);

        for (int i = 2; i < n+2; i++) {
           int krok = Integer.parseInt(input[i]);
           int kk = krok*krok;

            System.out.println(kk);
        }
    }
}
