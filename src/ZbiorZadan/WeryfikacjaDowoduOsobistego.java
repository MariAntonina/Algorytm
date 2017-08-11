package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

public class WeryfikacjaDowoduOsobistego extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {

        char litery[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int wartosc[] = new int[litery.length];
        int wagi[] = {7, 3, 1, 9, 7, 3, 1, 7, 3};
        int sum = 0;
        char dowodLitery[] = input[1].toCharArray();
        char dowodCyfry[] = input[2].toCharArray();

        for (int i = 0; i < wartosc.length; i++) {
            wartosc[i] = 10 + i;
        }
        System.out.println();

        for (int i = 0; i < 3 ; i++) {
            for (int k = 0; k < wartosc.length; k++) {
                if(dowodLitery[i] == litery[k])
                            sum += wagi[i]*wartosc[k];
                    }
                }

                for (int k = 3; k < wagi.length; k++) {
                        sum += wagi[k]*Integer.parseInt(String.valueOf(dowodCyfry[k-3]));
                }

                if(sum % 10 ==0){
                    System.out.println("Dowód osobisty poprawny");
                    return;
                } System.out.println(" Błąd dowodu");
    }
}

