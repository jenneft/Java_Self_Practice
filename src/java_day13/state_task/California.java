package java_day13.state_task;

public class California extends State {
    private String capital;
    public California(State state,String capital) {
        super(state.getName(),state.getAbbreviation(),state.getPoliticalParty(),state.getGovernor(),state.getSenator(),state.getPopulation());
        this.capital=capital;
    }

    public void displayNicknames(){
        System.out.println("Nickname: The Golden State ");
    }
    public void founded(){
        System.out.println("Founded: October 15, 1697");
    }
    public void motto(){
        System.out.println("Motto: Eureka");
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