package ZbiorZadan;

import Algoritms.AbstractAlgoritm;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class spacjeCamelCaseOdwrotnosc extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Przywrocone spacje";
    }

    @Override
    public void runAlgoritm(String[] input) {

        String[] r = new String[0];
        String zdanie = null;
        for (int i = 1; i < input.length; i++) {

            zdanie = input[i];
            String[] strArray = zdanie.split("(?=\\p{Upper})");
            for (int j = 0; j < strArray.length; j++) {
                if(j==0)
                    System.out.printf("%s ",strArray[j]);
                else
                    System.out.printf("%s ",strArray[j].toLowerCase());
            }
            System.out.println();
        }
    }
}




