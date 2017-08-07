package Algoritms;


import java.util.ArrayList;

public class zliczaczLiter extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Zliczacz liter";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = 0;
        for (int i = 1; i < input.length; i++) {
            n += input[i].length();
        }
        String word;
//        String tab[] = new String[n];
        char letter[] = new char[n];
        ArrayList<char[]> litery = new ArrayList<>();
        for (int i = 2; i < input.length; i++) {
            word = input[i];
            letter = word.toCharArray();
            for (int j = 0; j < letter.length; j++) {
//                System.out.print(letter[j]);

//                litery.add(String.toChars(letter[j]));
            }
            System.out.println(litery);
        }


            //        for (int i = 0; i < input.length - 1; i++) {
//            tab[i] = input[i + 1];
//            System.out.print(tab[i]);
        }
//        for (int i = 0; i <tab.length; i++) {
//            letter[i] = tab[i].charAt(i);
//        }
//        System.out.println(letter);
//
//
//        ArrayList<String > litery = new ArrayList<String>();
//        for (int i = 1; i < input.length; i++) {
//            for (int j = 1; j < tab.length; j++) {
//                letter[j] = input[j].charAt(j);
//                System.out.println(letter);
//            }

 }











