import java.util.Random;

public class Match {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	public void run() {
		if(isCheck()) {
			Random random = new Random();
			
			while(this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("#### YENİ RAUND ####");
				int a = random.nextInt(100);     // ilk yumruğu kimin atacağına program %50 şansla kendisi karar verir
				if(a>=50) {
					this.f2.health = this.f1.hit(f2);
					System.out.println(this.f2.name + " isimli sporcunun kalan canı: "+ this.f2.health);
					if(isWin()) {
						break;
					}
				}
				else {
					f1.health = f2.hit(f1);
					System.out.println(this.f1.name + " isimli sporcunun kalan canı: "+ this.f1.health);
					if(isWin()) {
						break;
					}
				}
			}
		}else {
			System.out.println("Sporcuların sikletleri farklı.");
		}
		
	}
	
	boolean isCheck() {
		return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
	}
	
	boolean isWin() {
		if(this.f1.health <= 0) {
			System.out.println(this.f2.name + " maçı kazandı.");
			return true;
		}
		
		if(this.f2.health <= 0) {
			System.out.println(this.f1.name + " maçı kazandı.");
			return true;
		}
		return false;
	}

}
