package pokemon;

public class Paralized implements Status{

	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {

		Category selectedAttack;
	
		//We set the speed to the half of the specie natural speed
		attacker.setSpeed((int) (attacker.getSpecie().getSpeed()*0.5));
		//Método para construir el ataque segun el numero elegido del attacklist de la especie
		selectedAttack=attacker.getSpecie().getAttackList().get(attack).getCategory();
		
		//We take a random number bewtween 1 and 4, if the number is 1, we dont attack, if it's different, we attack
		int rnd = (int) (Math.random() * 4) + 1;
		
		if(rnd==1) {
			//MSJ: TE HAS QUEDADO PARALIZADO
		} else {
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
		
		
	}

	@Override
	public void resolveStatus(Pokemon pokemon) {
	}


}
