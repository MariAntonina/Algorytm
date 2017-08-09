package Algoritms;

/**
 * Created by admin on 08.08.2017.
 */
public class PorownanieDużychLiczb extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Porównanie";
    }

    @Override
    public void runAlgoritm(String[] input) {
        String znak = input[3];
        double a = Double.parseDouble(input[1]);
        double b = Double.parseDouble(input[2]);
        switch (znak) {
            case "<":
                System.out.println(a<b);
                break;
            case ">":
                System.out.println(a>b);
                break;
            case "==":
                System.out.println(a==b);
            break;
            case "!=":
                System.out.println(a!=b);
                break;
            case "<=":
                System.out.println(a<=b);
            break;
            case ">=":
                System.out.println(a>=b);
                break;
            default:
                System.out.println("Brak porownania");
        }

//        switch (znak) {
//            case ("<"):
//                if(a<b)
//                    System.out.println("TRUE");
//                System.out.println("FALSE");
//                break;
//            case (">"):
//                if(a>b)
//                    System.out.println("TRUE");
//                System.out.println("FALSE");
//                break;
//            case ("=="):
//                if(a==b)
//                    System.out.println("TRUE");
//            System.out.println("FALSE");
//            break;
//            case ("!="):
//                if(a!=b)
//                    System.out.println("TRUE");
//                System.out.println("FALSE");
//                break;
//            case ("<="):
//                if(a<=b)
//                    System.out.println("TRUE");
//            System.out.println("FALSE");
//            break;
//            case (">="):
//                if(a>=b)
//                    System.out.println("TRUE");
//                System.out.println("FALSE");
//                break;
//            default:
//                System.out.println("Brak porownania");
//        }
    }
}

