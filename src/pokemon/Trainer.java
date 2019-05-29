package pokemon;

import java.util.List;

public abstract class Trainer {

	String name;
	boolean surrender, teamAlive;
	PokemonFactoryRandomized pokemonFactoryRandomized;
	Presenter presenter=new Presenter();
	List<Pokemon> pokeTeam;
	abstract String requestName();
	abstract int requestOption();
	abstract int requestAttack();
	abstract int requestPokemon();
	abstract boolean surrender();
	
	
	//This method checks if the team is alive, we consider that a team is alive if just one of the pokemons has more than 0 as health
	boolean checkTeamLife() {
		if(this.pokeTeam.get(0).getHealth()>0 || this.pokeTeam.get(1).getHealth()>0 || this.pokeTeam.get(2).getHealth()>0) {
			return true;
		} else {
			return false;
		}
	}
	
	void assignPokemon() {
		
		for(int i=0; i<3; i++) {
			int rnd = (int) (Math.random() * 31) + 1;
			pokeTeam.add(pokemonFactoryRandomized.create());
		}
	}
	

	
}
