package java_day9;

public class GroceryItems {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        printArray(items);//prints 10.2 which is separated by \t
        System.out.println("--------------------------------------------------");
        printReversedArray(items);
        System.out.println("--------------------------------------------------");
        printReversedRows(items);

    }

    private static void printArray(String[][] items) {
        for (String[] row : items) {
            for (String columns : row) {
                System.out.print(columns + "\t");
            }
            System.out.println();
        }
    }
    private static void printReversedArray(String[][]swapArray) {

        for (int row = 0; row < swapArray.length; row++) {
            for (int col = swapArray[row].length - 1; col >= 0; col--) {
                System.out.print(swapArray[row][col] + "\t");
            }

            System.out.println();
        }
    }

    private static void printReversedRows(String[][] items) {
        for(int i=items.length-1;i>=0;i--){
            for(int j=0;j<items[i].length;j++){
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
/*
write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };

    10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado

 */