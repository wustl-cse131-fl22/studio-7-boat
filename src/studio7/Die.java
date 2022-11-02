package studio7;

public class Die {
	
	private int die;
	
	public Die (int n){
		this.die = n;
	}
	
	public int calculateDie () {
		int randomDie = (int)(Math.random()*die) + 1;
		return randomDie;
	}
	
}
