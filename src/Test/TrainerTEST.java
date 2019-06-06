package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pokemon.Trainer;
import static org.mockito.Mockito.*;

class TrainerTEST {

	Trainer trainer1=new Trainer();
	
	public void constructorTest() {
		Assertions.assertThrows(NullPointerException.class, () -> new Trainer(null));
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Trainer(""));
	}

	public void assignPokemonTest() {
		trainer1.assignPokemon();
	}
}
