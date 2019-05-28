package pokemon;

import java.util.List;

public class Specie {

	private int id, health, attack, specialAttack, defense, specialDefense, speed;
	private String name;
	Type type, subType;
	private List attackList;
	
	public Specie(String pokemonName, int health, int attack, int defense, int specialAttack, int specialDefense, int speed, Type type, Type subType, List attackList) {
		this.health=health;
		this.attack=attack;
		this.defense=defense;
		this.specialAttack=specialAttack;
		this.specialDefense=specialDefense;
		this.speed=speed;
		this.type=type;
		this.subType=subType;
		this.attackList=attackList;
	}

	public int getHealth() {
		return health;
	}

	public int getSpeed() {
		return speed;
	}

	public Type getType() {
		return type;
	}

	public int getDefense() {
		return defense;
	}
	
	public int getSpecialDefense(){
		return specialDefense;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getSpecialAttack() {
		return specialAttack;
	}
	
}
