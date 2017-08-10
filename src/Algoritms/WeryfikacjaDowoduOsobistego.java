//package Algoritms;
//
///**
// * Created by admin on 09.08.2017.
// */
//public class WeryfikacjaDowoduOsobistego extends  AbstractAlgoritm{
//    @Override
//    public String getName() {
//        return null;
//    }
//
//    @Override
//    public void runAlgoritm(String[] input) {
//
//        char litery[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
//        int wartosc[] = new int [litery.length];
//
//        char dowod[]= new char[input.length-1];
//
//        int wagi[] = {7, 3, 1, 9, 7, 3, 1, 7, 3};
//        int it = input.length-1;
//            for (int j = 1; j < input.length; j++) {
//                dowod[j] = input[j].toCharArray();
//                System.out.println(dowod[j]);
//        }
//
//        for (int i = 0; i < wartosc.length; i++) {
//            wartosc[i]= 10+i;
//            System.out.println(wartosc[i]);
//        }
//    }
//}
