package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 13.08.2017.
 */
public class tagiHTMLowe extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Duzy HTML";
    }

    @Override
    public void runAlgoritm(String[] input) {

        char[] word = new char[0];
        for (int i = 1; i < input.length; i++) {
            word = input[i].toCharArray();

            for (int j = 0; j < word.length; j++) {
                System.out.println();
                if (word[j] == '<') {
                    while (word[j] != '>') {
                        System.out.print(Character.toString(word[j]).toUpperCase());
                        j++;
                    }
                    System.out.print("> ");
                } else {
                    System.out.printf("%s", Character.toString(word[j]));
                    if (j == word.length - 1) {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}




