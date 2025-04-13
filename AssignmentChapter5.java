import java.util.Scanner;
import java.util.Random;
import java.security.SecureRandom;

public class AssignmentChapter5{}

//5.8 (parking Charges)


class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0;

        while (true) {
            System.out.print("Enter hours parked (-1 to end): ");
            double hours = input.nextDouble();

            if (hours == -1) {
                break;
            }

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Customer charge: $%.2f%n", charge);
            System.out.printf("Running total: $%.2f%n%n", totalReceipts);
        }
    }

    public static double calculateCharges(double hours) {
        double charge = 2.0; // Base fee

        if (hours > 3) {
            charge += Math.ceil(hours - 3) * 0.5;
        }

        return Math.min(charge, 10.0); // Cap charge at $10.00
    }
}


//5.9 (Math Floor)


class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to round (-1 to quit): ");
            double number = input.nextDouble();

            if (number == -1) {
                break;
            }

            double roundedNumber = Math.floor(number + 0.5);
            System.out.printf("Original: %.2f, Rounded: %.0f%n", number, roundedNumber);
        }
    }
}


//5.13 (Intege Power)

class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (integer): ");
        int base = input.nextInt();

        System.out.print("Enter exponent (positive integer): ");
        int exponent = input.nextInt();

        // Call the integerPower method and display result
        int result = integerPower(base, exponent);
        System.out.printf("%d^%d = %d%n", base, exponent, result);
    }

    public static int integerPower(int base, int exponent) {
        int power = 1;

        for (int i = 1; i <= exponent; i++) {
            power *= base; // Multiply base repeatedly
        }

        return power;
    }
}

//5.14 (Hypotenuse Calculation)

class HypotenuseCalculator {
    public static void main(String[] args) {
        // Triangle dimensions from Fig. 5.14
        double[][] triangles = {
            {3.0, 4.0},
            {5.0, 12.0},
            {8.0, 15.0}
        };

        System.out.println("Triangle\tSide 1\tSide 2\tHypotenuse");
        for (int i = 0; i < triangles.length; i++) {
            double side1 = triangles[i][0];
            double side2 = triangles[i][1];
            double hypotenuse = calculateHypotenuse(side1, side2);

            System.out.printf("%d\t\t%.1f\t%.1f\t%.2f%n", i + 1, side1, side2, hypotenuse);
        }
    }

    public static double calculateHypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}

//5.15 (Multiples)

class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two integers (or -1 to quit): ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            if (number1 == -1 || number2 == -1) {
                break;
            }

            boolean result = isMultiple(number1, number2);
            System.out.printf("%d is %sa multiple of %d%n%n", number2, result ? "" : "not ", number1);
        }
    }

    public static boolean isMultiple(int number1, int number2) {
        return number2 % number1 == 0;
    }
}

//5.16 (Even or Odd)

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (-1 to quit): ");
            int number = input.nextInt();

            if (number == -1) {
                break;
            }

            boolean isEven = isEven(number);
            System.out.printf("%d is %s%n%n", number, isEven ? "even" : "odd");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

//5.17 (Displaying a Square of Asterisks)

class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        squareOfAsterisks(side);
    }

    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//5.18 (Displaying a Square of Any Character) 

class SquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        System.out.print("Enter the character to fill the square: ");
        char fillCharacter = input.next().charAt(0);

        squareOfAsterisks(side, fillCharacter);
    }

    public static void squareOfAsterisks(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}


//5.19 (Circle Area)


class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}


//5.20 (Separating Digits)

class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        displayDigits(number);
    }

    // Method to calculate the integer quotient
    public static int quotient(int a, int b) {
        return a / b;
    }

    // Method to calculate the integer remainder
    public static int remainder(int a, int b) {
        return a % b;
    }

    // Method to display digits separated by two spaces
    public static void displayDigits(int number) {
        int divisor = 1;

        while (number / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor >= 1) {
            int digit = quotient(number, divisor);
            System.out.print(digit + "  ");
            number = remainder(number, divisor);
            divisor /= 10;
        }

        System.out.println();
    }
}

//5.21 (Temperature Conversions)

