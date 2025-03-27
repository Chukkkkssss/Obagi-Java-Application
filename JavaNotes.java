import java.util.Scanner;

public class JavaNotes{
	public static void main(String[] args){}
}		

//ESCAPE CHARACTERS:->

// \n :	New line
// \t : Tab (indentation)
// \" : Double Quote
// \' : Single Quote
// \\ : Backlash

//Primitive Types: ->

//


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
			
			double height = 5.9;
			
			int myHeight = (int)height;
			System.out.printf("My Grand dad's height is %d",myHeight);
	    }     
}	

class Userinput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name =  input.nextLine();
		
		System.out.print("Enter your address: ");
		String address =  input.nextLine();
		
		System.out.print("Enter your age: ");
		byte age =  input.nextByte();
		System.out.println();
		
		System.out.print("Enter your account balance: ");
		float balance = input.nextFloat();
		System.out.println();
		
		System.out.print("You do love doing business with us?(True/False): ");
		boolean choice = input.nextBoolean();
		System.out.println();

		
		System.out.printf("Hello %s, Welcome to my space, How are you today?%n",name);
		System.out.printf("Your address has been Registered as: %s. %n",address);
		System.out.printf("Age: %d years old.%n",age);
		System.out.printf("Your new account Balance is: %c%.2f %n",'$',balance);
		System.out.printf("%s, do you love doing business with us? %b%n",name,choice);
	}
}

class Operators {
    public static void main(String[] args) {
        // Assignment operator (=)
        int num1 = 13;
        int num2 = 5;

        // ARITHMETIC OPERATORS (+, *, -, /, %)
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int quotient = num1 / num2;
        double result = (double) num1 / num2;
        int remainder = num1 % num2;

        // Relational operators (>, <, >=, ==, !=)
        boolean isLessThan = num1 < num2;
        boolean isGreaterThan = num1 > num2;
        boolean isGreaterThanOrEqualTo = num1 >= num2;
        boolean isEqualTo = num1 == num2;
        boolean isNotEqualTo = num1 != num2;

        // Logical operators (&&, ||, !)
        boolean isAndOperator = num1 > num2 && num1 >= num2;
        boolean isOrOperator = num1 == num2 || num1 > num2;
        boolean isNotOperator = !(num1 == num2 || num1 > num2);

        // Output results
        System.out.printf("The sum of the numbers is %d%n", sum);
        System.out.printf("The product of the numbers is %d%n", product);
        System.out.printf("The difference between %d and %d is %d%n", num1, num2, difference);
        System.out.printf("The quotient of the numbers is %d%n", quotient);
        System.out.printf("The result of the numbers is %.2f%n", result);
        System.out.printf("The remainder is %d%n", remainder);
        System.out.println("==========================================================");
        System.out.printf("is %d < %d? %b%n", num1, num2, isLessThan);
        System.out.printf("is %d > %d? %b%n", num1, num2, isGreaterThan);
        System.out.printf("is %d >= %d? %b%n", num1, num2, isGreaterThanOrEqualTo);
        System.out.printf("is %d == %d? %b%n", num1, num2, isEqualTo);
        System.out.printf("is %d != %d? %b%n", num1, num2, isNotEqualTo);
        System.out.println("==========================================================");
        System.out.printf("is %d > %d && %d >= %d? %b%n", num1, num2, num1, num2, isAndOperator);
        System.out.printf("is %d == %d || %d > %d? %b%n", num1, num2, num1, num2, isOrOperator);
        System.out.printf("is !(%d == %d || %d > %d)? %b%n", num1, num2, num1, num2, isNotOperator);
    }
}		


class NestedIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter mark: ");
        int mark = input.nextInt();

        System.out.printf("Candidate name: %s\n", name);
        System.out.printf("Candidate mark: %d\n", mark);

        if (mark >= 80) {
            System.out.printf("Candidate Grade: %c\n", 'A');
        } else if (mark >= 70) {
            System.out.printf("Candidate Grade: %c\n", 'B');
        } else if (mark >= 60) {
            System.out.printf("Candidate Grade: %c\n", 'C');
        } else if (mark >= 50) {
            System.out.printf("Candidate Grade: %c\n", 'D');
        } else if (mark >= 40) {
            System.out.printf("Candidate Grade: %c\n", 'E');
        } else {
            System.out.printf("Candidate Grade: %c\n", 'F');  // Fixed 'A' -> 'F'
        }

        input.close();
    }
}
	

class MobileUSSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display menu options
        System.out.println("Welcome! Please enter a USSD code:");
        System.out.println("*312# - Data Subscription");
        System.out.println("*310# - Check Balance");
        System.out.println("*303# - Borrow Airtime");

        // Get user input
        System.out.print("\nEnter USSD code: ");
        String code = input.nextLine();

        // Switch statement for main menu
        switch (code) {
            case "*312#":
                // Data Subscription Menu
                System.out.println("\n--- Data Subscription Plans ---");
                System.out.println("1. 500MB for 1 day - ₦100");
                System.out.println("2. 2GB for 7 days - ₦500");
                System.out.println("3. 5GB for 30 days - ₦1500");

                System.out.print("\nSelect a plan (1, 2, or 3): ");
                int plan = input.nextInt();

                switch (plan) {
                    case 1:
                        System.out.println("You subscribed to 500MB for 1 day.");
                        break;
                    case 2:
                        System.out.println("You subscribed to 2GB for 7 days.");
                        break;
                    case 3:
                        System.out.println("You subscribed to 5GB for 30 days.");
                        break;
                    default:
                        System.out.println("Invalid selection.");
                }
                break;

            case "*310#":
                // Check Balance
                System.out.println("\n Your current balance is: ₦2,350.50");
                break;

            case "*303#":
                // Loan Menu
                System.out.println("\n--- Borrow Airtime ---");
                System.out.println("1. Borrow ₦100");
                System.out.println("2. Borrow ₦500");
                System.out.println("3. Borrow ₦1000");

                System.out.print("\nSelect amount to borrow (1, 2, or 3): ");
                int loan = input.nextInt();

                switch (loan) {
                    case 1:
                        System.out.println("You borrowed ₦100. Repay on next recharge.");
                        break;
                    case 2:
                        System.out.println("You borrowed ₦500. Repay on next recharge.");
                        break;
                    case 3:
                        System.out.println("You borrowed ₦1000. Repay on next recharge.");
                        break;
                    default:
                        System.out.println("Invalid selection.");
                }
                break;

            default:
                System.out.println("Invalid USSD code entered.");
        }

        input.close(); // Close Scanner
    }
}

class PrintName {
    public static void main(String[] args) {
        
        String name = "Chuks!";
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(name); 
        }
    }
}



class Accept10Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double average;
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Enter num%d: ", i);
            int num = input.nextInt();
            sum += num;
            product *= num;
        }

        average = (double) sum / 10;

        System.out.printf("The sum of the numbers is: %d%n", sum);
        System.out.printf("The average of the numbers is: %.2f%n", average);
        System.out.printf("The product of the numbers is: %d%n", product);

        input.close();
    }
}

//Assignment1: write a program that would print all the even numbers from 1-20.

class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 20:");
        
		for (int i = 2; i <= 20; i += 2) { 
            System.out.println(i);
        }
    }
}

// 2: Write a program to accept 10 numbers from a user and find the sum of 6th to 8th numbers,
// and subtract it from the sum of 4th to 9th an display result.

class RandomArith {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            numbers[i] = input.nextInt();
        }

        int sum6to8 = numbers[5] + numbers[6] + numbers[7];

        int sum4to9 = numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8];

        int result = sum4to9 - sum6to8;

        System.out.println("Result: " + result);

    }
}
