package pokemon;

public interface PresenterView {

	/*Request methods*/
	String requestName();
	int requestOption();
	int requestPokemon(Trainer trainer);
	int requestAttack(Pokemon pokemon);
	
	/*Show methods*/
	void showHealth(Pokemon pokemon);
	void hasDied(Pokemon pokemon);
	void showWinner(Trainer trainer);
	void noMoreStates(Pokemon pokemon);
	void isPoisoned(Pokemon pokemon);
	void isSlept(Pokemon pokemon);
	void isParalized(Pokemon pokemon);
	void dontAttackParalized(Pokemon attacker);
	void lifeLostPoisoned(Pokemon pokemon);
	void dontAttackSlept(Pokemon pokemon);
	
	

}
