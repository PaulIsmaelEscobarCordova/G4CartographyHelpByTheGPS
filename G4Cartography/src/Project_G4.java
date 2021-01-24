
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
            
    
            case 2:
                do {
                    System.out.println("Surface Area and Perimeter Calculator");
                    System.out.println("Please Choose the Number ->  ");
                    System.out.println("1. -> Perimeter");
                    System.out.println("2. -> Area");
                    System.out.println("0. -> Exit");
                    option = input.nextInt();
        
                    switch(option){
                        
                        case 1:
                            do {
                                System.out.println("Perimeter Calculator");
                                System.out.println("Please Choose the Number -> ");
                                System.out.println("1. ==> 3 Points");
                                System.out.println("2. ==> 4 Points");
                                System.out.println("3. ==> 5 Points");
                                System.out.println("0. ==> Exit");
                                option = input.nextInt();
                                        
                                switch(option){
            
                                    case 1: 
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
                                        per = Math.sqrt((px2 - px1)*(px2 - px1)+(py2 - py1)*(py2 - py1))
                                                +Math.sqrt((px3 - px2)*(px3 - px2)+(py3 - py2)*(py3 - py2))
                                                +Math.sqrt((px1 - px3)*(px1 - px3)+(py1 - py3)*(py1 - py3));
                                        System.out.println("The Perimeter is: \n"
                                        + per);
                                        break;
                                                
                                    case 2: 
                                        double px11;
                                        double px22;
                                        double px33;
                                        double px44;
                                        double py11;
                                        double py22;
                                        double py33;
                                        double py44;
                                        double per2;
                                        
                                        System.out.println("Enter Px1 value -> ");
                                        px11 = input.nextDouble();
                                        System.out.println("Enter Py1 value -> ");
                                        py11 = input.nextDouble();
                                        System.out.println("Enter Px2 value -> ");
                                        px22 = input.nextDouble();
                                        System.out.println("Enter Py2 value -> ");
                                        py22 = input.nextDouble();
                                        System.out.println("Enter Px3 value -> ");
                                        px33 = input.nextDouble();
                                        System.out.println("Enter Py3 value -> ");
                                        py33 = input.nextDouble();
                                        System.out.println("Enter Px4 value -> ");
                                        px44 = input.nextDouble();
                                        System.out.println("Enter Py4 value -> ");
                                        py44 = input.nextDouble();
                                        
                                        per2 = Math.sqrt((px22 - px11)*(px22 - px11)+(py22 - py11)*(py22 - py11))
                                                +Math.sqrt((px33 - px22)*(px33 - px22)+(py33 - py22)*(py33 - py22))
                                                +Math.sqrt((px44 - px33)*(px44 - px33)+(py44 - py33)*(py44 - py33))
                                                +Math.sqrt((px11 - px44)*(px11 - px44)+(py11 - py44)*(py11 - py44));
                                        System.out.println("The Perimeter is: \n"
                                        + per2);
                                        break;
                                    
                                    case 3: 
                                        double px111;
                                        double px222;
                                        double px333;
                                        double px444;
                                        double px555;
                                        double py111;
                                        double py222;
                                        double py333;
                                        double py444;
                                        double py555;
                                        double per3;
                                        
                                        System.out.println("Enter Px1 value -> ");
                                        px111 = input.nextDouble();
                                        System.out.println("Enter Py1 value -> ");
                                        py111 = input.nextDouble();
                                        System.out.println("Enter Px2 value -> ");
                                        px222 = input.nextDouble();
                                        System.out.println("Enter Py2 value -> ");
                                        py222 = input.nextDouble();
                                        System.out.println("Enter Px3 value -> ");
                                        px333 = input.nextDouble();
                                        System.out.println("Enter Py3 value -> ");
                                        py333 = input.nextDouble();
                                        System.out.println("Enter Px4 value -> ");
                                        px444 = input.nextDouble();
                                        System.out.println("Enter Py4 value -> ");
                                        py444 = input.nextDouble();
                                        System.out.println("Enter Px5 value -> ");
                                        px555 = input.nextDouble();
                                        System.out.println("Enter Py5 value -> ");
                                        py555 = input.nextDouble();
                                        
                                        per3 = Math.sqrt((px222 - px111)*(px222 - px111)+(py222 - py111)*(py222 - py111))
                                                +Math.sqrt((px333 - px222)*(px333 - px222)+(py333 - py222)*(py333 - py222))
                                                +Math.sqrt((px444 - px333)*(px444 - px333)+(py444 - py333)*(py444 - py333))
                                                +Math.sqrt((px555 - px444)*(px555 - px444)+(py555 - py444)*(py555 - py444))
                                                +Math.sqrt((px111 - px555)*(px111 - px555)+(py111 - py555)*(py111 - py555));
                                        System.out.println("The Perimeter is: \n"
                                        + per3);
                                        break;
                                        
                                                
                                    case 0:
                                        System.out.println("Good Luck \n");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid option \n");
                                        break;
                                                        
                                } 
                            }while(option != 3);
                            
                            case 2:
                            
                            do {
                                System.out.println("Area Calculator");
                                System.out.println("Please Choose the Number -> ");
                                System.out.println("1. ==> 3 Points");
                                System.out.println("2. ==> 4 Points");
                                System.out.println("3. ==> 5 Points");
                                System.out.println("0. ==> Exit");
                                option = input.nextInt();
                                        
                                switch(option){
            
                                    case 1: 
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
                                        
                                        area = Math.sqrt((px2 - px1)*(px2 - px1)+(py2 - py1)*(py2 - py1))
                                                *Math.sqrt((px3 - px2)*(px3 - px2)+(py3 - py2)*(py3 - py2));
                                                
                                        System.out.println("The Area is: \n"
                                        + area/2);                                        
                                        break;
                                                
                                    case 2: 
                                        double px11;
                                        double px22;
                                        double px33;
                                        double px44;
                                        double py11;
                                        double py22;
                                        double py33;
                                        double py44;
                                        double area2;
                                        
                                        System.out.println("Enter Px1 value -> ");
                                        px11 = input.nextDouble();
                                        System.out.println("Enter Py1 value -> ");
                                        py11 = input.nextDouble();
                                        System.out.println("Enter Px2 value -> ");
                                        px22 = input.nextDouble();
                                        System.out.println("Enter Py2 value -> ");
                                        py22 = input.nextDouble();
                                        System.out.println("Enter Px3 value -> ");
                                        px33 = input.nextDouble();
                                        System.out.println("Enter Py3 value -> ");
                                        py33 = input.nextDouble();
                                        System.out.println("Enter Px4 value -> ");
                                        px44 = input.nextDouble();
                                        System.out.println("Enter Py4 value -> ");
                                        py44 = input.nextDouble();
                                        
                                        area2 = Math.sqrt((px22 - px11)*(px22 - px11)+(py22 - py11)*(py22 - py11))
                                                *Math.sqrt((px33 - px22)*(px33 - px22)+(py33 - py22)*(py33 - py22));
                                        System.out.println("The Area is: \n"
                                        + area2);
                                        break;
                                        
                                    case 3: 
                                        double px111;
                                        double px222;
                                        double px333;
                                        double px444;
                                        double px555;
                                        double py111;
                                        double py222;
                                        double py333;
                                        double py444;
                                        double py555;
                                        double area3;
                                        
                                        System.out.println("Enter Px1 value -> ");
                                        px111 = input.nextDouble();
                                        System.out.println("Enter Py1 value -> ");
                                        py111 = input.nextDouble();
                                        System.out.println("Enter Px2 value -> ");
                                        px222 = input.nextDouble();
                                        System.out.println("Enter Py2 value -> ");
                                        py222 = input.nextDouble();
                                        System.out.println("Enter Px3 value -> ");
                                        px333 = input.nextDouble();
                                        System.out.println("Enter Py3 value -> ");
                                        py333 = input.nextDouble();
                                        System.out.println("Enter Px4 value -> ");
                                        px444 = input.nextDouble();
                                        System.out.println("Enter Py4 value -> ");
                                        py444 = input.nextDouble();
                                        System.out.println("Enter Px5 value -> ");
                                        px555 = input.nextDouble();
                                        System.out.println("Enter Py5 value -> ");
                                        py555 = input.nextDouble();
                                        
                                        area3 = (Math.sqrt((px222 - px111)*(px222 - px111)+(py222 - py111)*(py222 - py111))
                                                *Math.sqrt((px333 - px222)*(px333 - px222)+(py333 - py222)*(py333 - py222)))/2
                                                +(Math.sqrt((px444 - px333)*(px444 - px333)+(py444 - py333)*(py444 - py333))
                                                *Math.sqrt((px555 - px444)*(px555 - px444)+(py555 - py444)*(py555 - py444)))/2;                                               
                                        System.out.println("The Area is: \n"
                                        + area3);
                                        break;
                                        
                                                
                                    case 0:
                                        System.out.println("Good Luck \n");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid option \n");
                                        break;
                                                        
                                } 
                            }while(option != 3);
                                    
                            
                            
                        case 0:
                            System.out.println("Good Luck \n");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid option \n");
                            break;
                        
                    }
                
                } while(option != 6); 
            
            
            
            case 0:
                System.out.println("Thanks for using our Aplication ");
                System.out.println("Good Luck");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option \n");
                break;                    
        }
    } while(option != 2);       
    
    
    
    }
    
}
