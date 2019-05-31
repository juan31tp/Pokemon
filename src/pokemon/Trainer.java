package pokemon;

import java.util.ArrayList;
import java.util.List;

public abstract class Trainer {

	String name;
	int option, selectedAttack, pokemonSelected;
	boolean surrender, teamAlive;
	PokemonFactory pokemonFactoryRandomized=new PokemonFactoryRandomized();
	Presenter presenter=new Presenter();
	List<Pokemon> pokeTeam=new ArrayList<Pokemon>();
	abstract String requestName();
	abstract int requestOption();
	abstract int requestAttack(Pokemon pokemon);
	abstract int requestPokemon();
	
	
	/*---- BASIC METHOS THAT ARE THE SAME FOR ALL THE TRAINERS ----*/
	
	//This method checks if the team is alive, we consider that a team is alive if just one of the pokemons has more than 0 as health
	boolean checkTeamLife() {
		if(this.pokeTeam.get(0).getHealth()>0 || this.pokeTeam.get(1).getHealth()>0 || this.pokeTeam.get(2).getHealth()>0) {
			this.teamAlive=true;
			return true;
		} else {
			this.teamAlive=false;
			return false;
		}
	}
	
	//This method assigns 3 pokemon to the trainer's team
	void assignPokemon() {
		
		Pokemon auxPokemon=pokemonFactoryRandomized.create();
		Pokemon auxPokemon2=pokemonFactoryRandomized.create();
		Pokemon auxPokemon3=pokemonFactoryRandomized.create();
		//We assign the first pokemon
		pokeTeam.add(auxPokemon);
		pokeTeam.add(auxPokemon2);
		pokeTeam.add(auxPokemon3);
		
	}
	
	//This method sets the surrender option to true
	void surrender() {
		this.surrender=true;
	}
	
	//This method sets the nickname of each trainer
	void setName() {
		this.name=requestName();
	}
	public String getName() {
		return name;
	}

	
}
