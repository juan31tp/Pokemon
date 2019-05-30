package pokemon;

import java.util.List;

public abstract class Trainer {

	String name;
	int option, selectedAttack, pokemonSelected;
	boolean surrender, teamAlive;
	PokemonFactoryRandomized pokemonFactoryRandomized;
	Presenter presenter=new Presenter();
	List<Pokemon> pokeTeam;
	abstract String requestName();
	abstract int requestOption();
	abstract int requestAttack();
	abstract int requestPokemon();
	
	
	/*---- BASIC METHOS THAT ARE THE SAME FOR ALL THE TRAINERS ----*/
	
	//This method checks if the team is alive, we consider that a team is alive if just one of the pokemons has more than 0 as health
	boolean checkTeamLife() {
		if(this.pokeTeam.get(0).getHealth()>0 || this.pokeTeam.get(1).getHealth()>0 || this.pokeTeam.get(2).getHealth()>0) {
			return true;
		} else {
			return false;
		}
	}
	
	//This method assigns 3 pokemon to the trainer's team
	void assignPokemon() {
		do {
			Pokemon auxPokemon=pokemonFactoryRandomized.create();
			for(Pokemon pokemon:pokeTeam) {
				if(!auxPokemon.equals(pokemon)) {
					pokeTeam.add(auxPokemon);
				}
			}
			
		} while(pokeTeam.size()<4);
	}
	
	//This method sets the surrender option to true
	void surrender() {
		this.surrender=true;
	}

	
}
