package StrukturyDanych;

public class wlasnaLista{
        myElement _head;
        int counter;

    public void addElementAtBeginning(int newElement) {

       myElement p = new myElement();
        p.data = newElement;
        p.next = _head;
        _head = p;
        counter++;

    }

    public myElement getLastElement() {
        myElement iterator;
        iterator = _head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        return iterator;
    }

    public void addElementAtEnd(int newElement){
        myElement p = new myElement();
        p.data = newElement;
        myElement lastOne = getLastElement();
        lastOne.next =p;
        }
    public void addElementAfterExist(int data, int newElement){
        myElement p = new myElement();
        p.data = newElement;
        goThroughListForward();
            if(p.data == data){
                p.next = p;
        }

    }

    public void goThroughListForward() {
        myElement p = new myElement();
        p = _head;
        while (p.next != null) {
            p = p.next;
        }
    }
    public void printAllElements() {
        myElement p = _head;
        while (p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
}

