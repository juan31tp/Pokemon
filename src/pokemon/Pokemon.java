package pokemon;

public class Pokemon implements pokemonPresenter{

	private int health, speed, turnsAffected;
	private boolean isParalized=false;
	Specie specie;
	
	Presenter presenter=new Presenter();
	private Status status;
	private Healthy healthy=new Healthy();
	private Paralized paralized=new Paralized();
	private Slept slept=new Slept();
	private Poisoned poisoned=new Poisoned();
	private Died died=new Died();
	
	/*This will be the constructor for each pokemon the trainer has*/
	public Pokemon(Specie specie) {
		this.health=specie.getHealth();
		this.speed=specie.getSpeed();
		status=healthy; //We inicialize the status as healthy.
		this.specie=specie;
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
	
	public int getSpeed() {
		return speed;
	}
	
	/* ------------------ ATTACK METHOD -----------------*/
	public void attack(int attack, Pokemon enemy){
		status.attack(this, enemy, attack);
	}
	
	/* ------------------ MOVE BETWEEN DIFFERENT STATUS METHODS -----------------*/
	void moveToParalizedStatus() {
		if(status==healthy) {
			this.status=paralized;
			isParalized=true;
			this.speed=speed/2;
			isParalized(this);
		} else {
			noMoreStates(this);
		}
		
	}
	
	void moveToSleptStatus() {
		if(status==healthy) {
			this.status=slept;
			turnsAffected= (int) ((Math.random() * ((5 - 1) + 1)) + 1);
			isSlept(this);
		} else {
			noMoreStates(this);
		}
	}
	
	void moveToPoisonedStatus() {
		if(status==healthy) {
			this.status=poisoned;
			turnsAffected= 5;
			isPoisoned(this);
		} else {
			noMoreStates(this);
		}
	}
	
	void moveToDiedStatus() {
		this.status=died;
		isDied(this);
	}

	void moveToHealthyStatus() {
		this.status=healthy;
	}

	/* ------------------PRESENTER FUNCTIONS -----------------*/
	public void showHealth() {
		presenter.showHealth(this);
	}

	public void hasDied() {
		presenter.hasDied(this);
	}

	public void isParalized(Pokemon pokemon) {
		presenter.isParalized(pokemon);
	}

	public void isSlept(Pokemon pokemon) {
		presenter.isSlept(pokemon);
	}

	public void isPoisoned(Pokemon pokemon) {
		presenter.isPoisoned(pokemon);
	}

	public void noMoreStates(Pokemon pokemon) {
		presenter.noMoreStates(pokemon);
	}

	public void dontAttackParalized(Pokemon pokemon) {
		presenter.dontAttackParalized(pokemon);
	}

	public void lifeLostPoisoned(Pokemon pokemon) {
		presenter.lifeLostPoisoned(pokemon);
	}

	public void dontAttackSlept(Pokemon pokemon) {
		presenter.dontAttackSlept(pokemon);
	}
	
	public void showHurtToTheEnemy(Pokemon enemy, int hurt) {
		presenter.showHurtToTheEnemy(this, enemy, hurt);
	}
	
	private void isDied(Pokemon pokemon) {
		presenter.isDied(pokemon);
	}

	public void attackFailed() {
		presenter.attackFailed(this);
	}

}
