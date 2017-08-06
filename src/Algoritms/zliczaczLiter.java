package Algoritms;


public class zliczaczLiter extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Zliczacz liter";
    }

    @Override
    public void runAlgoritm(String[] input) {
        String word;
        for (int i = 1; i < input.length; i++) {
            word = input[i];
            char[] letter = word.toCharArray();

//        for (int j = 0; j < letter.length; j++) {
//            int sum = 0;
//            char litera;
//            litera = letter[j];
//            for (int k = 0; k < letter.length; k++) {
//                if(letter[j] == litera)
//                    sum = sum + 1;
//                System.out.print(litera);
//            }
        }
//        System.out.print(sum +" " );
    }
}






//        int n = Integer.parseInt(input[1]);
////        char ABC[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
////        char abc[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        String word;
//        char letter[];
//        int counter = 0;
//
//        for (int i = 2; i < input.length; i++) {
//            word = input[i];
//            letter = word.toCharArray();
////            for (int j = 0; j < letter.length; j++) {
////                System.out.print(letter[j]);
////            }
//        for (int j = 0; j < letter.length ; j++) {
//            char litera;
//            litera = letter[j];
//            for (int k = 0; k < ABC.length ; k++) {
//            if(ABC[k]==litera || abc[k]==litera) {
//                counter++;
//                System.out.printf("%s", litera + " " + counter);
//            }
//            }
//        }
//        }

