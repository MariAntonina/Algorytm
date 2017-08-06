package Algoritms;

import java.util.Random;

/**
 * Created by admin on 31.07.2017.
 */
public class mRandom extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "MRandom";
    }

    @Override
    public void runAlgoritm(String[] input) {

        Random mRand = new Random(12);
        System.out.printf("%d", mRand.nextInt());

        System.out.println();
        int n = 13;
        int tab[] = new int[n];
        int tab2[] = new int[n];
        int tab3[] = new int[n];

        for (int i = 0; i < tab.length ; i++) {
            tab[i]= i*2;
            System.out.printf("%s ",tab[i]);
        }

        System.out.println();

        for (int i = 0; i < tab2.length; i++) {
            tab2[i]=i*2+1;
            System.out.printf("%s ",tab2[i]);
        }

        System.out.println();

        for (int i = 0; i < tab3.length; i++) {
            tab3[i]= mRand.nextInt();
            System.out.printf("%s ",tab3[i]);
        }

        int k = tab[14];
        System.out.println(k);
    }
}
