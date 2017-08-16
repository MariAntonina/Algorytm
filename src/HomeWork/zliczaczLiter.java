package HomeWork;


import Algoritms.AbstractAlgoritm;

import java.util.*;

public class zliczaczLiter extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Zliczacz liter";
    }

    @Override
    public void runAlgoritm(String[] input) {
        //        Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
//       String words = null;
//        for (int i = 1; i < input.length; i++){
//            words += input[i] ;}
//        for (int i = 1; i < words.length(); i++) {
//           char letters = words.charAt(i);
//                if (charCounter.containsKey(letters)) {
//                    charCounter.put(letters, charCounter.get(letters) + 1);
//                } else {
//                    charCounter.put(letters, 1);
//                }
//        }
//        System.out.println(charCounter );
//    }
//}
//        HashMap<Character,Integer> zliczacz = new HashMap<Character,Integer>();
//
//        String s = null;
//        for (int i = 1; i < input.length; i++){
//            s += input[i] ;
//        }
//        for(int i = 0; i < s.length(); i++){
//
//            char literka = s.charAt(i);
//            Integer wystapienie = zliczacz.get(new Character(literka));
//
//            if(wystapienie != null){
//                zliczacz.put(literka, new Integer(wystapienie + 1));
//            }else{
//                zliczacz.put(literka,1);
//            }
//        }


//        System.out.println(zliczacz);

        String inputString = null;
        for (int i = 1; i < input.length; i++) {
            inputString += input[i];
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            int count = 0;
            if (charCountMap.containsKey(c)) {
                count = charCountMap.get(c);
            }
            charCountMap.put(c, count + 1);
        }
        System.out.println(charCountMap);
    }
}

