import kareltherobot.*;


public class Driver implements Directions{

	Robot robbie;// = new Robot(1,1,East, 0);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().start();
	}

	private void start() {
		// TODO Auto-generated method stub
		int size = 7;
		
		
		World.setVisible(true);
		//World.
		//robbie.
		
		turnRight();
		
		
		
		robbie.move();
		robbie.turnLeft();
		System.out.println(robbie.avenue());
		robbie.move();
		robbie.move();
		robbie.pickBeeper();
		System.out.println(robbie.street());
	}
	
	public void turnRight(){
		int turns = 0;
		while(turns<3){
			robbie.turnLeft();
			turns++;
		}
		start();
	}
	
	

}
