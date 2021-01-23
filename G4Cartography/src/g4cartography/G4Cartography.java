
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
                    
        
    }
    
}
