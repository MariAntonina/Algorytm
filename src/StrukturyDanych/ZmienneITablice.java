package StrukturyDanych;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 04.08.2017.
 */
public class ZmienneITablice extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "duplikat";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 1;
        int tab[] = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
//            System.out.print(tab[i]);
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < i; j++) {
                if (tab[j] == tab[i]) {
                    System.out.print("Duplikat to: " + tab[j]
                            + " i występuje na miejscu " + j + " i " + i);
                    return;
                }
            }
        }
        System.out.print("Brak duplikatów");
    }
}
