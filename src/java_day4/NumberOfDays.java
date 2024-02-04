package java_day4;

public class NumberOfDays {
    public static void main(String[] args) {
        int month=9;

        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 2, 4, 6, 9, 11:
                System.out.println("30 days");
                break;

            default:
                System.out.println("Invalid Result");

            }
        }
    }

