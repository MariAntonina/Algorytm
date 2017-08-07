import Algoritms.*;
import Struktury.ONP;
import Struktury.Stos;
import Struktury.TestowanieKopca;
import Struktury.TestowanieListy;
import StrukturyDanych.ArrayListTest;
import StrukturyDanych.StosArrayList;
import StrukturyDanych.ZmienneITablice;
import StrukturyDanych.wlasnaLista;

public class AlgoritmFabric {

    public AbstractAlgoritm getAlgoritm(String name) throws Exception{
        switch (name.toLowerCase()){
            case "test":
                return  new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            case "sumnaturalnumber":
                return new SumNaturalNumber();
            case "suma":
                return new Suma();
            case "banknoty":
                return  new Banknoty();
            case "rokprzestepny":
                return new rokPrzestepny();
            case "silnia":
            return new Silnia();
            case "sumarekurecyjna":
                return new sumaRekurencyjna();
            case "podzial":
                return new jednostkiDziesiatki();
            case "ciagfibonacciego":
                return new Fibonacci();
            case "metodababelkowa":
                return new Bable();
            case "sortowaniewzgledempunktu":
                return new SortowanieWzgledemPunktu();
            case "iloscmiejsc":
                return new Samolot();
            case "zliczaczliter":
                return new zliczaczLiter();
            case "sortowanieelementow":
                return new sortowaniePrzezZliczanie();
            case "tablicadwuwymiarowa":
                return new tablicaDwuwymiarowa();
            case "krokikwadratowe":
                return  new nowaDzialka();
//            case "wposzukiwaniupalindromu":
//                return new Palindrom();
            case "nwdto":
                return new najwiekszyWspolnyDzielnik();
            case "grawwarcaby":
                return new Warcaby();
            case "wartoscnajczestsza":
                return new Dominanta();
            case "kabala":
                return new KabalistycznyZapisDaty();
            case "cisteczkowezawody":
                return new Obzartuchy();
            case "easter":
                return new Wielkanoc();
            case "camelbezspacji":
                return new SpacjeCamelCase();
            case "mrand":
                return new mRandom();
            case "minimax":
                return new MinMax();
            case "lider":
                return new Lider();
            case "testowanielist":
                return new TestowanieListy();
            case "duplikat":
                return new ZmienneITablice();
            case "todelete":
                return new ArrayListTest();
//            case "wlasnalista":
//                return new wlasnaLista();
            case "palindromnastos":
                return new StosArrayList();
            case "ciasteczkowezawody":
                return new Obzartuchy();
            case "poprawnypesel":
                return new WeryfikacjaPeselu();
            case "wstawianieprzezkocpowanie":
                return new TestowanieKopca();
            case "przeliczaniesystemow":
                return new Stos();
            case  "odwrotnanotacja":
                return new ONP();
            default:
                throw new Exception("NIe ma takiego algorytmu!");
        }
    }
}
