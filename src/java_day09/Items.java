package java_day09;

public class Items {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        //Find the first index number of "Gloves"
        int index= findIndex(items,"Gloves" );
        System.out.println("index = " + index);

        //Check if "iPad" is contained in the item list.
        boolean isThereIPad=containsItem(items,"iPad");
        System.out.println("isThereIPad = " + isThereIPad);

        //Print the report for each shopping item in the format: name - price - #ID
        printReport(items,prices,itemIDs);
        System.out.println("\nREPORT: \n");

    }



    private static int findIndex(String[]itemToSearch, String elementToFind) {
        for (int i = 0; i < itemToSearch.length; i++) {
            if(itemToSearch[i].equals(elementToFind)){
                return i;
            }
        }
        return -1;
    }

    public static boolean containsItem(String[] array, String element){
        for (String items : array) {
            if(items.equals(element)){
                return true;
            }
        }
        return false;
    }


    private static void printReport(String[] items, double[] prices, int[] itemIDs) {
        for (int i = 0; i < items.length; i++) {

            System.out.println(items[i]+" $"+prices[i]+" "+" "+itemIDs[i]);

        }

    }
}
/*
 write a program with the following specifications:
	5.1 Given arrays with the same length:
		String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
		int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID
 */


            //Misc trial and errors


/* int numberOfElements=items.length;
        System.out.println("Total Elements: " + numberOfElements);
         */

//    private static boolean containsItem(String[] array, String target) {
//        for (String item : array) {
//            if(item.equals(target)){
//                return true;
//            }
//        }
//    return false;
//    }
