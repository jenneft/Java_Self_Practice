package java_day12;

public class CandyClients {
    public static void main(String[] args) {
        Candy candy1=new Candy();
        Candy candy2=new Candy();
        Candy candy3=new Candy();
        Candy candy4=new Candy();


        candy1.setBrand("Sneakers");
        candy1.getBrand();
        candy1.setPrice(1.55);
        candy1.getPrice();
        candy1.setQuantity(3);
        candy1.getQuantity();
        System.out.println(candy1);

        candy2.setBrand("Mars");
        candy2.getBrand();
        candy2.setPrice(1.99);
        candy2.getPrice();
        candy2.setQuantity(1);
        candy2.getQuantity();
        System.out.println(candy2);

        candy3.setBrand("Skittles");
        candy3.getBrand();
        candy3.setPrice(0);
        candy3.getPrice();
        candy3.setQuantity(1);
        candy3.getQuantity();
        System.out.println(candy3);


    }
}
