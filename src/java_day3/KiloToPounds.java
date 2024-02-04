package java_day3;
/* Write a program that can convert any given number of kilos to pounds.Example:kg = 10.5
Output: 10.5 kilos is equal to 23.1 pounds Hint:  1kg = 2.2 lb */
public class KiloToPounds {
    public static void main(String[] args) {
        float kg=10.5f;
        float lb=2.2f;
        lb*=kg;
        System.out.println(kg+" kilos is equal to "+lb+" pounds ");



    }
}
