package StrukturyDanych;

import Algoritms.AbstractAlgoritm;
import java.util.ArrayList;

/**
 * Created by admin on 04.08.2017.
 */
public class ArrayListTest extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "To delete";
    }

    @Override
    public void runAlgoritm(String[] input){
        int toDelete = Integer.parseInt(input[1]);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <input.length ; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        System.out.println("Rozmiar listy to: "+list.size());

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==toDelete) {
                list.remove(i);
                i=0;
            }
        }
        System.out.println(list);
        System.out.println("Rozmiar listy to: "+list.size());
    }
}
