package Algoritms;

/**
 * Created by admin on 25.07.2017.
 */
public class Fibonacci extends AbstractAlgoritm{

    @Override
    public String getName() {
        return "ciag fibonacciego";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = Integer.parseInt(input[1]);
        System.out.println(Fibo(n));
    }

    private int Fibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return Fibo(n-2)+Fibo(n-1);
    }
}
