package Struktury;


public class Kopiec {
    int n;
    int _counter = 0;
    int _date[];

    public Kopiec(int n) {
        _date = new int[n];
    }

    public void InsertElement(int element) {
        int i = _counter;
        _counter++;
        int j = Math.floorDiv(i - 1, 2);
        while (i > 0 && _date[j] < element) {
            _date[i] = _date[j];
            i = j;
            j = Math.floorDiv(i - 1, 2);
        }
        _date[i] = element;
    }

    public void printAllElements() {
        for (int i = 0; i < _counter; i++) {
            System.out.printf("%d ", _date[i]);
        }
    }

    public void sort() {
        int[] sort = new int[_counter];
        for (int i = _counter - 1; i >= 0; i--) {
            sort[i] = i;
        }
    }

    public int toDelete() {
        int root = -1;
        int lastElement = -1;
        int i = 0;
        int j = 0;
        if (_counter > 0) {
            _counter--;
            root = _date[0];
            lastElement = _date[_counter];
            while (j < _counter) {
                if ((j + 1 < _counter) && (_date[j + 1] > _date[j])) {
                    j = j + 1;
                }
                    if (lastElement >= _date[j]) {
                        break;
                    }
                    _date[i] = _date[j];
                    i = j;
                    j = 2*j + 1;
                }

            _date[i] = lastElement;
        }
        return root;
    }
}



