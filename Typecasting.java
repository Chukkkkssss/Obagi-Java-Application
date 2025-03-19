//Time casting is the process of changing from one data type to another.
public class Typecasting{
      public static void main (String[] args){
	        //widening type casting %f
			double weight = 700;
			System.out.printf("Your weight is %.2f%n", weight);
			
			//Narrowing type Casting ASCII code -> ? = 63
			char alpha = '?';
			
			int asciicode = (char)alpha;
			System.out.printf("The ASCII code for ? is %d%n", asciicode);
	    }	
}	