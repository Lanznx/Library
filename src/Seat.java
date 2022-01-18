
public class Seat {

	private boolean occupied;
	private double time;
	
	public Seat() {
		this.occupied = false;
		this.time = 0;
	}
	
	public boolean occupy() {
		return this.occupied = true;
	}
	
	public boolean release() {
		return this.occupied = false;
	}
	
	public void counting() {
		this.time++;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	
	
	
	
	
	
	 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
