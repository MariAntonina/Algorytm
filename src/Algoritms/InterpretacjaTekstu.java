package Algoritms;

public class InterpretacjaTekstu extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Punkty z testu";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = input[1].length();
        int counter = 0;

//---
//        char A[] = new char[n];
//        char B[] = new char[n];
//        char C[] = new char[n];

//        for (int i = 0; i < n; i++) {
//            A[i] = input[1].charAt(i);
//            B[i] = input[2].charAt(i);
//            C[i] = input[3].charAt(i);
//        }
// ---

           char A[] = input[1].toCharArray();
           char B[] = input[2].toCharArray();
           char C[] = input[3].toCharArray();

        for (int i = 0; i < n; i++) {
            if (A[i]!=B[i]) {
                counter ++;
            }
            if(A[i]!=C[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

