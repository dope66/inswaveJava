import java.util.ArrayList;

public class Ex05_Operator {

	public static void main(String[] args) {
		// 연산자 ( 산술 , 논리 , 관계)
		int result = 100 / 100;
		System.out.println("result : " + result);

		result = 13 / 2;
		System.out.println("result :" + result);

		// 나머지는 %
		result = 13 % 2;
		System.out.println("result :" + result);

		// 증가감 연산자 ( ++, --)

		int i = 10;
		++i; // 전치 증가
		System.out.println("i : " + i);
		i++;// 후치 증가
		System.out.println("i : " + i);
		// 다른 식과 결합 되지 않고 혼자 증가감을 사용하면 전치와 후치 차이가 없다.

		// Point
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result : " + result2);

		result2 = i2 + j2++;
		System.out.println("result : " + result2);

		byte b = 100;
		byte b2 = 1;
		// Today Point
//		byte b3 = b +b2;
		// ***** 자바에서 연산시 (정수) : default로 4byte 공간을 만든다. 거기에 값을 넣고 연산을 한다.
		// byte b3 = int + int
		int b3 = b + b2;
		System.out.println("b3 : " + b3);

		/*
		 * Today Point 1. 정수의 연산은 [int] 타입으로 변환 후 처리. ex) byte + short >>컴파일러가 내부 처리시
		 * int + int char + char >> 컴파일러가 내부 처리시 int + int 정수의 연산에서 int보다 작은 타입은 int로
		 * 바꾸어 연산.
		 * 
		 * char + int >> Int int + int >> int int + Long >> long
		 * 
		 * 2. 정수 + 실수 >> 타입의 크기와 상관없이 >> 실수
		 * 
		 * 변수 -> 타입( 값, 참조 ) -> 연산자( 산술 논리 관계 ) ->제어 ( if for while )
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		// 제어문
		int sum = 0; // local variable 사용전 초기화
		for (int j = 0; j <= 100; j++) {// j라는 변수의 scope ( for안 )
			if (j % 2 == 0) {
				sum += j;
			}
		}
		System.out.println("sum : " + sum);

		// == 값을 비교하는 연산자
		if (10 == 10.0f) { // 타입 ㄴㄴ 값을 비교
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// != 부정연산자
		if ('A' != 65) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// Tip : js ( == , === 값도 같고 타입도 같아야 true)
		// Today point
		// 삼항 연산자...
		int p = 10;
		int k = -10;
		int result5 = (p == k) ? p : k;
		System.out.println("result5 : " + result5);
		/*
		 * 진리표 ( 논리연산 ) 0 : 거짓 (false) 1 : 참 (True) or연산 AND 연산
		 * 
		 * SQL 연산 select * from emp where job ="IT" and sal > 3000 (그리고 둘다 참인 조건 )
		 * 
		 * AND 연산일때 OR 0 0 ->0 0 0 1 ->0 1 1 0 ->0 1 1 1 ->1 1
		 * 
		 * 연산자 비트 연산( | or , & and ) 논리연산 ( || , && )
		 */
		int x = 3;
		int y = 5;
		// 비트 연산 ( 십진수 >> 이진수 연산 )
		System.out.println("x | y : " + (x | y));
		// Today point
		// (&& , || )
//		if(10 > 0 && -1>1 && 100>2 && 1> -1) {A}else {B}
//		if(10 > 0 || -1>1 || 100>2 || 1> -1) {A}else {B}

		// 제어문 >> 연산자 >> 같이
		int data = 90;
		switch (data) {
		case 100:
			System.out.println("100입니다");
		case 90:
			System.out.println("90입니다");
		case 80:
			System.out.println("80입니다");
		default:
			System.out.println("default");

		}

		int data2 = 90;
		switch (data2) {
		case 100:
			System.out.println("100입니다");
			break;
		case 90:
			System.out.println("90입니다");
			break;
		case 80:
			System.out.println("80입니다");
			break;
		default:
			System.out.println("default");

		}
		int month = 3;// month 제공
		String res = "";
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31일";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30일";
			break;
		case 2:
			res = "29일";
			break;
		default:
			res = "월데이터가 없습니다. 1월 부터 12월중 골라주세요";
		}
		System.out.println(res);

		/*
		 * 난수 ( 랜덤 값, 임의의 추출값 ) 구글 GPT 사용없이 >> 자바 학습서 (API) 인터넷 ,로컬도 가능
		 * https://docs.oracle.com/javase/8/docs/api/index.html static 은 new 없이 메모리에 올릴수
		 * 있음, static을 붙힌 이유는 자주 사용할 거같은 곳에 편의상 만든것
		 * 
		 * 검색 : 패키지 ( 종류별로 모인 곳) java.lang.math 클래스 검색 ( 수학적인 다양한 함수 : 절대값 , 최대값, 최소값 등)
		 * import java.lang.* >> 되는데 가독성이 떨어짐 import java.lang.Math 생략가능 자바 사용 시 기본적으로
		 * 열어 놓고 사용. : java.lang.* default
		 * 
		 * 결과 : 0.0 <= random < 1.0
		 * 
		 * 
		 */
		System.out.println("Math random : " + Math.random());
		System.out.println("Math random * 10: " + Math.random() * 10);
		System.out.println("Math int random * 10: " + (int) (Math.random() * 10));
		System.out.println("Math int random * 10: " + (int) ((Math.random() * 10) + 1));

		/*
		 * 우리는 백화점 경품 시스템을 만들려고 한다. 경품 시스템은 나오는 정수에 따라 지급하는 시스템이다.
		 *  경품 추첨시 1000 점수가 나오면
		 * 경품으로 TV Notebook, 냉장고 한우 세트 휴지 
		 * 경품 추첨시 900 점수가 나오면 경품으로 TV Notebook, 냉장고 한우 세트
		 * 휴지 경품 추첨시 800 점수가 나오면 
		 * 경품으로 냉장고 한우 세트 휴지 
		 * 경품 추첨시 700 점수가 나오면 
		 * 경품으로 한우 세트 휴지 경품
		 * 추첨시 600 점수가 나오면 경품으로 휴지 
		 * 경품 추첨시 100~500 까지는 칫솔 
		 * 점수는 100~1000 점까지 한정되어있다. 랜덤 범위
		 * 100~1000까지다.
		 * 
		 * 프로그램 한번 실행시 그때 랜덤 갑이 나오고 그랜덤 값을 출력하면 된다. 최대한 짧은 코드로 ㄱㄱ
		 */
		// 0.0~0.99

		int QuizResult = (int) ((Math.random() * 10) + 1) * 100;
		String msg ="";
		System.out.println("경품 점수 : " + QuizResult);
		msg+="고객님의 점수는 : "+QuizResult+"이고 상품은 :";
		switch (QuizResult) {
		case 1000:
			msg+="TV ";
		case 900:
			msg+="Notebook ";
		case 800:
			msg+="냉장고 ";
		case 700:
			msg+="한우세트 ";
		case 600:
			msg+="휴지 ";
			break;
		default:
			msg+="칫솔";
			break;
		}
		System.out.println(msg);
		/*
		 * LTS
		 * 8, 11버전은
		 * (문자열 비교 가능 )
		 * String result = "";
		 */
	}

	

}
