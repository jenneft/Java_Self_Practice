package java_day07;

public class AddressClients {
    public static void main(String[] args) {
        Address address1=new Address();

        address1.buildingNumber=721;
        address1.street="Pine St";
        address1.city="Seattle";
        address1.state="WA";
        address1.zipCode="98101";

        address1.toString();
        System.out.println(address1);

        Address address2=new Address();

        address2.buildingNumber=1483;
        address2.street="Alaskan Way";
        address2.city="Seattle";
        address2.state="WA";
        address2.zipCode="98101";

        address2.toString();
        System.out.println(address2);



    }
}
