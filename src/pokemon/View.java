package pokemon;

import claseTeclado.Colores;
import claseTeclado.Keyboard;

public class View implements PresenterView{

	@Override
	public String requestName() {
		return null;
	}

	@Override
	public int requestOption() {
		return 0;
	}

	@Override
	public int requestPokemon() {
		return 0;
	}

	@Override
	public int requestAttack() {
		return 0;
	}

	
	/* ----------------------------------- */
	
	/*    JUST SENDING MESSAGES METHODS    */
	
	/* ----------------------------------- */
	
	
	//Method that shows the name of the pokemon and the life of it
	public void showHealth(Pokemon pokemon) {
		//If the pokemon's life is bigger than the 70% of his total life, we show it in green
		if(pokemon.getHealth()>0.7*pokemon.getSpecie().getHealth()) {
			System.out.println("The pokemon " + pokemon.getSpecie().getName() + " has " + Colores.VERDE + pokemon.getHealth() + Colores.RESET + " life points");
		//If the pokemon's life is bigger than the 40% of his total life, and smaller than 70%, we show it in yellow
		} else if(0.7*pokemon.getSpecie().getHealth()<pokemon.getHealth() && pokemon.getHealth()>0.4*pokemon.getSpecie().getHealth()) {
			System.out.println("The pokemon " + pokemon.getSpecie().getName() + " has " + Colores.AMARILLO + pokemon.getHealth() + Colores.RESET + " life points");
		} else {
			//If the pokemon's life is smaller than the 40% of his total life, we show it in red
			System.out.println("The pokemon " + pokemon.getSpecie().getName() + " has " + Colores.ROJO + pokemon.getHealth() + Colores.RESET + " life points.");
		}
	}

	//This method announces that a pokemon has died.
	public void hasDied(Pokemon pokemon) {
		System.out.println("The pokemon " + pokemon.getSpecie().getName() + " has died");
	}

	//This method announces what trainer won
	public void showWinner(Trainer trainer) {
		System.out.print(Colores.AZUL + "-------------------------------------------------------\n "+ trainer.name + "HAS WON THE GAME \n-------------------------------------------------------"+ Colores.RESET);
	}

	//This method says that the pokemon can't have more than one status
	public void noMoreStates(Pokemon pokemon) {
		System.out.println(pokemon.getSpecie().getName() + " can't have more than one status!");
	}

	//This method announces that your pokemon is poisoned
	public void isPoisoned(Pokemon pokemon) {
		System.out.println(Colores.MORADO + pokemon.getSpecie().getName() + Colores.RESET + " is now poisoned!");
	}

	//This method announces that your pokemon is slept
	public void isSlept(Pokemon pokemon) {
		System.out.println(Colores.CELESTE + pokemon.getSpecie().getName() + Colores.RESET + " is now sleping zZzZzZ");
	}

	//This method announces that your pokemon is paralized
	public void isParalized(Pokemon pokemon) {
		System.out.println(Colores.AMARILLO + pokemon.getSpecie().getName() + Colores.RESET + " is now paralized!");
	}

	//This method announces that your pokemon is healthy
	public void isHealthy(Pokemon pokemon) {
		System.out.println(Colores.VERDE + pokemon.getSpecie().getName() + Colores.RESET + " is now healthy!");
	}

	//This method announces that your pokemon couldnt attack because he is paralized
	public void dontAttackParalized(Pokemon pokemon) {
		System.out.print("Oh, you couldn't attack because " + Colores.AMARILLO + pokemon.getSpecie().getName() + Colores.RESET + " is paralized!" );
	}

	//This method announces that your pokemon lost life because of poison
	public void lifeLostPoisoned(Pokemon pokemon) {
		System.out.println(Colores.MORADO + pokemon.getSpecie().getName() + Colores.RESET + "lost life because of poison!");
	}

	//This method announces that your pokemon couldnt attack because he is paralized
	public void dontAttackSlept(Pokemon pokemon) {
		System.out.print("Oh, you couldn't attack because " + Colores.CELESTE + pokemon.getSpecie().getName() + Colores.RESET + " is sleeping zZzZzZzZ" );
	}
	
}
