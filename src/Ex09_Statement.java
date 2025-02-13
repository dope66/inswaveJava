
public class Ex09_Statement {
	public static void main(String[] args) {
		/*
		 * 
		 * 제어문 종류 1. 조건문 : if(3가지), switch 2. 반복문 : for(반복 횟수가 명확),while(진위여부),do{강제실행}
		 * while() 3. 분기문 : break, continue(skip)
		 * 
		 */
		int count = 0;
		if (count < 1)
			System.out.println("true");
		char data = 'A';
		switch (data) {
		case 'A':
			System.out.println("같아요");
			break;
		case 'B':
			System.out.println("달라요");
			break;

		default:
			System.out.println("default");
		}
		// for 문
		// 1~100 합
		// 1. 전역변수
		// 2. 지역변수
		// 3. 제어문 안의 block variable
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		// 1~5까지
		// 제어문 없이
		sum = 5 * (1 + 5) / 2;// 왜한겨

		// 1~10
		sum = 0;
		for (int i = 1; i <= 10; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		// for 문에서 if 문 사용해서
		// 1~1000까지 짝수의함
		sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;

			}
		}
		System.out.println(sum);

		// for문 + 분기문 (continue,break);
		// 초급자 : continue , break.

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					break;
				}
				System.out.printf("%s", "*");
			}
			System.out.println();
		}

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					continue;
				}
				System.out.printf("%d x %d = %d\t", i, j, i * j);
			}
			System.out.println();
		}

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j < i; j++) {
				System.out.printf("%s", "*");
			}
			System.out.println();
		}

		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		// 피보나치
		// 맛보기 용
		int a = 0, b = 1, c = 0;
		for (int i = 0; i < 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.printf("%d*%d = %d\t",a,b,c);
			System.out.println("   " + c);
		}
	}
}
