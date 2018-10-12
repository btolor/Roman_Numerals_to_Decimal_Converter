package Exercise_2;




import java.util.Scanner;

public class Roman_Numerals_to_Decimal_Converter {

    public static void main(String[] args){
        //Objects...
        Roman romanCoverter = new Roman();
        Scanner scan = new Scanner(System.in);
        //Variables...
        String uInput = "";

        System.out.println("The decimal values of the roman numerals...\nM = 1000\nD = 500 //No repeat\n" +
                "C = 100\nL = 50 //No repeat\nX = 10\nV = 5 //No repeat\nI = 1");
        System.out.print("Enter a Roman Numeral: ");
        uInput = scan.nextLine();

        romanCoverter.romanToDecimal(uInput);
    }

}
