package java_day10;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str="Wooden%Spoon123";
        String[] choppedString=sepatateChars(str);

        System.out.println("Letters: "+choppedString[0]);
        System.out.println("Digits: "+choppedString[1]);
        System.out.println("Special Characters: "+choppedString[2]);



    }

    private static String[] sepatateChars(String string) {
        StringBuffer letters=new StringBuffer();
        StringBuffer digits=new StringBuffer();
        StringBuffer specialChars=new StringBuffer();

        for (char c : string.toCharArray() ) {
            if(Character.isLetter(c)){
                letters.append(c);
            } else if (Character.isDigit(c)){
                digits.append(c);
            }else{
                specialChars.append(c);
            }
        }
        return new String[]{letters.toString(),digits.toString(),specialChars.toString()};

    }}

/*write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

 */