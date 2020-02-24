

public class Flying {
	private String pilot;
	private int numOfPilot;
	private int passengers;
	private String engine;
	private String state;
	
	//Constructor
	public Flying() {
		pilot = "sitting";
		numOfPilot = 2;
		passengers = 4;
		engine = "on";
		state = "took-off";
		
	}
	
	//Parametized Constructor
	public Flying(String pilot, int numOfPilot, int passengers, String engine, String state) {
		this.pilot = pilot;
		this.numOfPilot = numOfPilot;
		this.passengers = passengers;
		this.engine = engine;
		this.state = state;
		
	}
	
	public void setPilot(String pilot) {
		this.pilot = pilot;
		
	}
	
	public String getPilot() {
		return pilot;
		
	}
	
	public void setNumOfPilot(int numOfPilot) {
		this.numOfPilot = numOfPilot;
		
	}
	
	public int getNumofPilot() {
		return numOfPilot;
		
	}
	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
		
	}
	
	public int getPassengers() {
		return passengers;
		
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
		
	}
	
	public String getEngine() {
		return engine;
		
	}
	
	public void setState(String state) {
		this.state = state;
		
	}
	
	public String state() {
		return state;
		
	}
	
	//functionality
	public String onAir() {
		if(pilot.equals("sitting") && (numOfPilot == 2) && 
				(passengers == 4) && engine.equals("on") && state.equals("took-off")) {
			return "Currently on on-air";
		} else {
			return "on hold";
		}
	}

}
