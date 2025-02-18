import java.util.Scanner;

public class Ex11_RSP {
	public static void main(String[] args) {
		boolean youWin = false;
//      1>2>3>4
		System.out.println("가위바위보 게임을 시작합니다.");
		while (youWin != true) {
//			//			가위 = 1, 바위 = 2, 보 = 3
			double random = Math.random();
			random = (3 * random + 1); // 1 <= random < 4;
			Scanner sc = new Scanner(System.in);
			System.out.print("가위 : 1\t 바위:2\t 보:3\t  || 선택하세요");
			int myChoice = Integer.parseInt(sc.nextLine());
			int bot = (int) random;
			System.out.println("컴퓨터의 수 : " + bot);
			if (myChoice == bot) {
				System.out.println("비김");
			} else if ((myChoice - bot + 3) % 3 == 1)  {
				System.out.println("당신이 이겼씁니다.");
				youWin = true;
			} else {
				System.out.println("졌습니다.");
			}

		}

	}
}
