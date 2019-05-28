package pokemon;

public class Paralized implements Status{

	@Override
	public void attack(Pokemon attacker, Pokemon enemy, int attack) {
		//SE RESTA VELOCIDAD Y DISMINUYE PROBABILIDAD DE ATACAR
	}

	@Override
	public void resolveStatus(Pokemon pokemon) {
	}


}
