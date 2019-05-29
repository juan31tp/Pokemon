package pokemon;

import java.util.List;

public class Combat {

	Trainer trainer1, trainer2;
	Pokemon pokemon1, pokemon2;
	Presenter presenter;
	
	/* 0. We create the trainers
	 * 		0.1 User will be allowed to choose his nickname
	 * 		0.2 Machine will take a random nickname
	 * 1. We assign three random pokemons to each trainer
	 * 2. Trainers will get out their first pokemon of the list
	 * 		2.1 The first pokemon and it's life is shown
	 * 3. The battle starts and we enter in the turns stage
	 * 		3.1 Trainers choose indepently the movement they want to do
	 * 			3.1.1 If the trainer attacks
	 * 				3.1.1.1 We compare the speed of each pokemon, the one who has the bigger, will use his movement first, then, the other attacks
	 * 				3.1.1.2	We resolve the status of each pokemon at the end of the turn
	 * 			3.1.2 If one trainer decides to change pokemon
	 * 				3.1.2.1 The trainer who changes the pokemon will go first (Speed doesnt matter)
	 * 				3.1.2.2 The other trainer's pokemon will attack the first's new one
	 * 				3.1.2.3 We resolve the status of each pokemon at the end of the turn
	 * 			3.1.3 If one of the trainers surrender, the other automatically wins
	 * 		3.2 If one of the trainer's pokemon is died, he gets out another one (selected by the trainer) This is done before the turn selection starts
	 * 		3.3 If one of the trainers run out of pokemons, the other wins
	 */
	
	Combat(){
		
		//0. We create the trainers
		trainersCreation();
		
		//1. We assign three random pokemons to each trainer
		List<Pokemon> userTeam = null;
		List<Pokemon> machineTeam = null;
		
		userTeam=user.assignPokemon(userTeam);
		machineTeam=assignPokemon(machineTeam);
		
		//2. Trainers will get out their first pokemon of the list
		Pokemon userActualPokemon, machineActualPokemon;
		userActualPokemon=userTeam.get(0);
		machineActualPokemon=machineTeam.get(0);
		
		//2.1 The first pokemon and it's life is shown
		presenter.showHealth(userActualPokemon);
		presenter.showHealth(machineActualPokemon);
		
		
	}

	private void trainersCreation() {
		
		//Trainers building
		User user=new User();
		Machine machine=new Machine();
		
		//0.1 User will be allowed to choose his nickname
		user.setName(trainer.requestName());
		//0.2 Machine will take a random nickname
		machine.setName(machine.requestName());
	}
}
