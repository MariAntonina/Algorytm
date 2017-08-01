package Struktury;

import Algoritms.AbstractAlgoritm;
import Struktury.myList;

import java.util.ArrayList;

/**
 * Created by admin on 01.08.2017.
 */
public class TestowanieListy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Testowanie listy";
    }

    @Override
    public void runAlgoritm(String[] input) {
        myList lista = new myList();

        lista.addElementAtBeginning(14, lista);
        lista.addElementAtBeginning(25,lista);
        lista.addElemenBeforeElement(5, 14,lista); ;
        lista.addElementAfterElement(6,25, lista);
        lista.printAllElements(lista);


        System.out.println();
        ArrayList<String> list = new ArrayList<String>();
        list.add("niebieski");
        list.add("czarny");
        list.add("zolty");
        list.add("fioletowy");

        list.add(0,"rozowy");
        list.add(list.size(), "zielony");

        for(String element : list){
            System.out.println(element);
        }
    }
}
