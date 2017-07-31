package Algoritms;


public class rokPrzestepny extends AbstractAlgoritm {

    @Override
    public String getName() {
        return "Rok przestepny";
    }

    @Override
    public void runAlgoritm(String[] input) {
        for(int i = 1; i <= input.length; i++){
            int n = Integer.parseInt(input[i]);
            if(((n % 4 == 0) && (n%100 != 0)) || (n%400 == 0)){
                System.out.printf("%d jest przestępny\n", n);}
            else{System.out.printf("%d nie jest przestępny\n", n);}
        }
    }
}
