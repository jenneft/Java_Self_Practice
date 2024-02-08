package java_day13.state_task;

public class State {
    private String name, abbreviation, politicalParty, Governor, senator;
    private int population;
    private static int tracker=1;

    private boolean isValidString(String str) {
        // Check if the string is not null and not empty after trimming whitespace
        return str != null && !str.trim().isEmpty();
    }

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.politicalParty = politicalParty;
        Governor = governor;
        this.senator = senator;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!isValidString(name)) {
            throw new IllegalArgumentException("Name Field Cannot be null, empty, or blank ");
        } this.name=name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (!isValidString(abbreviation)) {
            throw new IllegalArgumentException("Abbreviation Field Cannot be null, empty, or blank ");
        } this.abbreviation=abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (!isValidString(politicalParty)) {
            throw new IllegalArgumentException("Name Field Cannot be null, empty, or blank ");
        } this.politicalParty=politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (!isValidString(governor)) {
            throw new IllegalArgumentException("Governor Field Cannot be null, empty, or blank ");
        } this.Governor=governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (!isValidString(senator)) {
            throw new IllegalArgumentException("Senator Field Cannot be null, empty, or blank ");
        } this.senator=senator;
    }
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<0){
            throw new IllegalArgumentException("Population Field must not be below Zero ");
    } this.population=population;
}
    public void displayNicknames(){


    }
    public void founded(){

    }

    public void motto(){

    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+tracker++ +"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +',';
    }
}
/*
State Task Requirements:
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.
 */