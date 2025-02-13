import java.util.Scanner;

public class Ex08_Operation_Quiz {
	public static void main(String[] args) {
		int result = 0;
		System.out.print("입력값 : ");
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("사칙연산 기호 : ");
		String calc = sc.nextLine();
		System.out.print("입력값 : ");
		int number1 = Integer.parseInt(sc.nextLine());
//		switch(calc) {
//		case "+":
//			result =number+number1;
//			break;
//		case "-":
//			result =number-number1;
//			break;
//		case "/":
//			result =number/number1;
//			break;
//		case "*":
//			result =number*number1;
//			break;
//		}

		// String 비교는 ==을 쓰지않는다. 값은 같아도 주소가 같지 않을수 있기때문에 equals를 사용해야한다.
		if (calc.equals("+")) {
			result = number + number1;
		} else if (calc.equals("-")) {
			result = number - number1;
		} else if (calc.equals("*")) {
			result = number * number1;
		} else if (calc.equals("/")) {
			result = number / number1;
		}
		System.out.printf("연산결과 : %d", result);

		/*
		 * /* 간단한 사칙 연산기 (+ , - , * , /) 입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환) 목적 :
		 * Integer.parseInt() , ** 구글 java equals() 활용 문자열의 비교**
		 * 
		 * 화면 >입력값:숫자 >입력값(기호): + >입력값:숫자 >연산결과 :200 ------------- >입력값:100 >입력값(기호): -
		 * >입력값:100 >연산결과 :0
		 * 
		 * hint) ■ if문은 조건값이 boolean형, ■ switch문은 정수형(byte, short, int)과 문자형(char),
		 * 문자열(String) ■ long, boolean, float, double형 사용 불가
		 * 
		 * Scanner sc = new Scanner(System.in); String ch = sc.nextLine(); switch (ch) {
		 * case "+":System.out.println("+ 입니다"); break; default:
		 * System.out.println("다른 문자 입니다"); break; } ​
		 */
	}
	
}
