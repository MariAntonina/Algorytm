package HomeWork;

import Algoritms.AbstractAlgoritm;

import java.util.ArrayList;

/**
 * Created by admin on 20.08.2017.
 */
public class pieczatkiDzieci extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Najmniejsza wieksza:";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int number = Integer.parseInt(input[1]);
        int numberOfFive = Integer.parseInt(input[2]);
        int five = 5;

        char[] num = new char[input[1].length()];
        ArrayList<Integer> piec = new ArrayList<>();

        for (int i = 0; i <= numberOfFive; i++) {
            piec.add(5);
        }

        if (num.length < numberOfFive) {
            System.out.println(Integer.parseInt(String.valueOf(piec)));
            System.out.println();
        }
        else if(numberOfFive == num.length && Integer.parseInt(String.valueOf(piec)) == number ){
            System.out.println(Integer.parseInt(String.valueOf(piec))+Math.pow(10,numberOfFive));
        }
        else if(numberOfFive == num.length && Integer.parseInt(String.valueOf(piec)) > number ){
            System.out.println(Integer.parseInt(String.valueOf(piec)));
        }
//        else if( )
}
