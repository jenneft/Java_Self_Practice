package java_day13.state_task;

public class Florida extends State {
    private String capital;

    public Florida(State state, String capital) {
        super(state.getName(), state.getAbbreviation(), state.getPoliticalParty(), state.getGovernor(), state.getSenator(), state.getPopulation());
        this.capital = capital;
    }
    public void displayNicknames(){
        System.out.println("Nickname: The Sunshine State ");
    }
    public void founded(){
        System.out.println("Founded: March 30, 1822.");
    }
    public void motto(){
        System.out.println("Motto: In God We Trust");
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