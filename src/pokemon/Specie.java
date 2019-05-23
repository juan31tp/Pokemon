package pokemon;

import java.util.List;

public class Specie {

	int id, health, attack, specialAttack, defense, specialDefense, speed;
	String name;
	Type type, subType;
	List attackList;
	
	public Specie(String pokemonName, int health, int attack, int defense, int specialAttack, int specialDefense, int speed, Type type, Type subType, List attackList) {
		this.id=id;
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
		return 0;
	}

	public int getSpeed() {
		return 0;
	}
	
}
