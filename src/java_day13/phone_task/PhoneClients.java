package java_day13.phone_task;

public class PhoneClients {
    public static void main(String[] args) {
        IPhone i1 = new IPhone("Apple", "Pro Max 15", "1TB", "Space Gray", 1599);
        IPhone i2 = new IPhone("Apple", "Pro Max 15", "512", "Titanium", 1299);
        System.out.println(i1);
        i1.call("8401914941");
        i1.text("8401914941");
        i1.faceTime("8401914941");
        System.out.println(i2);
        i2.call("8401914941");
        i2.text("8401914941");
        i2.faceTime("8401914941");

        Samsung s1 = new Samsung("Samsung", "GalaxyZ Flip", "256", "White", 1199);
        Samsung s2 = new Samsung("Samsung", "Galaxy S23", "512", "Black", 999);
        System.out.println(s1);
        s1.call("49840184024");
        s1.text("49840184024");
        s1.faceTime("49840184024");
        System.out.println(s2);
        s2.call("49840184024");
        s2.text("49840184024");
        s2.faceTime("49840184024");


        Nokia n1 = new Nokia("Nokia", "2780", "4G", "Red", 89.99);
        Nokia n2 = new Nokia("Nokia", "6300", "8G", "Silver", 99.99);
        System.out.println(n1);
        n1.call("7493754912");
        n1.text("7493754912");
        System.out.println(n2);
        n2.call("7493754912");
        n2.text("7493754912");
    }
}
/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */