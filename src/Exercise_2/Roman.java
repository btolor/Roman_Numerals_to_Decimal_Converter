package Exercise_2;

public class Roman {

    /** The decimal values of the roman numerals...
     * M = 1000
     * D = 500 //No repeat
     * C = 100
     * L = 50 //No repeat
     * X = 10
     * V = 5 //No repeat
     * I = 1
     * */

    //Roman class variables...
    private String romanNumeral;
    private int romanNumeralDecimal = 0;

    //Roman class CONSTRUCTOR...
    public Roman(String romanNumeral){
        /**
         * The Roman class constructor passes an string variable
         * as its parameter and sets the Roman class private string
         * variable as the string variable passed in the parameter
         * using the (this.) keyword...
         * */
        this.romanNumeral = romanNumeral;
    }

    //Roman class getters and setters...
    //This method returns the value of the romanNumeral string variable...
    public String getRomanNumeral() {
        return romanNumeral;
    }
    //This method sets the value of the romanNumeral string variable...
    public void setRomanNumeral(String romanNumeral) {
        this.romanNumeral = romanNumeral;
    }
    //This method returns the value of the romanNumeralDecimal int variable...
    public int getRomanNumeralDecimal() {
        return romanNumeralDecimal;
    }
    //This method sets the value of the romanNumeralDecimal int variable...
    public void setRomanNumeralDecimal(int romanNumeralDecimal) {
        this.romanNumeralDecimal = romanNumeralDecimal;
    }


