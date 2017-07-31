package Algoritms;

public class SumNaturalNumber extends AbstractAlgoritm {


    @Override
    public String getName() {
        return "Sumary of natural numbers";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);//t=1
        int sum = 0;//t=1
        int i = 1;//t=1
        while(i<=n){//t=n
            sum +=i;
            System.out.printf("Iteracja: %d ::: Wartosc sumy: %d \n", i, sum);
            i++;
        }
        System.out.println(sum);
    }
}
