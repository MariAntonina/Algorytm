package Algoritms;
public class Dominanta extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Wartosc najczestsza";
    }

    @Override
    public void runAlgoritm(String[] input){

        int n = input.length - 1;
        int T[] = new int[n];
        int max = 0;
        int dominanta = 0;

        for (int i = 1; i < input.length -1; i++) {
            T[i] = Integer.parseInt(input[i]);
            if(T[i]>max)
                max = T[i];
//            System.out.print(T[i]);
        }

        System.out.println(max);
        int L[] = new int[max +1];
        int W[] = new int[max +1];

        for (int i = 0; i <= max ; i++) {
            L[i]=i;
             //L[T[i]]++
        }

        for (int i = 0; i <= max; i++) {
            W[T[i]]++;
        }

        for (int i = 0; i <= max; i++) {
            System.out.printf("%s", L[i]);

        }

        int maxIlosc=0;

        System.out.println();
        for (int i = 0; i <= max; i++) {
            System.out.printf("%s", W[i]);
        }

        for (int i = 0; i <= max; i++) {
            if(W[i]> maxIlosc )
                maxIlosc = W[i];
        }
        System.out.println();

        for (int i = 0; i < max; i++){
            if(W[i] > W[dominanta]){
                dominanta = i;
            }
        }
        System.out.print("Dominanta: " + dominanta);

    }
}
