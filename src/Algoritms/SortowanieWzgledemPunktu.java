package Algoritms;


public class SortowanieWzgledemPunktu extends AbstractAlgoritm {


    @Override
    public String getName() {
        return "Sortowanie wzgledem punktu";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int tab[][] = new int[n][3];

        int iterator = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] =
                        Integer.parseInt(input[iterator]);
                iterator++;
            }
        }

        int tablicaWynikow[][] = new int[n][2];
        for (int k = 0; k < n; k++) {
            tablicaWynikow[k][0] = tab[k][0];
            double x = Math.sqrt(Math.pow((double) tab[k][1], 2d));
            double y = Math.sqrt(Math.pow((double) tab[k][2], 2d));
            double sqrt = Math.sqrt(x + y);
            int radian = (int) Math.round(sqrt);
            tablicaWynikow[k][1] = radian;
        }

        int temp1;
        int temp2;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (tablicaWynikow[i][1] > tablicaWynikow[i + 1][1]) {
                    temp1 = tablicaWynikow[i][1];
                    tablicaWynikow[i][1] = tablicaWynikow[i + 1][1];
                    tablicaWynikow[i + 1][1] = temp1;
                    temp2 = tablicaWynikow[i][0];
                    tablicaWynikow[i][0] = tablicaWynikow[i + 1][0];
                    tablicaWynikow[i + 1][0] = temp2;
                }
            }
        }
        for (int i = 0; i < n; i++) {

            int punkt = tablicaWynikow[i][0];
            for (int j = 0; j < n; j++) {
                if (punkt == tab[j][0])
                    System.out.printf("Punkt: %d; X: %d; Y: %d\n",
                            punkt, tab[j][1], tab[j][2]);
            }
        }
    }
}


