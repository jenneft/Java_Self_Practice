package java_day07;

public class ItemClients {
    public static void main(String[] args) {
        Item item1=new Item();

        item1.itemName="IPhone15 Pro Max 512GB";
        item1.unitPrice=1399;
        item1.quantity=17;

        item1.calcCost();
        System.out.println(item1);

        Item item2=new Item();
        item2.itemName="IPhone15 Pro Max 1TB";
        item2.unitPrice=1599;
        item2.quantity=9;

        item2.calcCost();
        System.out.println(item2);

    }
}
