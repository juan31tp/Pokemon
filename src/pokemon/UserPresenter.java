package pokemon;

public interface UserPresenter {

	/*Request methods*/
	String requestName();
	int requestOption();
	int requestPokemon();
	int requestAttack(Pokemon pokemon);
	
	/*Show methods*/
	void showWinner();
}
