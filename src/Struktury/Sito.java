package Struktury;

public class Sito {
    boolean[] tab;

    public Sito(){
        tab = new boolean[100];
    }
    public Sito(int n) {
        tab = new boolean[n];
        }

    public void generujSito() {
        for (int i = 0; i < tab.length; i++)
            tab[i] = true;
        for (int i = 2; i < tab.length; i++)
            if (tab[i]) {
                int j = i + i;
                while (j < tab.length) {
                    tab[j] = false;
                    j = j + i;
                }
            }
    }





    public void drukuj(){
        for (int i = 1; i <tab.length ; i++) {
            if(tab[i])
                System.out.printf("%s " ,i);
        }
    }
}
