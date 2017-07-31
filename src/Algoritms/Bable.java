package Algoritms;

public class Bable extends AbstractAlgoritm {


    @Override
    public String getName() {
        return "Metoda babelkowa";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int tab[] = new int[input.length-1];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i+1]);
        }
//        return tab[];

        int temp;
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length - 1; i++){
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i + 1] = temp;
                }
            }
        }
        for (int i=0; i<tab.length; i++)
            System.out.println(tab[i]);

    }
}




