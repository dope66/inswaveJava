/*
 * 클래스 == 설계도 == 데이터 타입
 * 
 *자바는 하나의 물리적인 파일 안에 여러개의 클래스를 생성할 수 있습니다.(연습용으로) 
 * 
 * 
 * */
class Apt{
	//데이터타입 ( 사용자 정의타입) 여러개의 작은 타입을 가지는 큰타입.
	// 설계도는 구체화 되지않으면(메모리에 올라가지 않으면) 의미가 없다.
	// 이거 만드는 목적이 뭐야? 재사용성 때문이야 >> 같은 아파트 지을라고하는거야~
	// 유지보수 : 주석
	String aptName ;// instance Variable , member field
	
}

// deprecated Ex04_Object_Variable
public class Ex04_Object_Variable {
	public static void main(String[] args) {
		
		Apt apt = new Apt(); // 메모리 올렸다.
		/*
		 * Apt는 타입이죠?
		 * apt 변수 , 지역변수 >> 주소값이 저장되어있어. 참조 타입( 값타입의 반대 )
		 * 할당 연산자
		 * new 는 주소를 만드는 연산자
		 * Apt() 설계도 이름
		 * 
		 * */
		
		System.out.println(apt);
		//Apt@7d6f77cc
		//클래스이름 @(문자) + 주소
		Apt apt2 = new Apt(); // 메모리 올렸다.
		System.out.println(apt2);
		
		System.out.println(apt==apt2);// 
		
		Apt apt3 = apt2;// 주소값 할당
		
		System.out.println(apt3==apt2); // 같은 주소다.
		
		apt2.aptName="ss";
		System.out.println(apt3.aptName);
		
		apt2.aptName="YY";
		System.out.println(apt3.aptName);
		int i = 10 ;
		int j = i;
		j = 1000;
		
		//동작 원리
		/*
		 * javac Ex04~.java
		 * 1. Ex04.class
		 * java Ex04 Enter
		 * >> JVM >> os >> 메모리 할당 >> JAVA ( 용도 정리 ) >> 자원할당 >> 프로그램 종료 시
		 * >> 사용했던 메모리 반환 >> OS
		 * 이클립스 ctrl + F11 
		 * 1. main 함수 > local 초기화~~ 종료
		 * 
		 * 
		 * */
		
		
		
	}
}
