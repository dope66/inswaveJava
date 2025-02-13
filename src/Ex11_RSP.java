import java.util.Scanner;

public class Ex11_RSP {
	public static void main(String[] args) {
		boolean youWin = false;

		System.out.println("가위바위보 게임을 시작합니다.");
		while (youWin != true) {
			//			가위 = 1, 바위 = 2, 보 = 3
			double random = Math.random();
			random = (3 * random + 1); // 1 <= random < 4;
			Scanner sc = new Scanner(System.in);
			System.out.print("가위 : 1\t 바위:2\t 보:3\t  || 선택하세요");
			int myChoice = Integer.parseInt(sc.nextLine());
			int computer = (int) random;
			System.out.println("컴퓨터의 수 : " + computer);
			if ((myChoice == 2 && computer == 1) || (myChoice == 3 && computer == 2)
					|| (myChoice == 1 && computer == 3)) {
				System.out.println("당신이 이겼습니다");
				youWin = true;
				System.out.println("====게임을 종료합니다.=====");
			} else if (myChoice == computer) {
				System.out.println("컴퓨터와 비겼습니다.");
			} else {
				System.out.println("당신이 졌습니다.");
			}
		}
	}
}
