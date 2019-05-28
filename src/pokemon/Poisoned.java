package pokemon;

public class Poisoned implements Status{

	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {
	}

	public void resolveStatus(Pokemon pokemon) {
		pokemon.setTurnsAffected(pokemon.getTurnsAffected()-1);
		
		if(pokemon.getTurnsAffected()==0) {
			pokemon.setHealth(pokemon.getHealth()-(pokemon.getSpecie().getHealth()/8));
			pokemon.moveToHealthyStatus();
		} else {
			pokemon.setHealth(pokemon.getHealth()-(pokemon.getSpecie().getHealth()/8));
		}
	}
	

}
