
public class Player {
    private String playerName, playerCountry;
    
    public Player() 
    {
    //this("Sachin");
    System.out.println("Default");
    playerCountry = "India";
    }
    
    public Player(String playerName)
    {
    	this();
    	System.out.println("Parameterized");
    	this.playerName = playerName;
    }
    
    public String toString() {
    	return "Player[playerName = " +playerName+","+" playerCountry = "+ playerCountry+"]";
    }
    
    public static void main(String[] args) {
    	Player p = new Player("Ovi");
    	System.out.println(p);
    }
}
