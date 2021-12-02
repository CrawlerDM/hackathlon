package Data;

public class Investigation {
    private String ID;
    private String  investigation;
    private String investigationParameters;
    private int attemptsRemaining;
    private  String outcome;


    public Investigation(String ID, String investigation, String investigationParameters, int attemptsRemaining, String outcome) {
        this.ID = ID;
        this.investigation = investigation;
        this.investigationParameters = investigationParameters;
        this.attemptsRemaining = attemptsRemaining;
        this.outcome = outcome;
    }
}
