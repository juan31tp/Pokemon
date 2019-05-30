package pokemon;

public class User extends Trainer{

	String requestName() {
		this.name=presenter.requestName();
	}

	@Override
	int requestOption() {
		option=presenter.requestOption();
	}

	@Override
	int requestAttack() {
		selectedAttack=presenter.requestAttack();
	}

	@Override
	int requestPokemon() {
		this.pokemonSelected=presenter.requestPokemon();
	}

}
