package Algoritms;

/**
 * Created by admin on 24.07.2017.
 */
public class Suma extends AbstractAlgoritm{


    @Override
    public String getName() {
        return "Suma";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int  n = Integer.parseInt(input[1]);//t=1
        int sum = 0;
        for(int i = 1; i < input.length; i++){
            sum += Integer.parseInt(input[i]);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}


