public class JavaNotes{
	public static void main(String[] args){}
}		

//ESCAPE CHARACTERS:->

// \n :	New line
// \t : Tab (indentation)
// \" : Double Quote
// \' : Single Quote
// \\ : Backlash


class Printmethods{
    public static void main(String[] args){
	   //Using the print(): Prints texts without moving to a new line, Next print would be on the same line.
	
	   System.out.print("Learning about Different Print Methods: ");
	   System.out.print("Learning Java is fun.");
	
	   //Using the Println() : Prints text and moves to a new line. Next Print would be on a new line
	
	   System.out.println("");
	   System.out.println("Java is different from Javascript.");
	   System.out.println("\t This is an Indented Text. ");
	
	   //Using the Printf() or format(): Used for formatted outputs. Allows you to specify formatting, like decimal places, alignments, etc.
	
	   System.out.printf("I am %s and I think I'm %s Java bro, ngl\n", "Chuks","Loving");
	   System.out.printf("I bought my hat for %c%.2f", '$', 356.27863);

	}
}	

class Datatypes{
      public static void main(String[] args){
	     //Integer type (byte,short,int,long. %d)
		 //byte contains values from -250 to 250.
		 byte age = 50;
		 System.out.printf("Mr %s is %d Years old%n","Chinedu",age);
		 
		 //Short contains values from -32,768 to 32,767.
		 
		 short mileage = 30000;
		 System.out.printf("%s bought a vehicle with %d mileage and lied that that it was new, LMAO!%n","Mark", mileage);
		 
		 //int contains values from -2,147,483,648 to 2,147,483,647.
		 int population = 256000000;
		 System.out.printf("As of March 2025, Nigeria's estimated population is approximately %d %s%n",population,"Million");
		 
		 //long contains values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
		 
		 long wp = 8200000000L;
		 System.out.printf("As of %s, the estimated world population is approximately %d %s%n","March 19, 2025",wp,"Billion");
		 
		 //Float point Numbers(float, double %.2f)
		 //Float can contain up to 7 decmal digits
		 
		 float weight = 1315.42F;
		 System.out.printf("The weight of a Toyota Corrolla is %.2f%n",weight);
		 
		 //Double can store up to 15 decimal digits
		 
		 double acctBalance = 487575.94747;
		System.out.printf("Your account balance is %c.%.2f%n",'$',acctBalance);
		
		//boolean type (boolean' contains True or False values. %b)
		
		boolean SOE = true;
		System.out.printf("Is Rivers State currently on State of Emergency? %b%n",SOE);
		
		//Character type(char' Contains letters, Digits, Symbols. %c)
		
		char alpha = '@';
		System.out.printf("My email is fanyanwu383%cgmail.com", alpha);
	    }
}
		 
class Typecasting{
	public static void main(String[] args){
		 //widening type casting %f
			double weight = 700;
			System.out.printf("Your weight is %.2f%n", weight);
			
			//Narrowing type Casting ASCII code -> ? = 63
			char alpha = '?';
			
			int asciicode = (char)alpha;
			System.out.printf("The ASCII code for \"?\" is %d%n", asciicode);
	    }     
}	