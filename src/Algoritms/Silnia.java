package Algoritms;

public class Silnia extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Silnia";
    }

    @Override
    public void runAlgoritm(String[] input){
        int n = Integer.parseInt(input[1]);
        System.out.println(Silnia(n));}

    private int Silnia(int n){
        if(n<2)
            return 1;
        return n*Silnia(n-1);
    }
}
