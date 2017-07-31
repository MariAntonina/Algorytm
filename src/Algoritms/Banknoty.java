package Algoritms;


public class Banknoty extends AbstractAlgoritm {

    @Override
    public String getName() {
        return "Optymalizacja nominałów";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int zloto = Integer.parseInt(input[1]);
        int grosz = Integer.parseInt(input[2]);
        int zlote[] = {200, 100, 50, 20, 10, 5, 2, 1};
        int grosze[] = {50, 20, 10, 5, 2, 1};
        int iloscBanknotow[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int iloscGroszowek[] = new int[]{0, 0, 0, 0, 0, 0};

        while (zloto > 0) {
            for (int i = 0; i < zlote.length; i++) {
                if (zloto >= zlote[i]) {
                    zloto = zloto - zlote[i];
                    iloscBanknotow[i]++;
                    break;
                }

            }
        }
        while (grosz > 0) {
            for (int j = 0; j < grosze.length; j++) {
                if (grosz >= grosze[j]) {
                    grosz = grosz - grosze[j];
                    iloscGroszowek[j]++;
                    break;
                }
            }
        }

        try {
            for (int i = 0; i < iloscBanknotow.length; i++) {
                System.out.printf("%d zl x %d\t %d gr x %d\n", zlote[i], iloscBanknotow[i], grosze[i], iloscGroszowek[i]);
            }
//        System.out.println();
        } catch (Exception e) {

        }
//        System.out.p
//        for(int i=0; i < iloscGroszowek.length;i++){
//            System.out.printf("%d x %d\n",);
//        }
    }
}

