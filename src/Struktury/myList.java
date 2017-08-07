package Struktury;

public class myList {
    Element _head;
    Element _tail;
    int counter;

    public void goThroughListBackward(myList list) {//myList - metoda, list - argument
        Element p = list._tail;
        while (p.prev != null) {
            p = p.prev;
        }
    }

    public void goThroughListForward(myList list) {//myList - metoda, list - argument
        Element p = list._head;
        while (p.next != null) {
            p = p.next;
        }
    }

    public void addElementAtBeginning(int newElement, myList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;

        if (p.next != null) {
            Element nextEl = p.next;
            nextEl.prev = p;
        } else {
            list._tail = p;
        }
    }

    public void addElementAtEnd(int newElement, myList list) {
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = list._tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null) {
            Element nextEl = p.prev;
            nextEl.next = p;
        } else {
            list._head = p;
        }
    }

    public void addElemenBeforeElement(int elementToAdd, int elementBefore,  myList list) {

        Element before = list.getElementForward(elementBefore, list);
        if(before == list._head){
            list.addElementAtBeginning(elementToAdd, list);
        }else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;

            before.prev = p;
            list.counter++;
        }
    }

    public void addElementAfterElement(int elementToAdd, int elementAfter,  myList list){
        Element after = list.getElementForward(elementAfter,list);
        if(after == list._tail){
            list.addElementAtEnd(elementToAdd, list);
        }else{
            Element p = new Element();
            p.data = elementToAdd;
            p.next =after.next;
            p.prev =after;
            Element nextAfter = after.next;
//            nextAfter.prev = p;

            after.next = p;
            list.counter++;
        }
    }



    public Element getElementForward(int data, myList list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public void printAllElements(myList list) {
        Element p = list._head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
    public void toDeleteAtBegining(int elDoUs, myList list) {
        Element p = getElementForward(elDoUs, list);
        counter--;
        if (p.prev == null) {
            _head = p.next;
            Element nextEl = p.next;
            nextEl.prev = null;
        } else {
            p.prev.next = p.next;
        }
    }
    public void toDeleteAtTheEnd(int elDoUs, myList list){
        Element p = getElementForward(elDoUs, list);
        counter--;
        if(p.next == null){
            _tail = p.prev;
            Element prevEl = p.prev;
            prevEl.next =null;
        }else{
            p.next.prev=p.prev;
        }
    }

}

