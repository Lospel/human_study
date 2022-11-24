package Exercise_04;

public class Delivery {

		public String recepitNumber;
		public String call;
		public String address;
		public String receiptDate;
		public String receiptTime;
		public int price;
		public int menuNumber;
	
	public Delivery (String recepitNumber,String call, String address,String receiptDate,String receiptTime,int price,int menuNumber){
		this.recepitNumber=recepitNumber;
		this.call=call;
		this.address=address;
		this.receiptDate=receiptDate;
		this.receiptTime=receiptTime;
		this.price=price;
		this.menuNumber=menuNumber;	
	}

	public void ShowInfo() {
		System.out.printf("%s로 주무접수된 주문은 주소 %s이고, 주문날짜/시간은 %s/%s입니다. \n",this.recepitNumber,this.address,this.receiptDate,this.receiptTime);
		System.out.printf("전화번호는 %s이고, 주문가격은 %d원이며, 메뉴번호는 %d입니다.  \n",this.call,this.price,this.menuNumber);
}
}
