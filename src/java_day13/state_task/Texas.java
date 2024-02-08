package java_day13.state_task;

public class Texas extends State {
    private String capital;
    public Texas(State state,String capital) {
        super(state.getName(), state.getAbbreviation(), state.getPoliticalParty(), state.getGovernor(), state.getSenator(), state.getPopulation());
        this.capital=capital;
    }
    public void displayNicknames(){
        System.out.println("Nickname: The Lone Star State ");
    }
    public void founded(){
        System.out.println("Founded: March 2, 1836");
    }
    public void motto(){
        System.out.println("Motto: Friendship");
    }

    @Override
    public String toString() {
        return "Capital: "+capital+'}';
    }
}
/*
2. Create the following subclasses of the State class:
      - Virginia
      - California
      - Texas
      - Florida
   - Add any additional fields and methods as necessary.
 */