package java_day11;

public class PizzaClients {
    public static void main(String[] args) {
    Pizza pizza1=new Pizza("small",1,2);
    Pizza pizza2=new Pizza("medium",2,2);
    Pizza pizza3=new Pizza("large",3,3);

        System.out.println(pizza1.toString()+"  $"+pizza1.calcCost());
        System.out.println(pizza2.toString()+"  $"+pizza2.calcCost());
        System.out.println(pizza3.toString()+"  $"+pizza3.calcCost());

        System.out.println(pizza1 + " $" + pizza1.calcCost());

    }
}
