package pokemon;

import java.util.List;

public abstract class Trainer {

	String name;
	PokemonFactoryRandomized pokemonFactoryRandomized;
	Presenter presenter=new Presenter();
	abstract String requestName();
	abstract String requestOption();
	abstract int requestAttack();
	abstract int requestPokemon();
	
	
	List<Pokemon> assignPokemon(List<Pokemon> team) {
		
		for(int i=0; i<3; i++) {
			int rnd = (int) (Math.random() * 31) + 1;
			team.add(pokemonFactoryRandomized.create());
		}
		return team;
	}
	

	
}
