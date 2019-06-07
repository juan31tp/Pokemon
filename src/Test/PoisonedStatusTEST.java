package Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import pokemon.Attack;
import pokemon.Database;
import pokemon.Poisoned;
import pokemon.PoisonedStatus;
import pokemon.Pokemon;

class PoisonedStatusTEST {

	private Pokemon enemy=new Pokemon(Database.INSTANCE.getSpecies().get(1));
	private Pokemon attacker=mock(Pokemon.class);
	private Attack attack=mock(Attack.class);
	private PoisonedStatus poisonedStatus= new PoisonedStatus();
	
	@Test
	public void attackTEST() {
		
		//Given 	
		//We mock the attack's category
		when(attack.getPrecision()).thenReturn(100);
		//When
		//We do the attack previously mocked
		poisonedStatus.attack(enemy, attacker, attack);
		//Then
		//We check if the enemy has the spected status
		assertTrue(enemy.getStatus() instanceof Poisoned);
	}

}
