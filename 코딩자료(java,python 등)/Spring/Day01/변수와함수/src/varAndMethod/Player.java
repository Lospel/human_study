package varAndMethod;

public class Player {
	int hp =  100;
	int mana = 20;
	int damage = 10;
	String name;
	public Player(String name) {
		this.name = name;
		
	}
	
	public void attack(Enemy enemy) {
		enemy.hp-=this.damage;
		if(enemy.hp<=0) {
			enemy.hp=0;
		}
		System.out.println(this.name+"이/가 "+enemy.name+"을 공격합니다.");
		System.out.printf("%s은/는 %d의 데이지를 받아 체력이 %d가되었습니다.\r", enemy.name, this.damage,enemy.hp);	
		this.hp+=10;
		this.mana+=5;
	}	
	
	
	public void skill(Enemy enemy) {
		this.mana-=10;
		if (this.mana>=0) {
		System.out.println(this.name+"이/가 "+"스킬⚡⚡⚡⚡⚡⚡을 사용 합니다");
		enemy.hp-=this.damage*2;
		if(enemy.hp<=0) {
			enemy.hp=0;
		}
		System.out.printf("%s은/는 %d의 데이지를 받아 체력이 %d가되었습니다.\r", enemy.name, this.damage,enemy.hp);		
		} else {
			System.out.printf("%s의 마나가 부족하여 공격에 실패했습니다.\r", this.name);
		}
	}
	
	
	public void weaponBox(Arrow arrow, Bat bat, Knife knife) {
		int random = ((int)(Math.random()*100)%3);
		switch(random) {
		case 0:
			this.damage+=arrow.damage;
			System.out.printf("%s가 %s를 장착하였습니다. 공격력이 %d로 증가합니다.\r", this.name, arrow.name, this.damage);
			break;
		case 1:
			this.damage+=bat.damage;
			System.out.printf("%s가 %s를 장착하였습니다. 공격력이 %d로 증가합니다.\r", this.name, bat.name, this.damage);
			break;
		case 2:
			this.damage+=knife.damage;
			System.out.printf("%s가 %s를 장착하였습니다. 공격력이 %d로 증가합니다.\r", this.name, knife.name, this.damage);
			break;
		}				
	}
}
