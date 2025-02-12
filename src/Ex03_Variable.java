import kr.or.kosa.Emp;

public class Ex03_Variable {
	public static void main(String[] args) {
		//  변수 선언
		int value;// 선언되었다. 초기화 되지 않았다.
		value = 100; // 할당(100으로 초기화 ) 되었다.
		
		int age =99; //선언과 할당을 동시에 
		
		// 초기화 정의 : 변수의 초기화 : 변수가 처음값을 갖는것 (할당을 통해서)
		
		int num;
		// System.out.println(num);//The local variable num may not have been initialized
		// local variable 지역변수 무조건 초기화를 통해서 값을 사용해야한다.
		// instance variable 전역변수
		
		num =100;
		System.out.println(num);
		
		Emp emp;
//		System.out.println(emp);  초기화를 해야함.
		emp = new Emp(); // new 연산자는 메모리에 올리는 작업 >> 객체를 초기화하는 작업이야>> 주소가 만들어지고 주소를 할당하니까 초기화라고 하는거다.
		System.out.println(emp);//kr.or.kosa.Emp@73a28541
		System.out.println(emp.empno);// 0 , default 값이나와
		emp.empno=2005;
		System.out.println(emp.empno);// 2005
		
		int a, b, c; // 같은 타입의 변수 나열 > 배열 (Array) > int[] a
		// 선언
		// 초기화를 해야해
		a = 100;
		b = 200;
		c = 300;
		
		//int num =100 ; 지역내에서 ( 함수 ) 같은 이름의 변수는 존재 할 수 없어 
		int result = a + b; // 초기화 
		System.out.println("result:" + result);
		int k = 100;
		int y = k;
		y=200;
		
		
		
		
		
		
	}

}
