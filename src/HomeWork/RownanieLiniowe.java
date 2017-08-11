package HomeWork;

import Algoritms.AbstractAlgoritm;

/**
 * Created by admin on 08.08.2017.
 */
public class RownanieLiniowe extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Równanie ax + b = c ma:";
    }

    @Override
    public void runAlgoritm(String[] input) {
        double a = Double.parseDouble(input[1]);
        double b = Double.parseDouble(input[2]);
        double c = Double.parseDouble(input[3]);
        double x;

        if(a==0){
            if(b==c){
                System.out.println("Nieskończenie wiele rozwiazań");
            }else{
                System.out.println("Brak rozwiązań");
            }
        }else{
            x= (c-b)/a;
            System.out.printf("%.2f%n", x);
        }
    }
}
