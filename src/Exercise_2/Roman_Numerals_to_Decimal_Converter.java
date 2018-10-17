package Exercise_2;




import java.util.Scanner;

public class Roman_Numerals_to_Decimal_Converter {

    //The Roman_Numeral_to_Decimal_Converter class scanners...
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        //Variables...
        int decimal;
        String numeral;

        //The print statement to display the Roman Numeral decimal values...
        System.out.println("The decimal values of the roman numerals...\nM = 1000\nD = 500 //No repeat\n" +
                "C = 100\nL = 50 //No repeat\nX = 10\nV = 5 //No repeat\nI = 1");

        /**
         * The print statement to prompts the user to input a Roman Numeral
         * to be converted to its decimal value and then stored into the numeral
         * string variable using the Scanner class's .nextLine() method...
         * */
        System.out.print("Enter a Roman Numeral: ");
        numeral = scan.nextLine();

        /**
         * The Roman class object constructor that passes the numeral
         * string variable value into is parameter...
         * */
        Roman roman = new Roman(numeral);
        decimal = roman.romanToDecimal();

        //This print statement displays the user's capitalized Roman Numeral input and its decimal value...
        System.out.println("You entered Roman Numeral: " + numeral.toUpperCase() + ". Its decimal value is: " + decimal + ".");

    }

}
