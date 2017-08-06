package Algoritms;

/**
 * Created by admin on 06.08.2017.
 */
public class WeryfikacjaPeselu extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Poprawny PESEL";
    }

    @Override
    public void runAlgoritm(String[] input) {
        char pesel[] = input[1].toCharArray();

        int tab[] = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        System.out.println();
        int sum = 0;
        for (int i = 0; i < pesel.length; i++) {
            sum += tab[i] * Integer.parseInt(String.valueOf(pesel[i]));
        }

        char s[] = String.valueOf(sum).toCharArray();

        if (s[s.length - 1]=='0') {
            System.out.println("Pesel prawidłowy");
        }else {
            System.out.println("Zły pesel");
        }
    }
}


