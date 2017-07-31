package Algoritms;


public class SpacjeCamelCase extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Camel bez spacji";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 1;

        for (int i = 1; i < n ; i++) {
            String word;
            word = input[i];
            char [] zdanie = word.toCharArray();
            for (int j = 0; j < zdanie.length ; j++) {
                if(j==0){
                    System.out.printf("%s", Character.toString(zdanie[j]).toUpperCase());
                }
                else
                System.out.printf("%s", Character.toString(zdanie[j]).toLowerCase());
            }
        }
    }
}
