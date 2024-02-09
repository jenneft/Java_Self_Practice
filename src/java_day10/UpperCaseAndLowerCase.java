package java_day10;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVA javak";

        System.out.println(checkCondition(str) );
    }

    public static boolean checkCondition(String str) {

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)) {
                if (Character.isUpperCase(each)) {
                    upperCaseCount++;
                } else if (Character.isLowerCase(each)) {
                    lowerCaseCount++;
                }
            }

        }
        return upperCaseCount == lowerCaseCount;

    }
}
/*
2. Write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Example:
	            str = "JAVA java";

	        output:
	            true

 */