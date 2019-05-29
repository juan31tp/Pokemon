package pokemon;

public class Healthy implements Status{
	
	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {
	
		attacker.getSpecie().getAttack(attack).attack(attacker, enemy);
		
	}

	//As the pokemon is healthy, we dont resolve his status because he won't have any secundary effects
	public void resolveStatus(Pokemon pokemon) {
	}

}
