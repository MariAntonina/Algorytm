package Algoritms;

/**
 * Created by admin on 31.07.2017.
 */
public class Lider extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Typujemy lidera";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int tab[] = new int[input.length - 1];
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) ;
            {
                max = tab[i];
            }

        }
        System.out.println(max);
    }
}
