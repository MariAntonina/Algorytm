package Algoritms;

/**
 * Created by admin on 28.07.2017.
 */
public class Warcaby extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Gra w warcaby";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        String color = input[3];

        String tab[][] = new String[n][k];

        int licznik;

        if (color.equals("C")){
             licznik=0;}
        else{licznik=1;}


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (licznik % 2 == 0) {
                    tab[i][j] = "C";
                } else {
                    tab[i][j] = "B";
//                    System.out.printf("%s", tab[i][j]);
                }
                licznik++;
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0; j<k; j++){
                System.out.printf("%s", tab[i][j]);}
        System.out.println();}
    }
}

