package PlayerStat;

public class FootballStats extends PlayerStats {
	private int goalsScored;
    private int assists;
    
    public FootballStats(String playerName, int playerNumber, int goalsScored, int assists) {
        super(playerName, playerNumber);
        this.goalsScored = goalsScored;
        this.assists = assists;
    }
    
    // Method specific to football for displaying stats
    public void displayFootballStats() {
        displayPlayerInfo();
        System.out.println("Goals Scored: " + goalsScored);
        System.out.println("Assists: " + assists);
    }


}
