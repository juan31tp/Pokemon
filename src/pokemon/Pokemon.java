package pokemon;

public class Pokemon{

	int health, speed, turnsWithoutPlaying;
	Specie specie;
	
	private Status status;
	private Healthy healthy=new Healthy();
	private Paralized paralized=new Paralized();
	private Slept slept=new Slept();
	private Poisoned poisoned=new Poisoned();
	
	/*This will be the constructor for each pokemon the trainer has*/
	public Pokemon(Specie specie) {
		this.health=specie.getHealth();
		this.speed=specie.getSpeed();
		status=healthy; //We inicialize the status as healthy.
	}
	
	
	/* ------------------ SETTERS -----------------*/
	public void setHealth(int health) {
		this.health=health;
	}
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	/* ------------------ ATTACK METHOD -----------------*/
	public void attack(int attack, Pokemon enemy) {
	}
	
	/* ------------------ MOVE BETWEEN DIFFERENT STATUS METHODS -----------------*/
	void moveToParalizedStatus() {
		this.status=paralized;
	}
	
	void moveToSleptStatus() {
		this.status=slept;
	}
	
	void moveToPoisonedStatus() {
		this.status=poisoned;
	}
	
	void moveToHealthyStatus() {
		this.status=healthy;
	}

}
