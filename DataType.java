public class DataType{
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
		 
