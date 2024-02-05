package java_day02;

public class ShippingAddress {
    public static void main(String[] args) {
        String fullName;          fullName="Aaron Kissinger";
        int buildingNumber;       buildingNumber=13621;
        String streetName;        streetName="Legacy Circle";
        String city;              city="Fairfax";
        String state;             state="VA";
        int zipCode;              zipCode=22030;

        System.out.println("Your shipping address is:\n\t\t\t\t"+fullName+
                "\n\t\t\t\t"+buildingNumber+' '+streetName+"\n\t\t\t\t"+city+
                ','+' '+state+' '+zipCode);

    }
}
