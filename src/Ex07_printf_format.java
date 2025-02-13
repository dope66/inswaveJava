import java.util.Scanner;

public class Ex07_printf_format {

	public static void main(String[] args) {
//			System.out.println();
		
		System.out.println("A"); //출력 , 줄바꿈(엔터)
		System.out.println();
		System.out.println("B");
		int num = 1000;
		System.out.println(num);
		System.out.println("num 값은 " + num + "입니다");
		// format 형식 출력구문
		
		System.out.printf("num 값은 %d 입니다",num);
		System.out.println();
		System.out.printf("num 값은 [%d] 입니다. 또는 [%d] 있어요\n",num,12345);
		/**
		 * %d 10진수 형식의 정수
		 * %f 실수
		 * %s 문자열
		 * %c 문자
		 * \t 탭
		 * \n 줄바꿈
		 */
		float f= 3.14f;
		System.out.printf("f의 값은 %f 입니다 \n",f);
		
	//  Scanner
		Scanner sc = new Scanner(System.in);
//		
//		String value = sc.nextLine(); //입력하고 enter대기
//		System.out.println("value : " +value);
		
//		int number = sc.nextInt();
//		float number = sc.nextFloat();
		
		// 사용자가 입력한 값을 정수로 변환 return 하는 함수
		System.out.println();
		// 문제를 방지하기 위해서 nextLine() read , 변환
		// Today Point
		// [문자를] -> 숫자로 (정수, 실수 )
//		
//		String data = sc.nextLine();
//		int intData = Integer.parseInt(data);
//		System.out.println("intData : " + intData);
//		
//		float fData = Float.parseFloat(data);
		
		System.out.println("숫자를 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		System.out.printf("입력한 숫자는 %d",number);
		
	
	}

}
