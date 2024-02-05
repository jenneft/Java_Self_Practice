package java_day05;

/*Write a program that can display the alphabet letters from Z to A in
the same line separated by a space. */

public class EnglishAlphabetsBackward {
    public static void main(String[] args) {

        for(char letter='Z';letter>='A';letter--) {
            System.out.print(letter+"\t");
        }

    }
}
