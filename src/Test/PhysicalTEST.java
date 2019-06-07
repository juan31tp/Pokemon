package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pokemon.Attack;
import pokemon.Database;
import pokemon.Physical;
import pokemon.Pokemon;
import pokemon.Specie;

import static org.mockito.Mockito.*;
import pokemon.Type;


class PhysicalTEST {

	private Pokemon enemy=new Pokemon(Database.INSTANCE.getSpecies().get(1));
	private Pokemon attacker=mock(Pokemon.class);
	private Specie specie=mock(Specie.class);
	private Attack attack=mock(Attack.class);
	private Type type=mock(Type.class);
	private Physical physical=new Physical();

	@Test
	public void calculateHurtTEST() {
		
		//Given
		when(specie.getType()).thenReturn(type);
		
		when(specie.getAttack()).thenReturn(123);
		when(specie.getType()).thenReturn(type);
		
		when(attack.getPower()).thenReturn(90);
		when(attack.getPrecision()).thenReturn(90);
		when(attack.getType()).thenReturn(type);
		
		when(attacker.getSpecie().getAttack(123)).thenReturn(attack);
		when(attacker.getSpecie()).thenReturn(specie);
		
		physical.attack(enemy, attacker, attack);
		
		assertTrue(enemy.getHealth()>=140 && attacker.getHealth()<=146);
	}
	

}
