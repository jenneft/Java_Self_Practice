package java_day12;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setName("Piano");
        item1.setQuantity(2);
        item1.setUnitPrice(1000);
        item1.getName();
        item1.calcCost();
        System.out.println(item1);

        Item item2 = new Item();
        item2.setName("Guitar");
        item2.setQuantity(5);
        item2.setUnitPrice(120);
        item2.getName();
        item2.calcCost();
        System.out.println(item2);

        Item item3 = new Item();
        item3.setName("!@#$%");
        item3.setQuantity(5);
        item3.setUnitPrice(20);
        item3.getName();
        item3.calcCost();
        System.out.println(item3);




    }
}
