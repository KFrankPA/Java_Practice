package day31_Method_Overriding.states;

public class Pennsylvania extends States{

    private String river;

    public Pennsylvania(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
        setRiver(river);
    }

    public String getRiver() {
        return river;
    }

    public void setRiver(String river) {
        this.river = river;
    }


    @Override
    public String toString() {
        return super.toString()+

                "river='" + river ;

    }
}
