package ZbiorZadan;

import Algoritms.AbstractAlgoritm;

public class BiednyCamelCase extends AbstractAlgoritm{

    @Override
    public String getName(){
        return "Biedny Camel Case";

    }

    @Override
    public void runAlgoritm(String[] input) {

        int iterator = 0;
        for(int i = 1; i < input.length; i++){
            String word = input[i];
            char[] Tablica = word.toCharArray();
            for(int j= 0; j < Tablica.length; j++){
                if( iterator%2==0 ){
                    System.out.print(Character.toString(Tablica[j]).toUpperCase());
                }else{
                    System.out.print(Character.toString(Tablica[j]).toLowerCase());
                }
                iterator++;
            }

        }
    }

}
