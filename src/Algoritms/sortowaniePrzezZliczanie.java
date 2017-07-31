package Algoritms;

public class sortowaniePrzezZliczanie extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Zliczanie elementow";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 2;
        int max = Integer.parseInt(input[1]) + 1;
        int[] tabSparsowanychWejsc = new int[n];

        for (int i = 0; i < n; i++) {
            tabSparsowanychWejsc[i] = Integer.parseInt(input[i + 2]);
        }

        int[] helpDesk = new int[max];

        for (int i = 0; i < tabSparsowanychWejsc.length; i++) {
            int liczba = tabSparsowanychWejsc[i];
            helpDesk[liczba]++;
        }
        for(int indeksTab = 0; indeksTab < helpDesk.length; indeksTab++){
            for(int ileLiczb = helpDesk[indeksTab]; ileLiczb != 0; ileLiczb--){
                System.out.printf("%d", indeksTab);
            }
        }
    }
}