    /**
     * This method uses a series of if statements and some for loops
     * to convert the romanNumeral string variable in to its decimal
     * value and store it into the romanNumeralDecimal int variable.
     * The method then returns value of the getRomanNumeralDecimal()
     * method...
     * */
    public int romanToDecimal(){
        /**
         * This method has a numeralDecimal int variable that is used to collect
         * the value of the Roman Numeral. A testNumeral string variable that is
         * assigned the return value of the getRomanNumeral() method that is used
         * in the if/else statements to filter through the entered Roman Numeral.
         * */
        int numeralDecimal = 0;
        String testNumeral = getRomanNumeral().toLowerCase();

        /**
         * The if statement check to see if the entered roman numeral starts with
         * cm which is equal to 900, else if the roman numeral starts with m which is
         * equal to 1000. If the numeral starts with cm 900 is added to the
         * numeralDecimal variable and all patterns of dm are replaced with "".
         * If the numeral starts with m a for loop iterates 3 times and if the
         * numeral starts with m 1000 is added to the numeralDecimal variable
         * and the first m in the numeral is replaced with ""*/
        if (testNumeral.startsWith("cm")){
            numeralDecimal += 900;
            testNumeral = testNumeral.replaceAll("cm", "");
        }else if(testNumeral.startsWith("m")){
            for (int i = 0; i < 3; i++){
                if(testNumeral.startsWith("m")){
                    numeralDecimal += 1000;
                    testNumeral = testNumeral.replaceFirst("m", "");
                }
            }
        }

        /**
         * The if statement check to see if the entered roman numeral starts with
         * cd which is equal to 400, else if the roman numeral starts with d which is
         * equal to 500. If the numeral starts with cd 400 is added to the
         * numeralDecimal variable and all patterns of cd are replaced with "".
         * If the numeral starts with d 500 is added to the numeralDecimal variable
         * and all d's in the numeral are replaced with "". Since d cannot be
         * repeated as a roman numeral conversion rule no for loop is needed.
         */
        if (testNumeral.startsWith("cd")){
            numeralDecimal += 400;
            testNumeral = testNumeral.replaceAll("cd", "");
        }else if(testNumeral.startsWith("d")){
            numeralDecimal += 500;
            testNumeral = testNumeral.replaceAll("d", "");
        }

        /**
         * The if statement check to see if the entered roman numeral starts with
         * xc which is equal to 90, else if the roman numeral starts with c which is
         * equal to 100. If the numeral starts with xc 90 is added to the
         * numeralDecimal variable and all patterns of xc are replaced with "".
         * If the numeral starts with c a for loop iterates 3 times and if the
         * numeral starts with c 100 is added to the numeralDecimal variable
         * and the first c in the numeral is replaced with ""*/
        if (testNumeral.startsWith("xc")){
            numeralDecimal += 90;
            testNumeral = testNumeral.replaceAll("xc", "");
        }else if(testNumeral.startsWith("c")){
            for (int i = 0; i < 3; i++){
                if(testNumeral.startsWith("c")){
                    numeralDecimal += 100;
                    testNumeral = testNumeral.replaceFirst("c", "");
                }
            }
        }

        /**
         * The if statement check to see if the entered roman numeral starts with
         * xl which is equal to 40, else if the roman numeral starts with l which is
         * equal to 50. If the numeral starts with xl 40 is added to the
         * numeralDecimal variable and all patterns of xl are replaced with "".
         * If the numeral starts with l 50 is added to the numeralDecimal variable
         * and all l's in the numeral are replaced with "". Since l cannot be
         * repeated as a roman numeral conversion rule no for loop is needed.
         */
        if (testNumeral.startsWith("xl")){
            numeralDecimal += 40;
            testNumeral = testNumeral.replaceAll("xl", "");
        }else if(testNumeral.startsWith("l")){
            numeralDecimal += 50;
            testNumeral = testNumeral.replaceAll("l", "");
        }

        /**
         * The if statement check to see if the entered roman numeral starts with
         * ix which is equal to 9, else if the roman numeral starts with x which is
         * equal to 10. If the numeral starts with ix 9 is added to the
         * numeralDecimal variable and all patterns of ix are replaced with "".
         * If the numeral starts with x a for loop iterates 3 times and if the
         * numeral starts with x 10 is added to the numeralDecimal variable
         * and the first x in the numeral is replaced with ""*/
        if (testNumeral.startsWith("ix")){
            numeralDecimal += 9;
            testNumeral = testNumeral.replaceAll("ix", "");
        }else if(testNumeral.startsWith("x")){
            for (int i = 0; i < 3; i++){
                if(testNumeral.startsWith("x")){
                    numeralDecimal += 10;
                    testNumeral = testNumeral.replaceFirst("x", "");
                }
            }
        }


        /**
         * The if statement check to see if the entered roman numeral starts with
         * iv which is equal to 4, else if the roman numeral starts with v which is
         * equal to 5. If the numeral starts with iv 4 is added to the
         * numeralDecimal variable and all patterns of iv are replaced with "".
         * If the numeral starts with v 5 is added to the numeralDecimal variable
         * and all v's in the numeral are replaced with "". Since d cannot be
         * repeated as a roman numeral conversion rule no for loop is needed.
         */
        if (testNumeral.startsWith("iv")){
            numeralDecimal += 4;
            testNumeral = testNumeral.replaceAll("iv", "");
        }else if(testNumeral.startsWith("v")){
            numeralDecimal += 5;
            testNumeral = testNumeral.replaceAll("v", "");
        }

        /**
         * The if statement check to see if the entered roman numeral starts with
         * i which is equal to 1. If the numeral starts with i a for loop iterates
         * 3 times and if the numeral starts with i 1 is added to the numeralDecimal
         * variable and the first i in the numeral is replaced with "".
         * */
        if(testNumeral.startsWith("i")){
            for (int i = 0; i < 3; i++){
                if(testNumeral.startsWith("i")){
                    numeralDecimal += 1;
                    testNumeral = testNumeral.replaceFirst("i", "");
                }
            }
        }

        /**
         * The romanNumeralDecimal int variable is assigned the value of the
         * numeralDecimal int variable using the setRomanNumeralDecimal() method
         * and the method returns the return value of the getRomanNumeralDecimal()
         * method...
         * */
        setRomanNumeralDecimal(numeralDecimal);
        return getRomanNumeralDecimal();
    }

}
