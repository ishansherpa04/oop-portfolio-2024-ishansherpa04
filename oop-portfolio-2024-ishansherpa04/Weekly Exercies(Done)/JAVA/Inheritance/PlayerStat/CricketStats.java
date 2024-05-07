package PlayerStat;

public class CricketStats extends PlayerStats {
	private int runsScored;
    private int wicketsTaken;
    
    public CricketStats(String playerName, int playerNumber, int runsScored, int wicketsTaken) 
    {
        super(playerName, playerNumber);
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
    }
    
    // Method specific to cricket for displaying stats
    public void displayCricketStats() {
        displayPlayerInfo();
        System.out.println("Runs Scored: " + runsScored);
        System.out.println("Wickets Taken: " + wicketsTaken);
    }


}
