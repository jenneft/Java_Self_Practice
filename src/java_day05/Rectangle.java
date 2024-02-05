package java_day05;

public class Rectangle {
    public static void main(String[] args) {
        int starRow=9;

        for (int i=1; i<=starRow; i++ ){

            for (int j=1; j<starRow; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
