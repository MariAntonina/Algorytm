import Algoritms.AbstractAlgoritm;

public class Main {

    public static void main(String[] args) throws Exception {

        String algorithmName = args[0];

//        for (int i = 0; i < args.length ; i++) {
//            System.out.println(args[i]);}

        AlgoritmFabric factory = new AlgoritmFabric();
        AbstractAlgoritm algorithm =
                factory.getAlgoritm(algorithmName);
        System.out.println("Wykonujemy algorytm: " + algorithm.getName());

        algorithm.runAlgoritm(args);

    }
}

