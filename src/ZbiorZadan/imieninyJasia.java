package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 13.08.2017.
 */
public class imieninyJasia extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Czy Jas zje w chacie cukierki?";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int uczniowie = Integer.parseInt(input[1]);// licznosc klasy
        int cukierki = Integer.parseInt(input[2]);// ilość cukierkow
        int koledzy = uczniowie-1; //wszyscy uczniowe bez Jasia

        if(cukierki> uczniowie){
            if((double)cukierki/koledzy == 1){
                System.out.println("NIE");
            }
            else{
                int ile = cukierki/koledzy;
                int dlaKolegow = koledzy*ile;
                int dlaJasia = cukierki-dlaKolegow;

                System.out.println("TAK " + dlaJasia);
            }
        }else{
            System.out.println("Nie bedzie poczestunku.");
        }
    }
}

