/*
 * 1. 자바가 제공하는 기본타입( 원시 ) >> 8가지 + 1가지(String 야매)
 * 2. 8가지의 타입은 변수안에 값을 저장함
 * 3. 값의 정의는 뭐야? >>(정수, 실수, 논리값) + 문자열
 * 숫자  정수 ( 음, 0, 양의 정수)
 * 		byte (8bit) : -128~127 : 파일 처리 ( 이미지 ) :byte[]
 * 		char (2byte) : 내부적으로 정수 값을 가진다. 한 문자를 표현함
 * 		한글은 1자 : 2byte
 * 		영문자, 특수문자, 공백 : 1byte
 * 		>> 표준화 하여 모든 문자 2byte > unicode>> 아스키 코드표
 * 		ex) char c= 'A'  char ch ='가'
 * 
 * 		int (4byte, 32bit) : -21억~21억 *** [정수 리터럴의 기본 타입은 int다.]
 * 		long
 * 		실수 (부동소수점)
 * 		float : 4byte >> 소수 7자리 표현가능
 * 		double : 8byte 15자리 정도의 소수 표현가능 (정밀도 표현범위가 크다)
 * 		***** [실수 리터럴의 기본타입은 double]
 * 
 * 
 * 		논리 ( True, False )
 * 		
 * 
 * 		+ 1가지 ( String ) 
 * 		문자열을 담을 수 있다.
 * 		String str = "홍길동"
 * 		String 은 클래스입니다.
 * 		ex) String str = new String("홍길동") 
 * 		위와 같이 써야하는데, 설계를 해놨음
 * 		값타입 처럼 써도 문제가 없음
 * 		
 * 		정리)
 * 		자바의 타입은 크게 2개다.
 * 		1. 값 타입 : 8가지 + 1가지 (string) >> 값을 저장(정수, 실수, 논리)
 * 		2. 참조 타입 : 주소를 저장하는거야 ( 메모리의 번지 ) : 클래스, 배열, 인터페이스 etc..
 * 
 * 		다시, 클래스 = 설계도 = 타입
 * 
 * 		[정수 표현 방법]
 * 		100, 123 : 십진수
 * 		0x2a 	 : 16진수 (0x ....)
 * 		0123 	 : 8진수 (0 ....)
 * 		0b11011  : 2진수 (0b ...)
 * 		123L or 123
 * 
 * 		[실수 값 표현]
 * 		3.14
 * 		1233.45
 * 		1.12F
 * 		1.234e^2 >> 123.4 지수 표기법
 * 		1.234e2f
 * 
 * 		[문자 값]
 * 		'a' or '가'
 * 		'\u0065'
 * 
 * 		[진리 값]
 * 		true
 * 		false
 * 		
 * 		[문자열]
 * 		"피곤하다"
 * 
 *  * */





public class Ex02_DataType {

