package com.sbcc.model;



/*The class and methods should be declared as public 
and all the attributes should be declared as private.*/

public abstract class Player {

	// Include all attributes, getters, setters and constructors as specified in the requirement document
	private String playerId;
	private String playerName;
	private int matchesPlayed;
	private int runScored;
	private String playingZone;
	
	public void setPlayerId(String playerId)
	{
	    this.playerId = playerId;
	}
	public void setPlayerName(String playerName)
	{
	    this.playerName = playerName;
	}
	public void setMatchesPlayed(int matchesPlayed)
	{
	    this.matchesPlayed = matchesPlayed;
	}
	public void setRunScored(int runScored)
	{
	    this.runScored = runScored;
	}
	public void setPlayingZone(String playingZone)
	{
	    this.playingZone = playingZone;
	}
	
	public String getPlayerId()
		{
		    return playerId;
		}
	public String getPlayerName()
	{
	    return playerName;
	}
	public int getMatchesPlayed()
	{
	    return matchesPlayed;
	}
	public int getRunScored()
	{
	    return runScored;
	}
	public String getPlayingZone()
	{
	    return playingZone;
	}
	
	public Player()
	{
	    
	}
	public Player(String playerId , String playerName , int matchesPlayed , int runScored , String playingZone)
	{
	    this.playerId = playerId;
	    this.playerName = playerName;
	    this.matchesPlayed = matchesPlayed;
	    this.runScored = runScored;
	    this.playingZone = playingZone; 
	}
	
	public int calculateTotalRuns(String[] securedRuns)
	{
	    int sum=0;
	    for(String r : securedRuns)
	    {
	        sum += Integer.parseInt(r);
	    }
	    return sum;
	    
	}
	public abstract void findStarRating();
}
