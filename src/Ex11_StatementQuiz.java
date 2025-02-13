import java.util.Scanner;

public class Ex11_StatementQuiz {
	public static void main(String[] args) {

//		//메뉴를 보여주고 사용자에 선택 ....
//		//원하시는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여 주세요
//				
//				//1.예금
//				//2.출금
//				//3.잔고
//				//4.종료
//				
//				
//				//잔액 변수를 생성 (balance)
//				//예금 처리  + 누적 (예금액을 받아서 누적 시켜라)
//				//출금 처리  - 누적 (예금액을 받아서 - 시켜라)
//				//잔고      balance  출력
//				//종료      프로그램 끝 (함수의 종료  , 프로그램의 강제 종료)
//	
//		
//		

		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int inputData = 0;
		do {
			System.out.println("원하시는 메뉴");
			System.out.print("1.예금	");
			System.out.print("2.출금	");
			System.out.print("3.잔고	");
			System.out.print("4.종료");

			inputData = Integer.parseInt(sc.nextLine());
			if (inputData == 1) {
				System.out.println("얼마를 예금 하시겠습니까?");
				int inputMoney = Integer.parseInt(sc.nextLine());
				balance += inputMoney;
				System.out.println(inputMoney + " 원을 예금 하셨습니다.");
			} else if (inputData == 2) {
				System.out.println("얼마를 출금하시겠습니까?");
				int outputMoney = Integer.parseInt(sc.nextLine());
				if (balance <= 0) {
					System.out.println("잔액 부족으로 출금 할 수 없습니다.");
				} else if (balance <= outputMoney) {
					System.out.println("잔액 부족으로 출금 할 수 없습니다.");

				} else {
					balance -= outputMoney;
					System.out.println(outputMoney + "원을 출금 하셨습니다.");
				}
			} else if (inputData == 3) {
				System.out.println("잔고는 : " + balance);
			}
		} while (inputData != 4);
		System.out.println("업무를 종료합니다.");
		
		
		
		boolean exit = false;
		for (char upper = 'A'; upper <= 'Z'; upper++) {
		    for (char lower = 'a'; lower <= 'z'; lower++) {
		        System.out.println(upper + "-" + lower);
		        if (lower == 'g') {
		            exit = true;
		            break;
		        }
		    }
		    if (exit) {
		        break;
		    }
		}
		
		/*
		 레이블(Label):
		 특정 루프에 이름을 붙여서, break 또는 continue와 함께 사용할 수 있습니다.
	     레이블을 사용하면 원하는 위치의 루프를 정확히 제어할 수 있습니다. 
    	 */
		Outter: for(char upper='A'; upper<='Z'; upper++) {
  			for(char lower='a'; lower<='z'; lower++) {
  					System.out.println(upper + "-" + lower);
  						if(lower=='g') {
  								break Outter;
  						}
  			}
		}
		System.out.println("프로그램 실행 종료");
		

		
		
		
	}
}
