package HomeWork;

import Algoritms.AbstractAlgoritm;

import java.util.ArrayList;

/**
 * Created by admin on 11.08.2017.
 */
public class SkracanieIdentyfikatorow extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Skrocona zmienna";
    }

    @Override
    public void runAlgoritm(String[] input) {

        ArrayList<Character> numbers = new ArrayList<>();
        char cyfa[] = "1234567890".toCharArray();
        for (int i = 0; i < cyfa.length; i++) {
            numbers.add(cyfa[i]);
            System.out.println(numbers);
        }

        ArrayList<Character> letters = new ArrayList<>();
        char litera[] = "abcdefghijklmnopqrstuwvxyzABCDEFGHIJKLMNOPQRSTUWVXYZ".toCharArray();
        for (int i = 0; i < litera.length; i++) {
            letters.add(litera[i]);
        }

        ArrayList<Character> samoglos = new ArrayList<>();
        char samogloska[] = "aoieuy".toCharArray();
        for (int i = 0; i < samogloska.length; i++) {
            samoglos.add(samogloska[i]);
        }

        int n = Integer.parseInt(input[1]);
        char zmienna[] = input[2].toCharArray();

        ArrayList<String> doSkrotu = new ArrayList<>();

        for (int i = 0; i < zmienna.length; i++) {
            doSkrotu.add(String.valueOf(i));
        }
        if (doSkrotu.size() == n) {
            System.out.println(input[2]);
        } else if (doSkrotu.size() != n) {
            for (int i = doSkrotu.size() - 1; i >= 0; i--) {
                while (doSkrotu.size() != n) {
                    for (int j = 0; j < letters.size(); j++) {
                        for (int k = 0; k < numbers.size(); k++) {
                            if (!(doSkrotu.contains(letters.get(j))) && !(doSkrotu.contains(numbers.get(k)))) {
                                doSkrotu.remove(i);
                            }
                        }
                        break;
                    }
                    System.out.println(doSkrotu);
                }
                for (int s = doSkrotu.size() - 1; s >= 0; s--) {
                    while (doSkrotu.size() != n) {
                        for (int k = 0; k < numbers.size(); k++) {
                            if (doSkrotu.contains(numbers.get(k))) {
                                doSkrotu.remove(s);
                            }
                        }
                        break;
                    }
                    System.out.println(doSkrotu);
                }
                for (int j = 1; j < doSkrotu.size(); j++) {
                    while (doSkrotu.size() != n) {
                        for (int k = 0; k < samoglos.size(); k++) {
                            if (doSkrotu.contains(samoglos.get(k))) {
                                doSkrotu.remove(j);
                            }
                            break;
                        }
                        System.out.println(doSkrotu);
                    }

                    for (int t = doSkrotu.size() - 2; t >= 0; t--) {
                        while (doSkrotu.size() != n) {
                            doSkrotu.remove(t);
                        }
                        break;
                    }
                    System.out.println(doSkrotu);
                }
            }
        }

    }
}

