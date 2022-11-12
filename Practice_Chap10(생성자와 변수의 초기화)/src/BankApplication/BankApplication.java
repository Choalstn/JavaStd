package BankApplication;

import java.util.Scanner;

public class BankApplication {
	
	//배열 100개 정적멤버로 되어있고, 배열임으로 한계가 있 (메모리 낭비, 정적이다.)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 > ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				createAccount();
				
			}
			else if (choice == 2) {
				
			}
			else if(choice == 3) {
				
			}
			else if(choice == 4) {
				
			}
			else if(choice == 5) {
				System.out.println("계좌 관리 프로그램을 종료합니다.");
				run = false;
			}
			else {
				System.out.println("잘못 입력");
			}
		}
	}
	
	public static void createAccount() {
		System.out.println("-------------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("-------------------");
		
		System.out.print("계좌 번호 : ");
		String ano = sc.next();
		
		System.out.print("계좌주 : ");
		String owner = sc.next();
		
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i =0; i<accountArray.length; i++) {
			 if(accountArray[i] == null) {
				 accountArray[i] = newAccount;
				 System.out.println("계좌가 생성되었습니다.");
				 //System.out.println(accountArray[i].getAno() + ", " + accountArray[i].getOwner() + ", " + accountArray[i].getBalance());
				 break;
				 
			 }
		}
		
		
	}

}
