package kr.or.kosa;
/*
 * 우리는 사원 정보 관리
 * 사원은 사번, 이름, 급여 갖고 있다.
 * 
 * Create table Emp(
 * empno number,
 * ename varchar20(20),
 *
 * )
 * */
public class Emp {
//	int empno;
//	String ename;
//	int sal;
	public int empno; // 속성 >> member field >> instance variable >> 객체변수
						// 객채변수는 초기화를 하지않아도 된다. 왜?why? >> default 값이 있으니까
						// Emp는 설계도다>> 구체화 해서 메모리에 올릴려면 ? >> new를 써야함
						// 생성되는 객체마다 (사원) 다른 사변을 가지기 때문에 초기화를 하지 않는다.
	
						/*
						 * Emp e1 = new Emp();
						 * e1.empno =~~;
						 * 
						 * Emp e2 = new Emp();
						 * Emp e3 = new Emp();
						 * 
						 * 메모리에 있는 Emp : Object, instance 라고함
						 * */	
	public void infoPrint() {
		int data; //local variable >> 지역변수인데 >> 사용시에는 문제가 생김 왜? 초기화를 안했잖음;
	}
}
// Emp 설계도 의미 있으려면 >> 구체화 = 메모리에 올라가야함. 방법은 뭐냐 ? new 연산자.