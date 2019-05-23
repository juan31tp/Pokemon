package pokemon;

public class Pokemon {

	int health, speed, turnsWithoutPlaying;
	Specie specie;
	
	private Status status;
	private Healthy healthy=new Healthy();
	private Paralized paralized=new Paralized();
	private Slept slept=new Slept();
	private Poisoned poisoned=new Poisoned();
	
	/*This will be the constructor for each pokemon the trainer has*/
	public Pokemon(int health, int speed, int turnsWithoutPlaying, Status status, Specie specie) {
		this.health=specie.getHealth();
		this.speed=specie.getSpeed();
		status=healthy; //We inicialize the status as healthy.
	}
	
	
}
