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


        char cyfa[] = "1234567890".toCharArray();
        char litera[] = "abcdefghijklmnopqrstuwvxyzABCDEFGHIJKLMNOPQRSTUWVXYZ".toCharArray();
        char samogloska[] = "aoieuyAOIEUY".toCharArray();

        int n = Integer.parseInt(input[1]);
        char zmienna[] = input[2].toCharArray();
        int długosc = zmienna.length;

        StringBuilder doSkrotu = new StringBuilder();
        doSkrotu.append(zmienna);

        if (długosc == n) {
            System.out.println(input[2]);
        } else if (długosc != n) {
            for (int i = zmienna.length - 1; i >= 0; i--) {
                while (długosc != n) {
                    if (!(Character.isLetterOrDigit(zmienna[i]))) {
                        doSkrotu.deleteCharAt(i);
                        zmienna = doSkrotu.toString().toCharArray();
                        długosc = zmienna.length;
                    }
                    if (Character.isDigit(zmienna[i])) {
                        doSkrotu.deleteCharAt(i);
                        zmienna = doSkrotu.toString().toCharArray();
                        długosc = zmienna.length;
                    }
                    break;
                }
            }
//            System.out.println(zmienna.length);

            for (int j = 1; j < zmienna.length; j++) {
                while (zmienna.length != n) {
                    for (int i = 0; i < samogloska.length; i++) {
                        if (zmienna[j] == samogloska[i]) {
                            doSkrotu.deleteCharAt(j);
                            zmienna = doSkrotu.toString().toCharArray();
                            długosc = zmienna.length;
                        }
                    }
                    break;
                }
            }
//            System.out.println(zmienna.length);

            for (int j = zmienna.length - 2; j >= 0; j--) {
                while (długosc != n) {
                    doSkrotu.deleteCharAt(j);
                    zmienna = doSkrotu.toString().toCharArray();
                    długosc = zmienna.length;
                    break;
                }
            }
            System.out.println(zmienna);
        }
    }
}
