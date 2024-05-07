package PlayerStat;

public class PlayerStats {
	protected String playerName;
    protected int playerNumber;
    
    public PlayerStats(String playerName, int playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
    }
    
    // Common method for displaying player information
    public void displayPlayerInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Number: " + playerNumber);
    }



}