class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option (or -1 to quit):");
            System.out.println("1 - Convert Fahrenheit to Celsius");
            System.out.println("2 - Convert Celsius to Fahrenheit");
            System.out.print("Your choice: ");
            int choice = input.nextInt();

            if (choice == -1) {
                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = input.nextDouble();
                    double celsius = celsius(fahrenheit);
                    System.out.printf("Celsius equivalent: %.2f%n%n", celsius);
                }
                case 2 -> {
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = input.nextDouble();
                    double fahrenheit = fahrenheit(celsius);
                    System.out.printf("Fahrenheit equivalent: %.2f%n%n", fahrenheit);
                }
                default -> System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}

//5.22 (Find the Minimum)


class MinimumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first floating-point number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second floating-point number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter third floating-point number: ");
        double number3 = input.nextDouble();

        double minimumValue = minimum3(number1, number2, number3);
        System.out.printf("The smallest value is: %.2f%n", minimumValue);

    }

    public static double minimum3(double number1, double number2, double number3) {
        return Math.min(Math.min(number1, number2), number3);
    }
}

//5.23 (Perfect Numbers) 

class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");

        for (int number = 1; number <= 1000; number++) {
            if (isPerfect(number)) {
                System.out.printf("%d is a perfect number. Factors: %s%n", number, findFactors(number));
            }
        }
    }

    // Method to determine if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    // Method to find the factors of a number
    public static String findFactors(int number) {
        StringBuilder factors = new StringBuilder();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors.append(i).append(" ");
            }
        }

        return factors.toString().trim();
    }
}

//5.24 (Prime Numbers)

class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:");

        int count = 0; // Count primes
        for (int number = 2; number < 10000; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }

        System.out.printf("%n%nTotal primes less than 10,000: %d%n", count);
    }

    // Part (a): Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) { // Part (c): Testing up to sqrt(number)
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}


//5.25 (Reversing Digits)

class ReversingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int number = input.nextInt();

        int reversedNumber = reverseDigits(number);
        System.out.printf("The reversed number is: %d%n", reversedNumber);
    }

    public static int reverseDigits(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            number /= 10; // Remove last digit
        }

        return reversed;
    }
}

//5.26 (Greatest Common Divisor)

class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        int gcd = gcd(number1, number2);
        System.out.printf("The greatest common divisor of %d and %d is: %d%n", number1, number2, gcd);
    }

    // Method to compute the GCD using Euclid's algorithm
    public static int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}


//5.27 (Quality points)

class QualityPointsApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's average: ");
        int average = input.nextInt();

        int qualityPoints = qualityPoints(average);
        System.out.printf("The quality points for an average of %d is: %d%n", average, qualityPoints);
    }

    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100) {
            return 4;
        } else if (average >= 80 && average <= 89) {
            return 3;
        } else if (average >= 70 && average <= 79) {
            return 2;
        } else if (average >= 60 && average <= 69) {
            return 1;
        } else {
            return 0;
        }
    }
}


//5.28 (Coin Tossing)

class CoinTossing {
    enum Coin { HEADS, TAILS }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("1 - Toss Coin");
            System.out.println("2 - Display Results");
            System.out.println("3 - Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    Coin result = flip(random);
                    if (result == Coin.HEADS) {
                        headsCount++;
                        System.out.println("Result: HEADS");
                    } else {
                        tailsCount++;
                        System.out.println("Result: TAILS");
                    }
                }
                case 2 -> {
                    System.out.printf("HEADS: %d, TAILS: %d%n", headsCount, tailsCount);
                }
                case 3 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }
    }

    public static Coin flip(Random random) {
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }
}


//5.29 (Guess the Number)

class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to 'Guess the Number'!");
        boolean playAgain;

        do {
            int targetNumber = random.nextInt(1000) + 1; // Generate random number between 1 and 1000
            System.out.println("Guess a number between 1 and 1000:");

            int guess;
            do {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                if (guess > targetNumber) {
                    System.out.println("Too high. Try again.");
                } else if (guess < targetNumber) {
                    System.out.println("Too low. Try again.");
                }
            } while (guess != targetNumber);

            System.out.println("Congratulations! You guessed the number!");
            System.out.print("Would you like to play again? (true/false): ");
            playAgain = input.nextBoolean();

        } while (playAgain);

        System.out.println("Thank you for playing!");
    }
}


//5.30 (Guess the Number Modification) 

class GuessTheNumberModification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(1000) + 1; // Generate random number between 1 and 1000
        int guessCount = 0;

        System.out.println("Guess a number between 1 and 1000:");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            guessCount++;

            if (guess > targetNumber) {
                System.out.println("Too high. Try again.");
            } else if (guess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");

                if (guessCount <= 10) {
                    System.out.println("Either you know the secret or you got lucky!");
                } else {
                    System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
                }
                break;
            }
        }

        System.out.printf("Total guesses: %d%n", guessCount);
    }
}


