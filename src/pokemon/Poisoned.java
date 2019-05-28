package pokemon;

public class Poisoned implements Status{

	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {

		Category selectedAttack;
		
		//Método para construir el ataque segun el numero elegido del attacklist de la especie
		selectedAttack=attacker.getSpecie().getAttackList().get(attack).getCategory();
		
		if(selectedAttack instanceof Physical) {
			new Physical().attack(enemy, attacker, attacker.getSpecie().getAttackList().get(attack));
		} else if (selectedAttack instanceof Special) {
			new Special().attack(enemy, attacker, attacker.getSpecie().getAttackList().get(attack));
		} else if (selectedAttack instanceof ParalizedStatus) {
			new ParalizedStatus().attack(enemy, attacker, attacker.getSpecie().getAttackList().get(attack));
		} else if (selectedAttack instanceof SleptStatus) {
			new SleptStatus().attack(enemy, attacker, attacker.getSpecie().getAttackList().get(attack));
		} else if (selectedAttack instanceof PoisonedStatus) {
			new PoisonedStatus().attack(enemy, attacker, attacker.getSpecie().getAttackList().get(attack));
		}
		
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
