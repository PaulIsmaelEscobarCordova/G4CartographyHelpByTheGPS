
package g4cartography;
import java.util.Scanner;
public class G4Cartography {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            printBanner();
            option = input.nextInt();

            switch (option) {

                case 1:

                    do {
                        option = printConversionMenu(input);

                        switch (option) {

                            case 1:
                                do {
                                    printDMStoDDMenu();
                                    option = input.nextInt();

                                    switch (option) {

                                        case 1:
                                            turnLatitudeDMStoDD(input);
                                            break;

                                        case 2:
                                            turnLongitudDMStoDD(input);
                                            break;

                                        case 0:
                                            printGoodLuck();
                                            break;
                                        default:
                                            printInvalidOption();
                                            break;
                                    }
                                } while (option != 2);

                            case 2:
                                do {
                                    printDDtoUTMMenu();
                                    option = input.nextInt();

                                    switch (option) {

                                        case 1:
                                            turnLatitudDDtoUTM(input);
                                            break;

                                        case 2:
                                            turnLongitudDDtoUTM(input);
                                            break;

                                        case 0:
                                            printGoodLuck();
                                            break;
                                        default:
                                            printInvalidOption();
                                            break;
                                    }
                                } while (option != 2);

                            case 0:
                                printGoodLuck();
                                break;
                            default:
                                printInvalidOption();
                                break;
                        }
                    } while (option != 2);

                case 2:
                    do {
                        printSurfaceAndPerimeterMenu();
                        option = input.nextInt();

                        switch (option) {

                            case 1:
                                do {
                                    printPerimeterMenu();
                                    option = input.nextInt();

                                    switch (option) {

                                        case 1:
                                            computePerimeter3Points(input);
                                            break;

                                        case 2:
                                            computePerimeter4Points(input);
                                            break;

                                        case 3:
                                            computePerimeter5Points(input);
                                            break;

                                        case 0:
                                            printGoodLuck();
                                            break;
                                        default:
                                            printInvalidOption();
                                            break;
                                    }
                                } while (option != 3);

                            case 2:

                                do {
                                    printAreaMenu();
                                    option = input.nextInt();

                                    switch (option) {

                                        case 1:
                                            computeArea3Points(input);
                                            break;

                                        case 2:
                                            computeArea4Points(input);
                                            break;

                                        case 3:
                                            computeArea5Points(input);
                                            break;

                                        case 0:
                                            printGoodLuck();
                                            break;
                                        default:
                                            printInvalidOption();
                                            break;
                                    }
                                } while (option != 3);

                            case 0:
                                printGoodLuck();
                                break;
                            default:
                                printInvalidOption();
                                break;
                        }
                    } while (option != 6);

                case 0:
                    printGoodLuck();
                    break;
                default:
                    printInvalidOption();
                    break;
            }
        } while (option != 2);

    }

    public static void printInvalidOption() {
        System.out.println("Invalid option \n");
    }

    public static void printGoodLuck() {
        System.out.println("Thanks for using our Aplication ");
        System.out.println("Good Luck \n");
        System.exit(0);
    }

    public static void printAreaMenu() {
        System.out.println("Area Calculator");
        System.out.println("Please Choose the Number -> ");
        System.out.println("1. ==> 3 Points");
        System.out.println("2. ==> 4 Points");
        System.out.println("3. ==> 5 Points");
        System.out.println("0. ==> Exit");
    }

    public static void printPerimeterMenu() {
        System.out.println("Perimeter Calculator");
        System.out.println("Please Choose the Number -> ");
        System.out.println("1. ==> 3 Points");
        System.out.println("2. ==> 4 Points");
        System.out.println("3. ==> 5 Points");
        System.out.println("0. ==> Exit");
    }

    public static void printSurfaceAndPerimeterMenu() {
        System.out.println("Surface Area and Perimeter Calculator");
        System.out.println("Please Choose the Number ->  ");
        System.out.println("1. -> Perimeter");
        System.out.println("2. -> Area");
        System.out.println("0. -> Exit");
    }

    public static void printDDtoUTMMenu() {
        System.out.println("Decimal Degrees to UTM (X,Y)");
        System.out.println("Please Choose the Number -> ");
        System.out.println("1. ==> Latitude");
        System.out.println("2. ==> Length");
        System.out.println("0. ==> Exit");
    }

    public static void printDMStoDDMenu() {
        System.out.println("D.M.S.(Degrees, Minutes, Seconds) to Decimal Degrees");
        System.out.println("Please Choose the Number -> ");
        System.out.println("1. ==> Latitude");
        System.out.println("2. ==> Length");
        System.out.println("0. ==> Exit");
    }

    public static int printConversionMenu(Scanner input) {
        int option;
        System.out.println("Coordinate Conversion");
        System.out.println("Please Choose the Number -> ");
        System.out.println("1. ==>D.M.S.(Degrees, Minutes, Seconds) to Decimal Degrees ");
        System.out.println("2. ==>Decimal Degrees to UTM (X,Y)");
        System.out.println("0. ==> Exit");
        option = input.nextInt();
        return option;
    }

    public static void printBanner() {
        System.out.println(""
                + " ==============================================================================================\n"
                + "| ******************************************************************************************** |\n"
                + "| *  ======================================================================================  * |\n"
                + "| * | 											   | * | \n"
                + "| * |  _____            _                              _     _        _   _      _         | * | \n"
                + "| * | /  __ \\          | |                            | |   (_)      | | | |    | |        | * |  \n"
                + "| * | | /  \\/ __ _ _ __| |_ ___   __ _ _ __ __ _ _ __ | |__  _  ___  | |_| | ___| |_ __    | * | \n"
                + "| * | | |    / _` | '__| __/ _ \\ / _` | '__/ _` | '_ \\| '_ \\| |/ __| |  _  |/ _ \\ | '_ \\   | * | \n"
                + "| * | | \\__/\\ (_| | |  | || (_) | (_| | | | (_| | |_) | | | | | (__  | | | |  __/ | |_) |  | * | \n"
                + "| * |  \\____/\\__,_|_|   \\__\\___/ \\__, |_|  \\__,_| .__/|_| |_|_|\\___| \\_| |_/\\___|_| .__/   | * | \n"
                + "| * |                             __/ |         | |                               | |      | * | \n"
                + "| * |                            |___/          |_|                               |_|      | * | \n"
                + "| * |                                                                                      | * | \n"
                + "| * |**************************************************************************************| * |\n"
                + "| * |         Welcome to Cartographic Help to \"LOS GPS\"                                    | * |\n"
                + "| * |         Please Choose the literal to Help You                                        | * |\n"
                + "| * |   	 1. ==> Coordinate Conversion				   	           | * |\n"
                + "| * |   	 2. ==> Surface Area and Perimeter Calculator		   	           | * |\n"
                + "| * |   	 0. ==> Exit						   		   | * |\n"
                + "| * |                                                                                      | * |\n"
                + "| *  ======================================================================================  * |\n"
                + "| ********************************************************************** \" LOS GPS \" ********* |\n"
                + " ==============================================================================================");
    }
    
    public static void computeArea5Points(Scanner input) {
        double px1;
        double px2;
        double px3;
        double px4;
        double px5;
        double py1;
        double py2;
        double py3;
        double py4;
        double py5;
        double area;

        System.out.println("Enter Px1 value -> ");
        px1 = input.nextDouble();
        System.out.println("Enter Py1 value -> ");
        py1 = input.nextDouble();
        System.out.println("Enter Px2 value -> ");
        px2 = input.nextDouble();
        System.out.println("Enter Py2 value -> ");
        py2 = input.nextDouble();
        System.out.println("Enter Px3 value -> ");
        px3 = input.nextDouble();
        System.out.println("Enter Py3 value -> ");
        py3 = input.nextDouble();
        System.out.println("Enter Px4 value -> ");
        px4 = input.nextDouble();
        System.out.println("Enter Py4 value -> ");
        py4 = input.nextDouble();
        System.out.println("Enter Px5 value -> ");
        px5 = input.nextDouble();
        System.out.println("Enter Py5 value -> ");
        py5 = input.nextDouble();

        area = (Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                * Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2))) / 2
                + (Math.sqrt((px4 - px3) * (px4 - px3) + (py4 - py3) * (py4 - py3))
                * Math.sqrt((px5 - px4) * (px5 - px4) + (py5 - py4) * (py5 - py4))) / 2;
        System.out.println("The Area is: \n"
                + area);
    }

    public static void computeArea4Points(Scanner input) {
        double px1;
        double px2;
        double px3;
        double px4;
        double py1;
        double py2;
        double py3;
        double py4;
        double area;

        System.out.println("Enter Px1 value -> ");
        px1 = input.nextDouble();
        System.out.println("Enter Py1 value -> ");
        py1 = input.nextDouble();
        System.out.println("Enter Px2 value -> ");
        px2 = input.nextDouble();
        System.out.println("Enter Py2 value -> ");
        py2 = input.nextDouble();
        System.out.println("Enter Px3 value -> ");
        px3 = input.nextDouble();
        System.out.println("Enter Py3 value -> ");
        py3 = input.nextDouble();
        System.out.println("Enter Px4 value -> ");
        px4 = input.nextDouble();
        System.out.println("Enter Py4 value -> ");
        py4 = input.nextDouble();

        area = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                * Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2));
        System.out.println("The Area is: \n"
                + area);
    }

    public static void computeArea3Points(Scanner input) {
        double px1;
        double px2;
        double px3;
        double py1;
        double py2;
        double py3;
        double area;
        System.out.println("Enter Px1 value -> ");
        px1 = input.nextDouble();
        System.out.println("Enter Py1 value -> ");
        py1 = input.nextDouble();
        System.out.println("Enter Px2 value -> ");
        px2 = input.nextDouble();
        System.out.println("Enter Py2 value -> ");
        py2 = input.nextDouble();
        System.out.println("Enter Px3 value -> ");
        px3 = input.nextDouble();
        System.out.println("Enter Py3 value -> ");
        py3 = input.nextDouble();

        area = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                * Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2));

        System.out.println("The Area is: \n"
                + area / 2);
    }

    public static void computePerimeter5Points(Scanner input) {
        double px1;
        double px2;
        double px3;
        double px4;
        double px5;
        double py1;
        double py2;
        double py3;
        double py4;
        double py5;
        double per;

        System.out.println("Enter Px1 value -> ");
        px1 = input.nextDouble();
        System.out.println("Enter Py1 value -> ");
        py1 = input.nextDouble();
        System.out.println("Enter Px2 value -> ");
        px2 = input.nextDouble();
        System.out.println("Enter Py2 value -> ");
        py2 = input.nextDouble();
        System.out.println("Enter Px3 value -> ");
        px3 = input.nextDouble();
        System.out.println("Enter Py3 value -> ");
        py3 = input.nextDouble();
        System.out.println("Enter Px4 value -> ");
        px4 = input.nextDouble();
        System.out.println("Enter Py4 value -> ");
        py4 = input.nextDouble();
        System.out.println("Enter Px5 value -> ");
        px5 = input.nextDouble();
        System.out.println("Enter Py5 value -> ");
        py5 = input.nextDouble();

        per = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                + Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2))
                + Math.sqrt((px4 - px3) * (px4 - px3) + (py4 - py3) * (py4 - py3))
                + Math.sqrt((px5 - px4) * (px5 - px4) + (py5 - py4) * (py5 - py4))
                + Math.sqrt((px1 - px5) * (px1 - px5) + (py1 - py5) * (py1 - py5));
        System.out.println("The Perimeter is: \n"
                + per);
    }

    public static void computePerimeter4Points(Scanner input) {
        double px1;
        double px2;
        double px3;
        double px4;
        double py1;
        double py2;
        double py3;
        double py4;
        double per;

        System.out.println("Enter Px1 value -> ");
        px1 = input.nextDouble();
        System.out.println("Enter Py1 value -> ");
        py1 = input.nextDouble();
        System.out.println("Enter Px2 value -> ");
        px2 = input.nextDouble();
        System.out.println("Enter Py2 value -> ");
        py2 = input.nextDouble();
        System.out.println("Enter Px3 value -> ");
        px3 = input.nextDouble();
        System.out.println("Enter Py3 value -> ");
        py3 = input.nextDouble();
        System.out.println("Enter Px4 value -> ");
        px4 = input.nextDouble();
        System.out.println("Enter Py4 value -> ");
        py4 = input.nextDouble();

        per = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                + Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2))
                + Math.sqrt((px4 - px3) * (px4 - px3) + (py4 - py3) * (py4 - py3))
                + Math.sqrt((px1 - px4) * (px1 - px4) + (py1 - py4) * (py1 - py4));
        System.out.println("The Perimeter is: \n"
                + per);
    }

    public static void computePerimeter3Points(Scanner input) {
        double px1;
        double px2;
        double px3;
        double py1;
        double py2;
        double py3;
        double per;
        System.out.println("Enter Px1 value -> ");
        px1 = input.nextDouble();
        System.out.println("Enter Py1 value -> ");
        py1 = input.nextDouble();
        System.out.println("Enter Px2 value -> ");
        px2 = input.nextDouble();
        System.out.println("Enter Py2 value -> ");
        py2 = input.nextDouble();
        System.out.println("Enter Px3 value -> ");
        px3 = input.nextDouble();
        System.out.println("Enter Py3 value -> ");
        py3 = input.nextDouble();
        per = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                + Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2))
                + Math.sqrt((px1 - px3) * (px1 - px3) + (py1 - py3) * (py1 - py3));
        System.out.println("The Perimeter is: \n"
                + per);
    }


    public static void turnLongitudDDtoUTM(Scanner input) {
        double longitud;
        double y;
        System.out.println("Enter Length Value -> ");
        longitud = input.nextDouble();
        y = -(longitud * 126798.6481);
        System.out.println("The Y Coordinate is: \n"
                + y);
    }

    public static void turnLatitudDDtoUTM(Scanner input) {
        double latitud;
        double x;
        System.out.println("Enter Latitude Value -> ");
        latitud = input.nextDouble();
        x = -(latitud * 2261291.013);
        System.out.println("The X Coordinate is: \n"
                + x);
    
    }

    public static void turnLongitudDMStoDD(Scanner input) {
        double grados;
        double minutos;
        double segundos;
        double dd;
        System.out.println("Enter Degree Value -> ");
        grados = input.nextDouble();
        System.out.println("Enter Minute Value -> ");
        minutos = input.nextDouble();
        System.out.println("Enter Seconds Value -> ");
        segundos = input.nextDouble();
        dd = -(grados + (minutos / 60) + (segundos / 3600));
        System.out.println("The Decimal Degrees of Length is: \n" + dd);
    }

    public static void turnLatitudeDMStoDD(Scanner input) {
        double grados;
        double minutos;
        double segundos;
        double dd;
        System.out.println("Enter Degree Value -> ");
        grados = input.nextDouble();
        System.out.println("Enter Minute Value -> ");
        minutos = input.nextDouble();
        System.out.println("Enter Seconds Value -> ");
        segundos = input.nextDouble();
        dd = -(grados + (minutos / 60) + (segundos / 3600));
        System.out.println("The Decimal Degrees of Latitude is: \n"
                + dd);
    }
    

}
        
        
