package Algoritms;


public class jednostkiDziesiatki extends AbstractAlgoritm {


    @Override
    public String getName() {
        return "podzial";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);

        System.out.println(DziesiatkiIJednostki(n));
    }

    private String DziesiatkiIJednostki(int n) {
        switch (n) {
            case 1:
                return "0 1";
            case 2:
                return "0 2";
            case 3:
                return "0 6";
            case 4:
                return "2 4";
            case 5:
            case 6:
            case 8:
                return "2 0";
            case 7:
                return "4 0";
            case 9:
                return "8 0";

            default:
                return "0 0";
        }
    }

}
