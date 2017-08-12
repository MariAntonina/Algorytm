package HomeWork;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 12.08.2017.
 */
public class PalindromyWLiczbach extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int iterator = Integer.parseInt(input[1]);
        int sum = 0;
        char[] a;

        for (int j = 2; j < iterator + 2; j++) {
            int counter = 0;
            a = new char[input[j].length()];
            a = input[j].toCharArray();

            for (int i = 0; i < a.length; i++) {
                if (a[i] == a[a.length - i - 1]) {
                    System.out.println(input[j] + " " + counter);
                } else if (a[i] != a[a.length - i - 1]) {
                    {
                        do {
                            int b = Integer.parseInt(String.valueOf(a));
                            char[] reverse = new char[a.length];
                            int t = 0;
                            for (int s = reverse.length - 1; s >= 0; s--) {
                                reverse[t] = a[s];
                                t++;
                            }
                            int d = Integer.parseInt(String.valueOf(reverse));
                            sum = b + d;
                            a = String.valueOf(sum).toCharArray();
                            counter++;
                        }
                        while (a[i] != a[a.length - i - 1]);
                        System.out.println(sum + " " + counter);
                        break;
                    }
                }
            }
        }
    }
}
