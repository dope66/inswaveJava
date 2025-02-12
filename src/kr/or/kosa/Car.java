package kr.or.kosa;

// class == 설계도 == 타입 (참조)
public class Car {
	
	
	private int door; // member field ..변수? (instance variable)
	private String carColor;
	public String carName;
	
	
	public int getDoor() {// method .. 기능, 행위 (먹다.간다.잔다.등등)
		return this.door; //캡슐화된 door의 값을 "간접"적으로 전달해 주는것이다.
	} // 이게 getter 함수 >> 읽기 전용
	
	public void setDoor(int door) { //method 기능, 행위 
		this.door = door;		//setter 함수 >> 쓰기전용 
	}
	
	public void run() {
		System.out.println("달린다");
	}
	public void stop() {
		System.out.println("멈춘다");
	}
}