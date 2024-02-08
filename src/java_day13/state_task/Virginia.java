package java_day13.state_task;

public class Virginia extends State {
    private String capital;
    public Virginia(State state,String capital) {
        super(state.getName(),state.getAbbreviation(),state.getPoliticalParty(),state.getGovernor(),state.getSenator(), state.getPopulation());
        this.capital=capital;
    }
    public void displayNicknames(){
        System.out.println("Nickname: Mother of Presidents and The Old Dominion.");
    }
    public void founded(){
        System.out.println("Founded: June 25, 1788 ");
    }
    public void motto(){
        System.out.println("Motto: Sic semper tyrannis");
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