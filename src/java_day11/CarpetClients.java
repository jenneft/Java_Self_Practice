package java_day11;

public class CarpetClients {
    public static void main(String[] args) {
        Carpet client1=new Carpet(10,10,15,true);
        System.out.println(client1.toString()+" "+client1.calcCost());

        Carpet client2=new Carpet(30,20,15,false);
        System.out.println(client2.toString()+" "+client2.calcCost());
    }
}
