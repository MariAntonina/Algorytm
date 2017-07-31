package Algoritms;

/**
 * Created by admin on 31.07.2017.
 */
public class MinMax extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "MinIMax";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int max = 0;
        int min = 0;

        int tab[] = new int[input.length - 1];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
//            System.out.println(tab[i]);
        }

        for (int i = 0; i < input.length; i++) {
            if (tab[i] > tab[max]) {
                max = i;
            }
            if (tab[i] < tab[min]) {
                min = i;
            }
        }
            System.out.println( max + " "+ tab[max]);
            System.out.println( min + " " + tab[min]);
        }
}
