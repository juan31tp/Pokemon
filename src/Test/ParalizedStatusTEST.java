package Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import pokemon.Attack;
import pokemon.Database;
import pokemon.Paralized;
import pokemon.ParalizedStatus;
import pokemon.Pokemon;

class ParalizedStatusTEST {

	private Pokemon enemy=new Pokemon(Database.INSTANCE.getSpecies().get(1));
	private Pokemon attacker=mock(Pokemon.class);
	private Attack attack=mock(Attack.class);
	private ParalizedStatus paralizedStatus=new ParalizedStatus();
	
	@Test
	public void attackTEST() {
		
		//Given 						
		when(attack.getPrecision()).thenReturn(100);
		//When
		paralizedStatus.attack(enemy, attacker, attack);
		//Then
		assertTrue(enemy.getStatus() instanceof Paralized);
	}

}
