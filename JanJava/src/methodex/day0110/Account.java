package methodex.day0110;

import java.util.Scanner;

public class Account {

//	1. WhileEx3 -> oop에 맞게 바꿔보자
//	클래스 Account
//	변수 : balance int 잔액 (잔액은 음수가 될 수 없고 백만원을 넘을 수 없다.)
//	메서드
//	- deposit: int 예금 
//	- withdraw : int 출금
//	- getBalance : 잔액 조회 
	int balance = 0;

	void deposit(int money) { // deposit 메서드 안에 return이 없으므로, int가 아니라, void를 써야함.
		if (balance + money > 1000000) {
			System.out.println("최대 백만원까지만 예금할 수 있습니다.");
		} else {
			balance += money;
			System.out.println(money + "원이 입금되었습니다.");
		}
	}

	void withdraw(int money) {
		if (balance - money < 0) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance -= money;
			System.out.println(money + "원이 출금되었습니다.");
		}
	}

	int getBalance() {
		return balance;
	}

//	Scanner s = new Scanner(System.in);
//	int deposit(int balance) {
//		System.out.println("예금액 >");
//		int money = s.nextInt();
//		if(balance < 1000000 ) { 
//		balance += money;
//		return balance;
//		}
//	}
//	int withdraw(int balance) {
//		System.out.println("출금액 >");
//		int money = s.nextInt();
//		if((balance - money) >=0) {
//			balance -= money;
//			}
//		}
//	int getBalance(int balance) { 
//		return balance;
//		
//	}

	public static void main(String[] args) {
		Account account = new Account();
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("==============================");
			System.out.println("1.예금 | 2. 출금 | 3. 조회 | 4.종료");
			System.out.println("==============================");
			System.out.println("선택 > ");

			int menu = s.nextInt();

			if (menu == 1) {
				System.out.println("예금액>");
				int money = s.nextInt();
				account.deposit(money);
			} else if (menu == 2) {
				System.out.println("출금액 >");
				int money = s.nextInt();
				account.withdraw(money);
			} else if (menu == 3) {
				System.out.println("잔액>" + account.getBalance());

			} else {
				System.out.println("프로그램 종료");
				flag = false;
			}

		}
		s.close();

	}

}
