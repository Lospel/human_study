package varAndMethod;

public class Enemy {
	int hp = 150;
	int mana = 20;
	int damage = 10;
	
	String name;


	
	public Enemy(int hp, int mana, int damage, String name) {
		super();
		this.hp = hp;
		this.mana = mana;
		this.damage = damage;
		this.name = name;
	}



	public void attack(Player player) {
		player.hp-=this.damage;
		if(player.hp<=0) {
			player.hp=0;
		}
		System.out.println(this.name+"이/가 "+player.name+"을 공격합니다.");
		System.out.printf("%s은/는 %d의 데이지를 받아 체력이 %d가 되었습니다.\r", player.name, this.damage, player.hp);
		this.hp+=3;
		this.mana+=8;
	
	}
	
	public void skill(Player player) {
		this.mana-=10;
		if (this.mana>=0) {
		System.out.println(this.name+"이/가 "+"스킬🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥을 사용합니다.");
		player.hp-=this.damage*2;
		if(player.hp<=0) {
			player.hp=0;
		}
		System.out.printf("%s은/는 %d의 데이지를 받아 체력이 %d가되었습니다.\r", player.name, this.damage, player.hp);		
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
