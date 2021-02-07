/* Jake Coombes
 * 11/13/18
 * Lab 9 IntConverter:
 * 		This class can take in a decimal number and can
 *		convert it into hex, binary, or Roman Numeral form
 */


package lab9;

public class IntegerConverter {
	
	private IntegerConverter(){
		
	}
	
	public static String toHex(int number)
	{
		String total = "";
		
		//If the number is negative, make it positive
		if(number<0)
		{
			number = number*-1;
		}
		
		do{
			int value = number % 16;
			//If the value of 'value' is greater than 9, assign the appropriate letter
			switch(value)
			{
			case 10:
				total+="A";
				break;
			case 11:
				total+="B";
				break;
			case 12:
				total+="C";
				break;
			case 13:
				total+="D";
				break;
			case 14:
				total+="E";
				break;
			case 15:
				total+="F";
				break;
			default:
				total+=value;
					
			}
			
			//divide out 16 and repeat
			number=number/16;
		}
		while(number!=0);
		
		//reverse the string
		total = (new StringBuilder(total)).reverse().toString();
		return total;
	}
	
	public static String toBinary(int number)
	{
		String total = "";
		
		//Fill in the code here:
		
		//If the number is negative, make it positive
		if(number<0)
		{
			number = number*-1;
		}
				
		/* while the number is not 0 
		 * take the remainder of the number and 2 and add it to the total, 
		 * update the number and continue  
		 */
		
		do {
			int value = number % 2;
			
			total+=value;
			
			//divide out 2 and repeat
			number=number/2;
			
		}while(number!=0);
		
		//reverse the string
		total = (new StringBuilder(total)).reverse().toString();
		
		//return the binary number
		return total;
	}
	
	public static String toRomanNumeral(int number)
	{
		/* 
		 * I = 1
		 * IV = 4
		 * V = 5
		 * IX = 9
		 * X = 10
		 * XL = 40
		 * L = 50
		 * XC = 90
		 * C = 100
		 * CD = 400
		 * D = 500
		 * CM = 900
		 * M = 1000
		 * 
		 * Rules
		 * the numeral I can be placed before V and X to make 4 units (IV) and 9 units (IX) respectively
		 * X can be placed before L and C to make 40 (XL) and 90 (XC) respectively
		 * C can be placed before D and M to make 400 (CD) and 900 (CM) according to the same pattern
		 */
		
		String total = "";
		
//Fill in the code here:
		
		/* if the number is less than the Roman numeral: skip it
		 * otherwise add that Roman numeral to the total and subtract its decimal value, while its greater than the Roman numeral
		 * then move on to the next Roman numeral
		 */
		
		while(number%1000!=number) {
			total+= "M";
			number-=1000;
		}
		while(number%900!=number) {
			total+= "CM";
			number-=900;
		}
		while(number%500!=number) {
			total+= "D";
			number-=500;
		}
		while(number%400!=number) {
			total+= "CD";
			number-=400;
		}
		while(number%100!=number) {
			total+= "C";
			number-=100;
		}
		while(number%90!=number) {
			total+= "XC";
			number-=90;
		}
		while(number%50!=number) {
			total+= "L";
			number-=50;
		}
		while(number%40!=number) {
			total+= "XL";
			number-=40;
		}
		while(number%10!=number) {
			total+= "X";
			number-=10;
		}
		while(number%9!=number) {
			total+= "IX";
			number-=9;
		}
		while(number%5!=number) {
			total+= "V";
			number-=5;
		}
		while(number%4!=number) {
			total+= "IV";
			number-=4;
		}
		while(number%1!=number) {
			total+= "I";
			number-=1;
		}
		
		//return the Roman numeral at the end
		return total;
	}

}