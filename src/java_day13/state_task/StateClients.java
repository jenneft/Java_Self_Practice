package java_day13.state_task;

public class StateClients {
    public static void main(String[] args) {
        State state=new State("Virginia","VA","Democratic","Glenn Youngkin"," Mark Warner",8_642_000);
        Virginia v1=new Virginia(state, "Richmond");
        System.out.println(state+" "+v1);
        v1.displayNicknames();
        v1.founded();
        v1.motto();

        System.out.println("-----------------------------------------------");


        State state1=new State("Texas","TX","Republican","Greg Abbott","Ted Cruz",30_029_572);
        Texas t1=new Texas(state1,"Austin");
        System.out.println(state1+" "+t1);
        t1.displayNicknames();
        t1.founded();
        t1.motto();

        System.out.println("------------------------------------------------");


        State state2=new State("California","CA","Democratic","Gavin Newsom"," Laphonza Butler ",39_240_000);
        California c1=new California(state2,"Austin");
        System.out.println(state1+" "+t1);
        c1.displayNicknames();
        c1.founded();
        c1.motto();

        System.out.println("------------------------------------------------");


        State state3=new State("Florida","FL","Republican","Ron DeSantis","Marco Rubio",21_780_000);
        Texas f1=new Texas(state3,"Tallahassee");
        System.out.println(state3+" "+f1);
        f1.displayNicknames();
        f1.founded();
        f1.motto();




    }
}
