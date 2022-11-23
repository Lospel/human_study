package exam06_1;

public class BuyerExam {
	
	public static void main(String[] args) {
//		int tvPrice = 100;
//		int compPrice = 200;
//		int audioPrice = 50;
		Buyer buyer1 = new Buyer(1000);

		Tv tv = new Tv(100, "TV");
		Computer comp = new Computer(200, "COMPUTER");
		Audio audio = new Audio(50, "AUDIO");

		buyer1.buy(tv);
		buyer1.buy(comp);
		buyer1.buy(tv);
		buyer1.buy(audio);
		buyer1.buy(comp);
		buyer1.buy(comp);
		buyer1.buy(comp);
		
		buyer1.summary();
/*		
		Buyer buyer2 = new Buyer(2000);
		buyer2.buy(tv);
		buyer2.buy(comp);
		buyer2.buy(tv);
		buyer2.buy(audio);
		buyer2.buy(comp);
		buyer2.buy(comp);
		buyer2.buy(comp);
		
		buyer2.summary();
*/
	}
}