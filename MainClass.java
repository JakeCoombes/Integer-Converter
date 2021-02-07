/* Jake Coombes
 * 11/13/18
 * Lab 9 Main:
 * 		This class ask the user for as many numbers as they want 
 * 		and converts it into hex, binary, and Roman numeral form using the IntegerConverter class
 */

package lab9;
import java.util.*;


public class MainClass {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		
		//generate variables
		Scanner input = new Scanner(System.in);
		int num;
		int again=0;
		
		//convert entered numbers into hex, binary, and Roman numerals while the user wants to
		do {
			if(again==1)
				System.out.println("\n******************************************************\n");
			
			System.out.println("Enter a number:");
			num = input.nextInt();
			
			System.out.println("\tHex: " + lab9.IntegerConverter.toHex(num));
			System.out.println("\tBinary: " + lab9.IntegerConverter.toBinary(num));
			System.out.println("\tRoman Numeral: " + lab9.IntegerConverter.toRomanNumeral(num));
			
			System.out.println("\nWould you like to enter another number? (1=yes 0=no)");
			again = input.nextInt();
			
		}while(again==1);
		
		input.close();
	}

}
