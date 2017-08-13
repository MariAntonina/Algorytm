package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

public class spacjeCamelCaseOdwrotnosc extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Przywrocone spacje";
    }

    @Override
    public void runAlgoritm(String[] input) {
        char[] a;
        char[] b;
        int place[] = new int[0];
        String c;

        for (int i = 1; i < input.length; i++) {
            int counter = 0;
            a = new char[input[i].length()];
            b = new char[input[i].length()];
            a = input[i].toCharArray();
            b = input[i].toLowerCase().toCharArray();

            for (int j = 0; j < a.length; j++) {
                if (a[j] != b[j]) {
                    counter++;
                    for (int k = 0; k < counter; k++) {
                        place = new int[counter];
                        place[k] = j;
                        for (int l = place[k] ; l >= 0; l--) {
                            c = String.valueOf(a).substring(0, l);
                            String d = String.valueOf(a).substring(l, a.length );
//                            String e = String.valueOf(a).substring(place[2]-1);

                            System.out.println(c);
                            System.out.println(d);
                        }
                    }
                }
            }
        }
    }
}

