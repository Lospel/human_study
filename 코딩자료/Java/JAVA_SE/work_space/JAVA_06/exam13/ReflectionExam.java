package exam13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExam {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class clazz = Class.forName("exam04_2.Car");
		
		System.out.println("클래스 정보");
		System.out.println(clazz.getName());
		
		System.out.println("생성자 정보");
		Constructor[] cons = clazz.getDeclaredConstructors();
		for (Constructor c : cons) {
			System.out.print (c.getName() + " : ");
			Class[] params = c.getParameterTypes();
			printParams(params);
		}
		
		System.out.println("필드 정보");
		Field[] fields = clazz.getDeclaredFields();
		for (Field f : fields) {
			System.out.print(f.getName() + " : ");
//			System.out.println(f.getType());
			System.out.println(f.getType().getSimpleName());
		}
		
		System.out.println("메서드 정보");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
			System.out.print(m.getName() + " , ");
			Class[] params = m.getParameterTypes();
			printParams (params);
		}
		System.out.println();
	}

	private static void printParams(Class[] params) {
		for (int i=0; i<params.length; i++) {
			System.out.print(params[i].getName() + " , ");
		}
		System.out.println();
	}

}
