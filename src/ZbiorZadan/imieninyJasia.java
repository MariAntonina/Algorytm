package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 13.08.2017.
 */
public class imieninyJasia extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int uczniowie = Integer.parseInt(input[1]);
        int cukierki = Integer.parseInt(input[2]);
        int dopoczestowania = uczniowie-1;

        if(cukierki> uczniowie){
            if((double)cukierki/dopoczestowania == 1){
                System.out.println("NIE");
            }
            else{
                int ile = cukierki/dopoczestowania;
                int dlaKolegow = dopoczestowania*ile;
                int dlaJasia = cukierki-dlaKolegow;

                System.out.println("TAK " + dlaJasia);
            }
        }else{
            System.out.println("Nie bedzie poczestunku.");
        }
    }
}

