package pokemon;

public class Presenter {

	PresenterView view=new View();
	
	Presenter(){
	}
	
	public int requestOption() {
		return view.requestOption();
	}
	
	public String requestName() {
		return view.requestName();
	}
	
	public int requestPokemon() {
		return view.requestPokemon();
	}
	
	public int requestAttack() {
		return view.requestAttack();
	}
	
	public void showHealth(Pokemon pokemon) {
		view.showHealth(pokemon);
	}
	
	public void hasDied(Pokemon pokemon) {
		view.hasDied(pokemon);
	}
	
	public void showWinner(Trainer trainer) {
		view.showWinner(trainer);
	}

	public void noMoreStates(Pokemon pokemon) {
		view.noMoreStates(pokemon);
	}

	public void isPoisoned(Pokemon pokemon) {
		view.isPoisoned(pokemon);
	}

	public void isSlept(Pokemon pokemon) {
		view.isSlept(pokemon);
	}

	public void isParalized(Pokemon pokemon) {
		view.isParalized(pokemon);
	}

	public void dontAttackParalized(Pokemon attacker) {
		view.dontAttackParalized(attacker);
	}

	public void lifeLostPoisoned(Pokemon pokemon) {
		view.lifeLostPoisoned(pokemon);
	}

	public void dontAttackSlept(Pokemon pokemon) {
		view.dontAttackSlept(pokemon);
	}
}
