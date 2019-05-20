package pokemon;

public abstract class Trainer {

	String name;
	//Pokemon List<Pokemon>;
	PokemonFactory pokemonFactory;
	
	abstract String requestName();
	abstract String requestOption();
	abstract int requestAttack();
	abstract int rrequestPokemon();
	
	void assignStarterPokemons() {
	}
	
}
