package exam20;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
		double num = 123456.78;

		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num)); // 0의 자리 반올림

		df = new DecimalFormat("0.0");
		System.out.println(df.format(num)); // 0.0의 형태로 반올림 (소수점 첫자리 반올림)

		df = new DecimalFormat("00000000000.0000000000");
		System.out.println(df.format(num)); // 위의 값의 형태로 처리됨

		df = new DecimalFormat("#");
		System.out.println(df.format(num)); // 십진수 표시

		df = new DecimalFormat("#.#");
		System.out.println(df.format(num)); // 십진수 표시

		df = new DecimalFormat("##########.###########");
		System.out.println(df.format(num)); // 가능한 숫자만큼 표시

		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num)); // 음수로 표시함

		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num)); // 콤마표시 (천의 자리 표시)

		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num)); // 지수표시 (10의 6승)

		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num)); // 양수면 + 표시, 음수이면 - 표시

		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num)); // % 표시

		df = new DecimalFormat("\u00A4#,###");
		System.out.println(df.format(num)); // ₩표시 (\u00A4 가 화폐단위 중 원)
	}

}
