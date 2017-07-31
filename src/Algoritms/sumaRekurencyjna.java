package Algoritms;

public class sumaRekurencyjna extends AbstractAlgoritm {

    @Override
    public String getName() {
        return "Suma rekurecyjna";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(SumaR(n));
    }

    private int SumaR(int n){
        if(n < 2)
            return 1;
        return n+SumaR(n-1);
    }
}
