package HomeWork;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 12.08.2017.
 */
public class Flamaster extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "W skrocie";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);

        for (int i = 2; i < n +2 ; i++) {
            char [] a = new char[input[i].length()];
            a = input[i].toCharArray();
            for (int j = 0; j < a.length ; j++) {
                int counter = 0;
                if(a[j]==a[j+1]&& a[j+2]!=a[j]){
                    counter++;
                    System.out.println(a[j] + " " + counter);
                }

            }

        }


    }
}
