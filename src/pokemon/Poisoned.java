package pokemon;

public class Poisoned implements Status{

	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {

		int rnd = (int) (Math.random() * 100) + 1;
		
		if(rnd <= attacker.getSpecie().getAttack(attack).getPrecision()) {
			attacker.getSpecie().getAttack(attack).attack(attacker, enemy);
		} else {
			attacker.attackFailed();
		}
		
	}

	public void resolveStatus(Pokemon pokemon) {
		pokemon.setTurnsAffected(pokemon.getTurnsAffected()-1);
		
		pokemon.lifeLostPoisoned(pokemon);
		
		if(pokemon.getTurnsAffected()==0) {
			pokemon.setHealth(pokemon.getHealth()-(pokemon.getSpecie().getHealth()/8));
			pokemon.moveToHealthyStatus();
		} else {
			pokemon.setHealth(pokemon.getHealth()-(pokemon.getSpecie().getHealth()/8));
		}
	}
	

}
