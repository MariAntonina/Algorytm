package Algoritms;


public class tablicaDwuwymiarowa extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Tablica dwuwymiarowa";
    }

    @Override
    public void runAlgoritm(String[] input) {

        String _letters[] = {"A", "B", "C", "D", "E", "F", "G", "H",
                "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "W", "V", "X",
                "Y", "Z"};

        int n = Integer.parseInt(input[1]);


        if (Math.sqrt(n) % 1 == 0) {
            int sqrt = (int) Math.sqrt(n);

            String tab[][] = new String[sqrt][sqrt];

            for (int i = 0; i < sqrt; i++) {
                for (int j = 0; j < sqrt; j++) {
                    tab[i][j] = _letters[i] + (j + 1);
                }
            }
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    System.out.printf("%s", tab[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Bez tablicy");
        }
    }
}

