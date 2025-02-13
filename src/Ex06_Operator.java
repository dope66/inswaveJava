
public class Ex06_Operator {

	public static void main(String[] args) {
		// 대입 연산자
		// += , -=, *=, /=

		int sum = 10;
		sum = sum + 10;
		sum += 10;
		/**
		 * if(조건식)
		 * 
		 * if().. if(조건식) else() if(조건식) else if() else()
		 * 
		 */
		int score = 94;
		String grade = ""; // 빈문자열로 초기화 A+ ,A-,B+,B-
		System.out.println("당신의 점수는 : " + score);
		if (score >= 90) {
			grade = "A";
			if (score >= 95)
				grade += "+";
			else {
				grade += "-";
			}
			// 삼항 연산자
//			grade=(score>=95)?(grade+="+"): (grade+="-");
//			System.out.println(grade);

		} else if (score >= 80) {
			grade = "B";
			if (score >= 85)
				grade += "+";
			else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75)
				grade += "+";
			else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("당신의 학점은 : " + grade);

		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print((int) i + " ");
		}
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		// 구구단( 행과 열 )
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				System.out.println(i+"x"+j+"="+i*j);
				System.out.printf("%dx%d=%d\t", i, j, i * j);

			}
			System.out.println();
		}

	}

}
