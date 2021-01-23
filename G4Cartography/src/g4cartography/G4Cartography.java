
package g4cartography;
import java.util.Scanner;
public class G4Cartography {

   
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
    
    do {
        System.out.println(""
                + "  =============================================================================================\n" +
" | ******************************************************************************************* |\n" +
" | *  =====================================================================================  * |\n" +
" | * | 											   | * | \n" +
" | * |  _____            _                              _     _        _   _      _        | * | \n" +
" | * | /  __ \\          | |                            | |   (_)      | | | |    | |       | * |  \n" +
" | * | | /  \\/ __ _ _ __| |_ ___   __ _ _ __ __ _ _ __ | |__  _  ___  | |_| | ___| |_ __   | * | \n" +
" | * | | |    / _` | '__| __/ _ \\ / _` | '__/ _` | '_ \\| '_ \\| |/ __| |  _  |/ _ \\ | '_ \\  | * | \n" +
" | * | | \\__/\\ (_| | |  | || (_) | (_| | | | (_| | |_) | | | | | (__  | | | |  __/ | |_) | | * | \n" +
" | * |  \\____/\\__,_|_|   \\__\\___/ \\__, |_|  \\__,_| .__/|_| |_|_|\\___| \\_| |_/\\___|_| .__/  | * | \n" +
" | * |                             __/ |         | |                               | |     | * | \n" +
" | * |                            |___/          |_|                               |_|     | * | \n" +
" | * | 											   | * | \n" +
" | * |*************************************************************************************| * |\n" +
" | * |		 Welcome to Cartographic Help to \"LOS GPS\"				   | * |\n" +
" | * |  	 Please Choose the literal to Help You 		   			   | * |\n" +
" | * |   	 1. ==> Coordinate Conversion				   		   | * |\n" +
" | * |   	 2. ==> Surface Area and Perimeter Calculator		   		   | * |\n" +
" | * |   	 0. ==> Exit						   		   | * |\n" +
" | * |							 				   | * |\n" +
" | *  =====================================================================================  * |\n" +
" | ********************************************************************** \" LOS GPS \" ******** |\n" +
"  =============================================================================================");
        option = input.nextInt();
        
        switch(option){
            
            case 1:                
    
                do {
                    System.out.println("Coordinate Conversion");
                    System.out.println("Please Choose the Number -> ");
                    System.out.println("1. ==>D.M.S.(Degrees, Minutes, Seconds) to Decimal Degrees ");
                    System.out.println("2. ==>Decimal Degrees to UTM (X,Y)");
                    System.out.println("0. ==> Exit");                   
                    option = input.nextInt();
                    
                            switch(option){
                        
                        case 1:
                            do {
                                System.out.println("D.M.S.(Degrees, Minutes, Seconds) to Decimal Degrees");
                                System.out.println("Please Choose the Number -> ");
                                System.out.println("1. ==> Latitude");
                                System.out.println("2. ==> Length");
                                System.out.println("0. ==> Exit");
                                option = input.nextInt();
                                        
                                switch(option){
            
                                    case 1: 
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
                                        dd = -(grados + (minutos/60) + (segundos/3600));
                                        System.out.println("The Decimal Degrees of Latitude is: \n"
                                        + dd);
                                        break;
                                                
                                    case 2: 
                                        double grados1;
                                        double minutos1;
                                        double segundos1;
                                        double dd1;
                                        System.out.println("Enter Degree Value -> ");
                                        grados1 = input.nextDouble();
                                        System.out.println("Enter Minute Value -> ");
                                        minutos1 = input.nextDouble();
                                        System.out.println("Enter Seconds Value -> ");
                                        segundos1 = input.nextDouble();
                                        dd1 = -(grados1 + (minutos1/60) + (segundos1/3600));
                                        System.out.println("The Decimal Degrees of Length is: \n" + dd1);
                                        break;
                                                
                                    case 0:
                                        System.out.println("Good Luck \n");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid option \n");
                                        break;
                                                        
                                } 
                            }while(option != 2);
                                    
                        case 2:
                            do {
                                System.out.println("Decimal Degrees to UTM (X,Y)");
                                System.out.println("Please Choose the Number -> ");
                                System.out.println("1. ==> Latitude");
                                System.out.println("2. ==> Length");
                                System.out.println("0. ==> Exit");
                                option = input.nextInt();
                                        
                                switch(option){
            
                                    case 1: 
                                        double latitud;
                                        double x;
                                        System.out.println("Enter Latitude Value -> ");
                                        latitud = input.nextDouble();
                                        x = -(latitud * 2261291.013);
                                        System.out.println("The X Coordinate is: \n"
                                        + x);
                                        break;
                                                
                                    case 2: 
                                        double longitud;
                                        double y;
                                        System.out.println("Enter Length Value -> ");
                                        longitud = input.nextDouble();
                                        y = -(longitud * 126798.6481);
                                        System.out.println("The Y Coordinate is: \n"
                                        + y);
                                        break;
                                                
                                    case 0:
                                        System.out.println("Good Luck \n");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid option \n");
                                        break;

                                } 
                            }while(option != 2);    
                            
                        case 0:
                            System.out.println("Good Luck \n");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid option \n");
                            break;
                        
                    }                
                }while(option != 2);
    }
    
}
