package Struktury;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 03.08.2017.
 */
public class TestowanieKopca extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Testowanie kopca";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length -1;
        Kopiec kopiec = new Kopiec(n);

        for (int i = 1; i < input.length ; i++) {
            int newElement = Integer.parseInt(input[i]);
            kopiec.InsertElement(newElement);
        }

        kopiec.printAllElements();
        kopiec.sort();
        kopiec.toDelete();
        System.out.println();
        kopiec.printAllElements();
    }
}
