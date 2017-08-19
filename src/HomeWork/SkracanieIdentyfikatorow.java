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
            numbers.add(cyfa[i]);}

        ArrayList<Character> letters = new ArrayList<>();
        char litrea[] = "abcdefghijklmnopqrstuwvxyzABCDEFGHIJKLMNOPQRSTUWVXYZ".toCharArray();
        for (int i = 0; i < litrea.length ; i++) {
            letters.add(litrea[i]);}

        int n = Integer.parseInt(input[1]);
        char zmienna[] = input[2].toCharArray();

        ArrayList<String> doSkrotu = new ArrayList<>();

        for (int i = 0; i < zmienna.length; i++) {
            doSkrotu.add(String.valueOf(i));
        }
        if (doSkrotu.size() == n) {
            System.out.println(input[2]);
        } else if(doSkrotu.size()!=n){
            for (int i = doSkrotu.size() - 1; i >= 0; i++) {
                while(doSkrotu.size()!=n){
                    for (int j = 0; j <letters.size() ; j++) {
                        for (int k = 0; k <numbers.size() ; k++) {
                            if (!(doSkrotu.contains(letters.get(j)))&&!(doSkrotu.contains(numbers.get(k)))) {
                                doSkrotu.remove(i);}
                        }break;
                    }
                System.out.println(doSkrotu);
                }
            for (int s = doSkrotu.size() - 1; s >= 0; s++){
                
            }


            }
        }
    }

