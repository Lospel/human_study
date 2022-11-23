package exam14;

public class ActionExam {

	public static void main(String[] args) throws Exception {
		Action a1 =null;
		// 기존의 방법
		a1 = new ReceiveAction();
		a1.execute();
		System.out.println("--------------------");
		
		// 동적 객체 생성.
		String str1 ="exam14.ReceiveAction";
		Class clazz1 = Class.forName(str1);
		Action action1 = (Action) clazz1.newInstance();
		action1.execute();
		System.out.println("--------------------");
		
		
		
		a1 = new ReceiveAction();
		a1.execute();
		a1 = new SendAction();
		a1.execute();
		System.out.println("--------------------");

		
		
		// 변수로 클래스명을 만들어서 자동으로 객체 생성가능.
		// 확장된 클래스로 변경할 때 유용함.
		String[] str2 = {"exam14.SendAction", "exam14.ReceiveAction"};
		
		for (int i=0 ; i<str2.length; i++) {
			Class clazz2 = Class.forName(str2[i]);
			Action action2 = (Action) clazz2.newInstance();
			action2.execute();
		}
		System.out.println("--------------------");

		for (int i=0 ; i<args.length; i++) {
			Class clazz3 = Class.forName(args[i]);
			Action action2 = (Action) clazz3.newInstance();
			action2.execute();
		}
		System.out.println("--------------------");


	}

}
