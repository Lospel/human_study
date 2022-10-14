package exam15;

public class StringToLowerUpperCaseExam {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); //==> 대소문자 차이로 false
		
		String lowerStr1 = str1.toLowerCase(); //Java Programming ==> java programming
		System.out.println(lowerStr1);

		String lowerStr2 = str2.toLowerCase(); //JAVA Programming ==> java programming
		System.out.println(lowerStr2);

		System.out.println(lowerStr1.equals(lowerStr2));//==> 둘다 소문자이므로 true
		
		System.out.println(str1.equalsIgnoreCase(str2));//==> equalsIgnoreCase는 대소문자 무시 비교
		
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr2);

		
		
	}

}
