package PlayerStat;

public class Driver {

	public static void main(String[] args) {
		
		FootballStats footballPlayer = new FootballStats("John", 10, 20, 10);
        CricketStats cricketPlayer = new CricketStats("Alice", 7, 500, 25);
        
        System.out.println("Football Player Stats:");
        footballPlayer.displayFootballStats();
        
        System.out.println("\nCricket Player Stats:");
        cricketPlayer.displayCricketStats();


	}

}
