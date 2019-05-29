package pokemon;

public class PokemonFactoryRandomized extends PokemonFactory{

	public Pokemon create() {

		int rnd;
		
		//We generate a random number to take one specie
		rnd=(int) ((Math.random() * ((database.getSpecies().size() - 1) + 1)) + 1);
		
		return new Pokemon(database.getSpecies().get(rnd));
	}

}
