package pokemon;

public class Pokemon{

	private int health, speed, turnsAffected;
	private boolean isParalized=false;
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
	
	public void setTurnsAffected(int turnsAffected) {
		this.turnsAffected=turnsAffected;
	}
	
	/* ------------------ GETTERS -----------------*/
	public int getHealth() {
		return health;
	}
	
	public Specie getSpecie() {
		return specie;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public int getTurnsAffected() {
		return turnsAffected;
	}
	
	/* ------------------ ATTACK METHOD -----------------*/
	public void attack(int attack, Pokemon enemy) {
	}
	
	/* ------------------ MOVE BETWEEN DIFFERENT STATUS METHODS -----------------*/
	void moveToParalizedStatus() {
		if(status==healthy) {
			this.status=paralized;
			isParalized=true;
		} else {
			//MSJ: EL POKEMON NO PUEDE TENER MÁS DE UN ESTADO
		}
		
	}
	
	void moveToSleptStatus() {
		if(status==healthy) {
			this.status=slept;
			turnsAffected= (int) ((Math.random() * ((5 - 1) + 1)) + 1);
		} else {
			//MSJ: EL POKEMON NO PUEDE TENER MÁS DE UN ESTADO
		}
	}
	
	void moveToPoisonedStatus() {
		if(status==healthy) {
			this.status=slept;
			turnsAffected= (int) ((Math.random() * ((5 - 1) + 1)) + 1);
		} else {
			//MSJ: EL POKEMON NO PUEDE TENER MÁS DE UN ESTADO
		}
	}
	
	void moveToHealthyStatus() {
		this.status=healthy;
	}


	


	

}
