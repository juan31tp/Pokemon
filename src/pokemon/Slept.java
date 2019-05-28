package pokemon;

public class Slept implements Status{

	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {
		//PRESENTER "TU POKEMON ESTA DORMIDO Y NO PUEDE ATACAR"
	}

	@Override
	public void resolveStatus(Pokemon pokemon) {
		pokemon.setTurnsAffected(pokemon.getTurnsAffected()-1);
		
		if(pokemon.getTurnsAffected()==0) {
			pokemon.moveToHealthyStatus();
		}
		
	}

}
