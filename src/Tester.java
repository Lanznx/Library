import java.util.ArrayList;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Seat> b1 = new ArrayList<Seat>();
		
		
		Seat[] b0 = new Seat[10]; 
		
		for(int num = 0; num<10; num++) {
//			b1.set(num, new Seat());
			b0[num] = new Seat();
			System.out.println(b0[num].isOccupied());
		}
		
		
	}

}