//5.31 (Distance Between Points)

class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter coordinates
        System.out.print("Enter x1, y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate and display the distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("The distance between the points is: %.2f%n", distance);
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}


//5.32 (Craps Game Modification)

class CrapsWithWagering {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000; // Starting bank balance

        while (bankBalance > 0) {
            System.out.printf("Current bank balance: $%d%n", bankBalance);

            // Get a valid wager from the user
            int wager;
            do {
                System.out.print("Enter your wager: ");
                wager = input.nextInt();
                if (wager > bankBalance) {
                    System.out.println("Your wager exceeds your bank balance. Try again.");
                }
            } while (wager > bankBalance);

            // Play one game of craps
            boolean won = playCraps();

            // Adjust bank balance based on the game outcome
            if (won) {
                bankBalance += wager;
                System.out.println("You won! ");
            } else {
                bankBalance -= wager;
                System.out.println("You lost. ");
            }

            // Display updated bank balance or bust message
            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");
                break;
            }

            // Display a random chatter message
            displayChatter();
        }
    }

    public static boolean playCraps() {
        int point = 0;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case 7, 11 -> {
                return true; // Win on first roll
            }
            case 2, 3, 12 -> {
                return false; // Lose on first roll
            }
            default -> {
                point = sumOfDice;
                System.out.printf("Point is set to %d%n", point);
            }
        }

        while (true) {
            sumOfDice = rollDice();
            if (sumOfDice == point) {
                return true; // Win by matching point
            } else if (sumOfDice == 7) {
                return false; // Lose by rolling 7
            }
        }
    }

    public static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        int sum = die1 + die2;

        System.out.printf("You rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void displayChatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!"
        };

        int randomIndex = random.nextInt(messages.length);
        System.out.println(messages[randomIndex]);
    }
}


//5.33 (Table of Binary, Octal and Hexadecimal Numbers)

//Class name: NumberSystemsTable

class  NST{
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%n", "Decimal", "Binary", "Octal", "Hexadecimal");

        for (int i = 1; i <= 256; i++) {
            System.out.printf("%-10d%-10s%-10s%-10s%n",
                    i, Integer.toBinaryString(i), Integer.toOctalString(i), Integer.toHexString(i).toUpperCase());
        }
    }
}


//5.34 (Computer-Assisted Instruction)

//Class Name: Computer Assisted Instruction

class CAI {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication Practice!");
        
        while (true) {
            // Generate and ask a multiplication question
            int num1 = random.nextInt(10); // Random single-digit number
            int num2 = random.nextInt(10); // Random single-digit number

            askQuestion(num1, num2);

            System.out.print("Would you like another question? (yes/no): ");
            String response = input.next();

            if (response.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }

    public static void askQuestion(int num1, int num2) {
        int correctAnswer = num1 * num2;

        while (true) {
            System.out.printf("How much is %d times %d? ", num1, num2);
            int userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Very good!");
                break;
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }
}


//5.35 (Computer-Assisted Instruction: Reducing Student Fatigue) 

//Class name: Computer Assisted Instruction With Responses

class CAIWithResponses {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication Practice!");
        
        while (true) {
            int num1 = random.nextInt(10); // Generate a random single-digit number
            int num2 = random.nextInt(10); // Generate another random single-digit number

            askQuestion(num1, num2);

            System.out.print("Would you like another question? (yes/no): ");
            String response = input.next();

            if (response.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }

    public static void askQuestion(int num1, int num2) {
        int correctAnswer = num1 * num2;

        while (true) {
            System.out.printf("How much is %d times %d? ", num1, num2);
            int userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                displayResponse(true);
                break;
            } else {
                displayResponse(false);
            }
        }
    }

    public static void displayResponse(boolean isCorrect) {
        int responseNumber = random.nextInt(4) + 1; // Generate a number between 1 and 4

        switch (responseNumber) {
            case 1 -> System.out.println(isCorrect ? "Very good!" : "No. Please try again.");
            case 2 -> System.out.println(isCorrect ? "Excellent!" : "Wrong. Try once more.");
            case 3 -> System.out.println(isCorrect ? "Nice work!" : "Don't give up!");
            case 4 -> System.out.println(isCorrect ? "Keep up the good work!" : "Keep trying.");
        }
    }
}
