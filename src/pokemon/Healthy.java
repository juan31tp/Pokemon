package pokemon;

public class Healthy implements Status{
	
	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {
		
		Category selectedAttack;
		
		//We build an attack depending on the selected attack of the attack list of the specie
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

	//As the pokemon is healthy, we dont resolve his status because he won't have any secundary effects
	public void resolveStatus(Pokemon pokemon) {
	}

}
