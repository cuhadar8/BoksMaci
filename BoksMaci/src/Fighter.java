
public class Fighter {
	
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	
	
	public Fighter(String name, int damage, int health, int weight, int dodge) {
		super();
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;
	}
	
	int hit(Fighter opponent) {
		System.out.println(this.name + " => " + opponent.name + " sporsucuna " + this.damage + " hasar vurdu.");
		if(opponent.isDodge()) {
			System.out.println(opponent.name + " isimli sporcu hasarı blokladı.");
			return opponent.health;
		}
		
		if(opponent.health - this.damage < 0) {
			return 0;
		}
		return opponent.health - this.damage;
	}
	
	boolean isDodge() {
		double randomNumber = Math.random() * 100;
		return randomNumber <= this.dodge;
	}
	
	

}
