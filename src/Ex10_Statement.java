import java.util.Scanner;

public class Ex10_Statement {
	public static void main(String[] args) {
		// (while, do-while)
		int i = 10;
		while (i >= 10) {
			// while문은 반드시 증가감을 통해서
			// true, false의 조건을 제시해야한다.
			// --i;
			System.out.println(i);
			--i;
		}
		System.out.println("while을 사용해서 1~100까지 더해라 ");

		// while 1~100까지
		int j = 1;
		int sum = 0;
		while (j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);

		// while(1) 입력값 강제 메뉴
		// for(;;) for문의 무한루프

		int dan = 2;
		int gop = 1;

		while (dan <= 9) {
			while (gop <= 9) {
				System.out.printf("%d x %d = %d\t", dan, gop, dan * gop);
				gop++;
			}
			gop = 1;
			dan++;
			System.out.println();
		}

		// do ~while 일단 한번은 강제적으로 수행 .. 그리고 조건을 보고 판단.
		/*
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int inputData = 0;
		do {
			System.out.println("숫자 입력해 0~9");
			inputData = Integer.parseInt(sc.nextLine());
		} while (inputData >= 10); // while 조건ㅇ true면 계속
			System.out.println("당신이 입력한 숫자는 : "+inputData);

	}
}
