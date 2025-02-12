/*
 * 자바 핼로우.자바 컴파일
 * 자바 핼로우 실행
 * 
 * 이클립스 : ctrl + f11 >> 컴파일 + 실행결과 출력해줌
 * 
 * 클래스 종류
 * 1. main 함수가 없는 클래스 ( 독자적 실행 x , 도와주는 클래스 lib)
 * 		class Car {int door;}
 * 2. main 함수가 있는 클래스 ( 독자적 실행 o  -> new 없이 실행 가능 -> 독자적으로 memory에 상주가능 뭐때문? static 때문)
 * 
 * 질문 ) 
 * src 폴더 안에 
 * Ex01.java 존재 .. Ex01.java 파일 만들수 있어?
 * 
 * nameSpace : 이름공간 : package : 자바는 기본적으로 클래스 관리 package 안에서 관리( 폴더 단위 관리 )
 * 
 * 
 * 
 * */
import kr.or.kosa.Car;
import kr.or.kosa.Emp;
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("hello");
		// Emp 클래스 사용 (여기서 사용은 메모리에 올린다는 뜻)
		// new 연사자
		Emp emp = new Emp();
		//Emp 타입 ( 정수, 실수... 사용자 정의 타입 ) 
		// emp 변수 ( 메모리 공간의 이름이다. ) 
		// = 할당 연산자
		// new 객체를 만드는 연산자(아파트 짓는거다 )
		// Emp 설계도 이름이야
		System.out.println(emp);//kr.or.kosa.Emp@73a28541
		
		Car car = new Car();// import 자동으로 안됨? ctrl+shift+o
		// .이라는 연산자는 주소를 찾는 연산자다
		int door = car.getDoor();
		System.out.println(door);
		
		car.carName="pony";
		car.run();
		car.stop();
		
	}

}