	public static void main(String[] args) {
		int num =100000000;
		System.out.println("num: "+num);
		
//		int num1 = 10000000000;The literal 10000000000 of type int is out of range
		//literal 개발자가 직접 입력한 값 ( 있는 그대로의 값)
		// 컴파일 오류 
		
		//1. 해결방법은 LONG
		Long num1 = 100000000000L;
		// 개발자 입력하는 정수 리터럴의 범위는 int 기본 ( int 범위안에 )
		System.out.println(num1);
		
		long num2= 100;
		// 내부적으로 컴파일러가 
		// long num2= (long)100; >> 암시적 형변환 
		// 값이 int를 벗어나지 않으면 그대로 나오는게 맞다 ㅇㅇ
		
		//작은 방에 큰값을 넣으면 데이터의 손실이 발생된다. 당연하다
		
//		int num4 =100000000000L; //type mismatch
		// 손실 발생, 값의 안정성을 보장 못하기 때문에 해서는 안된다.
		int num4 = (int)100000000000L;
		System.out.println(num4);
		
		//정상적 해결방법이 아니다.
		//그릇을 바꿔야지 내용물을 바꾸면 되겠냐
		
		// 강제 형변환은 좋지않다. 손실이 일어나진않는다.
		int num5 = (int)1000L;
		long num6 = 10000L;
		
		
		char ch='가';
		System.out.println("한문자 : " + ch);
		
//		char ch2='ab';Invalid character constant
		char ch2='a';
		char ch3='b';
		
		// Quiz 기존 자바
		String str = "ABCDEF";
		System.out.println(str.length()); //char[] 배열 
		
		//char 정수 타입 (문자를 저장하지만 내부적으론 정수값을 가지고 있다)
		// 암시적으로 형변환을 하지 컴파일러가 자동으로해줌
		int chint = ch2;
		System.out.println(chint);
		
		int intch2= 65;
//		char chint2 = (char) intch2;//Type mismatch: cannot convert from int to char
		
		//1. 해결 명시적 형변환 데이터 손실이 있을수 있다.
		char chint2 = (char) intch2;
		System.out.println(chint2);
		/*
		 * 1. 할당에 있어서 값을 보지 말고 값이 가지는 타입을 보자
		 * 1-1 리터럴 값에 대해서
		 * 1-1-1 정수 리터럴은 기본 타입 : int
		 * 1-1-2 실수 리터럴의 기본 타입 : double
		 * 
		 * 2. 암시적 형변환 , 명시적 형변환
		 * 2.1 큰 타입에 작은 타입을 넣는건 문제가 x( 컴파일러가 내부적으로 형변환을 해준다.)
		 * 2.2 작은 타입에 큰것을 넣을 려고 한다면 ( 강제적 명시적 형변환 ) : 손실이 날 수도 있다.
		 * 2.2.1 타입을 바꾸는 방법 : 접미사 L,l , F,f (타입)
		 * Key point ) 강제적 형변환 시 데이터 손실 감수냐? 가져갈것이냐. 책임은 개발자 몫
		 * 
		 * 
		 * */
		// 8 + 1 (String)
		// 문자열 다루기 
		String name  = "홍길동";
		name = "홍길동 피곤해";
		String color="red";
		color = color +" yellow";
		System.out.println(name + color);
		
		
		/*
		 * 연산자의 표현이 언어마다 다르다.
		 * JAVA >> + (산술 + 결합 ) >>> 10+10 , "가나","다라"
		 * ORACLE >> + (산술만 ) , 결합 || ,
		 * 
		 * 자바는 타입에 엄격합니다.
		 * 반대는 
		 * JS 
		 * var, let const
		 * 
		 * let i ; >> undefined
		 * i=100;
		 * typeof... 
		 * 
		 * 
		 * 
		 * */
//		 * java에서 특수문자 처리하기
//		 * ex) char sing = ''';
//		 * 이스케이프 문자 : 특정문자열 앞에 \ 다음데이터는 값으로 인정
		 char sing ='\'';
		 System.out.println("sing : " + sing);
		 
		 String userName = "홍\"길\"동";
		 System.out.println("userName :"+ userName);
		 String str1 = "1000";
		 String str2 = "10";
		 // 문자열의 결합은 합해지는거다.
		 String result = str1 + str2;
		 System.out.println("result : " + result);
		 
		 // Quiz 경로 "C:\temp" 문자열을 스트링 변수에 넣어서 그 변수값을 출력하라
		 
		 String path  = "C:\\temp";
		 System.out.println("C path : "+ path);
		 
		 // \t (tab) \n(new line)
		 path ="a\tb\tc\nd\ne";
		 System.out.println("C path : "+ path);
		 
		 //실수형 ( 부동 소수점 )
		 //float (4byte)
		 //double(8byte)
//		 ****** 실수 리터럴의 기본타입은 double이다.
		 
//		 float f=3.14;Type mismatch: cannot convert from double to float
		 // 왜 why? 기본타입이 double인데 float으로 잡았으니 안맞는것.
		 float f = 3.14F; // 데이터 손실 날 가능성을 감수해야한다. 
		 // 현명한 개발자라면 type을 바꾸겠죠?
		 double d =3.14;
		 // 받는 그릇을 크게 하면 되잖아
		 
		 // int 와 float은 같은 크기의 4byte라도 실수가 더 크다.
		 // float , double 중 정밀도가 높은것은 double 당연하지
		 float data = 1.123456789f;
		 System.out.println("float data : " +data);
		 
		 double data1 = 1.123456789123456789;
		 System.out.println("double data : "+ data1);
		 
		 //BigDecimal 사용법 ( 정밀한 수, 정확한 수를 표현하고 싶을때)
		 //Q1 
		 double data2 =100;
		 System.out.println(data2);
		 //Q2
		 double data3 =100;
		 int number = 100;
//		 int result0 = data3 +number;
		 int result1 =(int)data3 + number; // 어거지로 끼워맞추자
		 double result2 = data3 + number; 
		 System.out.println(result1);
		 System.out.println(result2);
		 
		 int number2 = 100;
//		 byte b2 = number2;
		 int b2 = number2;
		 
//		 
//		 1. 큰타입 + 작은타입 연산의 결과 : 큰타입
//		 2. 타입간 변화 >> 변수가 가지는 값을 보지말고 타입을 보자 ( 리터럴 값)
//		 3. 명시적 (강제적) 형변환 데이터 손실을 고민하자
		 
		 
		 
		 
	}

}
