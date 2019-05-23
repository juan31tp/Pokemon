package pokemon;

import java.util.Map;

public class Attack {
	
	private String attackName;
	private int power;
	private int precision;
	private Category category;
	private Type type;


	public Attack(String attackName, int power, int precision, String category, Type type){
		
		this.attackName= attackName;
		this.power=power;
		this.precision=precision;
		this.category=asignCategory(category);
		this.type=type;
	}


	/*This method will asign a category depending on the string*/
	private Category asignCategory(String c) {
		return null;
	}
	
	
}
