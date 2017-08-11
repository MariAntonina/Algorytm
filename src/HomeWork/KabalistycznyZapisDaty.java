package HomeWork;

import Algoritms.AbstractAlgoritm;

import static java.lang.Character.getNumericValue;

public class KabalistycznyZapisDaty extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Kabala";
    }

    @Override
    public void runAlgoritm(String[] input) {

        char litery[] = "abcdefghiklmnopqrstvxyz".toCharArray();
        int liczby[] = new int[litery.length];
        int d = 10;
        int s = 100;
        char slowo[] = input[1].toCharArray();
        int sum = 0;


        System.out.print(litery);
        System.out.println();

        for (int i = 0; i < litery.length; i++) {
            if (litery[i] < 'k') {
                liczby[i] = i + 1;
            } else if (litery[i] < 't') {
                liczby[i] = d;
                d += 10;
            } else {
                liczby[i] += s;
                s += 100;
            }
            System.out.printf("%s ", liczby[i]);
        }

        for (int i = 0; i < slowo.length; i++) {
            char litera;
            litera = slowo[i];
            for (int j = 0; j < litery.length; j++) {
                if (litery[j] == litera) {
                    sum += liczby[j];
                }
            }
        }
        System.out.println();
        System.out.printf("%s ",sum);
    }
}



