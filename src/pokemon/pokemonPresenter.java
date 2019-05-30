package pokemon;

public interface pokemonPresenter {

	void showHealth();
	void hasDied();
	void noMoreStates(Pokemon pokemon);
	void isParalized(Pokemon pokemon);
	void isSlept(Pokemon pokemon);
	void isPoisoned(Pokemon pokemon);
}
