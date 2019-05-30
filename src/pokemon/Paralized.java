package pokemon;

public class Paralized implements Status{

	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {
		
		//We take a random number bewtween 1 and 4, if the number is 1, we dont attack, if it's different, we attack
		int rnd = (int) (Math.random() * 4) + 1;
		
		if(rnd==1) {
			attacker.dontAttackParalized(attacker);
		} else {
			attacker.getSpecie().getAttack(attack).attack(attacker, enemy);
		}
		
		
	}

	public void resolveStatus(Pokemon pokemon) {
	}
}
