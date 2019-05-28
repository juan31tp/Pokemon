package pokemon;

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
		switch (c) {
		case "ESTADOENV":
			return new PoisonedStatus();
		case "ESTADODOR":
			return new SleptStatus();
		case "FISICO":
			return new Physical();
		case "ESPECIAL":
			return new Special();
		case "ESTADOPAR":
			return new ParalizedStatus();
		default:
			throw new IllegalArgumentException();
		}
	}
	
	
}
