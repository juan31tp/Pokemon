package Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import pokemon.Attack;
import pokemon.Database;
import pokemon.SleptStatus;
import pokemon.Pokemon;
import pokemon.Slept;

class SleptStatusTEST {

	private Pokemon enemy=new Pokemon(Database.INSTANCE.getSpecies().get(1));
	private Pokemon attacker=mock(Pokemon.class);
	private Attack attack=mock(Attack.class);
	private SleptStatus sleptStatus=new SleptStatus();
	
	@Test
	public void attackTEST() {
		
		//Given 	
		//We mock the attack's category
		when(attack.getPrecision()).thenReturn(100);
		//We do the attack previously mocked
		sleptStatus.attack(enemy, attacker, attack);
		//We check if the enemy has the spected status
		assertTrue(enemy.getStatus() instanceof Slept);
	}

}
